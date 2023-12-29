package com.uccwal.naratracerserver.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "field_keyword")
public class FieldKeyword {

    @EmbeddedId
    private FieldKeywordId id;

    private String name;


    public FieldKeywordId getId() {
        return id;
    }

    public void setId(FieldKeywordId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FieldKeyword{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
