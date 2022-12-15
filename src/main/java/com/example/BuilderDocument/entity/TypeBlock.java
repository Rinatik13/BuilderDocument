package com.example.BuilderDocument.entity;

public enum TypeBlock {

    Text(0),
    Table(1);

    private int typeBlockNumber;

    TypeBlock(int typeBlockNumber) {
        this.typeBlockNumber = typeBlockNumber;
    }

    public int getTypeBlockNumber() {
        return typeBlockNumber;
    }

    public void setTypeBlockNumber(int typeBlockNumber) {
        this.typeBlockNumber = typeBlockNumber;
    }
}
