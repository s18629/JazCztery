package com.example.JazCztery;

public class Model {
    private int id;
    private String modelName;

    public Model(int id, String modelName) {
        this.id = id;
        this.modelName = modelName;
    }

    public int getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }
}
