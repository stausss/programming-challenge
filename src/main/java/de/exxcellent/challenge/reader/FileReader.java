package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.data.Processable;
import java.util.ArrayList;

public interface FileReader {
    ArrayList<Processable> read(String fileName, String idLabel, String arg1Label, String arg2Label);
}
