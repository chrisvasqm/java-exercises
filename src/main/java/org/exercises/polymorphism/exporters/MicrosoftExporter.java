package org.exercises.polymorphism.exporters;

public class MicrosoftExporter implements Exporter {
    @Override
    public void export(Document document) {
        System.out.println("Exporting " + document.getFileName() + " .docx...");
    }
}
