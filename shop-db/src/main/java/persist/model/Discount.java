package persist.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "discounts")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @OneToMany(
            mappedBy = "discount",
            cascade = CascadeType.ALL)
    private List<Product> products;

    public Discount() {
    }
}
