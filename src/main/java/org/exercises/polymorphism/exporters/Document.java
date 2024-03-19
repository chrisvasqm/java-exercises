package org.exercises.polymorphism.exporters;

public class Document {
    private String fileName;
    public Document(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
