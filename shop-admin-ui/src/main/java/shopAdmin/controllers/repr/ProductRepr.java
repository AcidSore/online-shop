package shopAdmin.controllers.repr;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import persist.model.Brand;
import persist.model.Category;
import persist.model.Product;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductRepr implements Serializable {

    private Long id;

    private String name;

    private BigDecimal price;

    private Category category;

    private Brand brand;


    public ProductRepr() {
    }
    public ProductRepr(Product product) {
        this.id = product.getId();
        this.name = product.getTitle();
        this.price = product.getPrice();
        this.category = product.getCategory();
        this.brand = product.getBrand();
    }
}