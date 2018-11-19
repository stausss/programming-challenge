package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.data.FileData;
import de.exxcellent.challenge.data.Processable;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class CSVReader implements FileReader {

    public CSVReader() {
    }

    @Override
    public ArrayList<Processable> read(String fileName, String idLabel, String arg1Label, String arg2Label) {

        ArrayList<Processable> loadedFileData = new ArrayList<>();

        try {
            Reader in = new java.io.FileReader(fileName);
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);

            for (CSVRecord record : records) {

                String id = record.get(idLabel);
                int arg1 = Integer.parseInt(record.get(arg1Label));
                int arg2 = Integer.parseInt(record.get(arg2Label));

                FileData data = new FileData(id, arg1, arg2);
                loadedFileData.add(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return loadedFileData;
    }
}
