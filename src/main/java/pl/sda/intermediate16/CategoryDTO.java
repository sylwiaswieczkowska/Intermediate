package pl.sda.intermediate16;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryDTO {

    private Integer id;
    private Integer parentId;
    private String categoryName;
    private CategoryState categoryState;
    private CategoryDTO parentCat;

}
