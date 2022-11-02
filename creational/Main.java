package creational;

public class Main {

    public static void main(String[] args) {

        BookMetadataExporter exporter = new CSVBookMetadataExporter();
        // BookMetadataExporter exporter = new JSONBookMetadataExporter();
        // BookMetadataExporter exporter = new XMLBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.add(TestData.cleanArchBook);
        exporter.add(TestData.dinosaurBook);
        exporter.add(TestData.dragonBook);
        exporter.export(System.out);
    }
}