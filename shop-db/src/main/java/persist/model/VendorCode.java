package persist.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "vendor_codes")
@Data
public class VendorCode  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @OneToMany(
            mappedBy = "vendor_code",
            cascade = CascadeType.ALL)
    private List<Product> products;

    public VendorCode() {

    }
}
