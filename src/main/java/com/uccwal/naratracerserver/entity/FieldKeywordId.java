package com.uccwal.naratracerserver.entity;

import java.io.Serializable;
import java.util.Objects;

public class FieldKeywordId implements Serializable {
    private String field;
    private String keyword;

    // 기본 생성자
    public FieldKeywordId() {
    }


    public FieldKeywordId(String field, String keyword) {
        this.field = field;
        this.keyword = keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldKeywordId that = (FieldKeywordId) o;
        return Objects.equals(field, that.field) && Objects.equals(keyword, that.keyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, keyword);
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "FieldKeywordId{" +
                "field='" + field + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
