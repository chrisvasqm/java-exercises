package org.exercises.polymorphism;

public class PDFExporter implements Exporter {
    @Override
    public void export(Document document) {
        System.out.println("Exporting " + document.getFileName() + " as .pdf...");
    }
}
