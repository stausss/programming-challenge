package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.data.FileData;
import de.exxcellent.challenge.data.Processable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CSVReaderTest {

    private FileReader testReader = new CSVReader();
    private ArrayList<Processable> testData = new ArrayList<>();

    @Before
    public void setUp() {
        String fileName = "src/main/resources/de/exxcellent/challenge/weather.csv";
        String idLabel = "Day";
        String arg1Label = "MxT";
        String arg2Label = "MnT";
        testData = testReader.read(fileName, idLabel, arg1Label, arg2Label);
    }

    @Test
    public void printLoadedWeatherData() {
        Assert.assertEquals(30, testData.size());
    }
}