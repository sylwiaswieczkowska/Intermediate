package pl.sda.intermediate16;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {

    private Integer id;
    private Integer parentId;
    private String categoryName;

}
