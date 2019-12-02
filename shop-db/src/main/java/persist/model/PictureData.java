package persist.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "picture_data")
@Data
public class PictureData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Lob@Type(type = "org.hibernate.type.blob")
    @Column(name = "data", nullable = false)
    private byte[] data;

    @OneToMany
    @JoinColumn(name = "product_id")
    private Product product;

    public PictureData() {
    }
}