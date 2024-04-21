package org.exercises.polymorphism.project_1;

public class MicrosoftWordExporter implements Exporter {
    @Override
    public void export(Document document) {
        System.out.println("Exporting " + document.getFileName() + " as a Word...");
    }
}
