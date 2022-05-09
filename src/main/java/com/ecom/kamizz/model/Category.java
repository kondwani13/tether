package com.ecom.kamizz.model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
    private @NotBlank String categoryName;

    private @NotBlank MysqlxDatatypes.Scalar.String description;

    @Column(name = "image_url")
    private @NotBlank String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MysqlxDatatypes.Scalar.String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(MysqlxDatatypes.Scalar.String categoryName) {
        this.categoryName = categoryName;
    }

    public MysqlxDatatypes.Scalar.String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MysqlxDatatypes.Scalar.String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
