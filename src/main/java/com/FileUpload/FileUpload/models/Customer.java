package com.FileUpload.FileUpload.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

public @Data @AllArgsConstructor class Customer {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "contactNumbers")
    private String contactNumbers;

    @Column(name = "contactAddress")
    private String contactAddress;
}
