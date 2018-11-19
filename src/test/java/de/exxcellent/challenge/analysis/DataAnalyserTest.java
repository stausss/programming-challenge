package de.exxcellent.challenge.analysis;

import de.exxcellent.challenge.data.FileData;
import de.exxcellent.challenge.data.Processable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DataAnalyserTest {

    private Analyser testAnalyser = new DataAnalyser();
    private ArrayList<Processable> analyseData = new ArrayList<>();

    @Before
    public void setUp() {
        Processable data1 = new FileData("1", 5, 3);
        Processable data2 = new FileData("2", 5, 4);
        ArrayList<Processable> analyseData = new ArrayList<>();
        analyseData.add(data1);
        analyseData.add(data2);
    }

    @Test
    public void findSmallestDiff() {
        Assert.assertEquals("2", testAnalyser.findSmallestDiff(analyseData));
    }
}