package com.ghbt.ghbt_starbucks.product.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ghbt.ghbt_starbucks.category.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@JsonAutoDetect
@NoArgsConstructor
public class RequestProduct {

    private String name;

    private Integer price;

    private String description;

    private List<Category> categoryList;

}
