package com.example.BuilderDocument.entity;

public enum TypeElement {
    CompanyFullName("companyFullName"),
    CompanySizeName("companySizeName"),
    CompanyAddress("companyAddress"),
    CompanyMailAddress("CompanyMailAddress"),
    CompanyTelephone("CompanyTelephone"),
    CompanyInn("CompanyInn"),
    Text("Text"), Table("Table");

    private String type;

    TypeElement(String type) {
        this.type = type;
    }

}
