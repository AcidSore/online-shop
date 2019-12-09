package shopAdmin.controllers.repr;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryRepr implements Serializable {
    private long id;

    private String title;

}
