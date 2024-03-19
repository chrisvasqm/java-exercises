package org.exercises.polymorphism.exporters;

public class TextExporter implements Exporter {
    @Override
    public void export(Document document) {
        System.out.println("Exporting " + document.getFileName() + " .txt...");
    }
}
