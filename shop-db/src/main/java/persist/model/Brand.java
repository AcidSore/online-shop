package persist.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "brands")
@Data
public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @OneToMany(
            mappedBy = "brand",
            cascade = CascadeType.ALL)
    private List<Product> products;

    public Brand() {
    }
}
