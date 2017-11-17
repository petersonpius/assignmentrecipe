package com.peter.recipe.assignmentrecipe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String desc;

    public String getUom() {
        return desc;
    }

    public void setUom(String uom) {
        this.desc = uom;
    }
}
