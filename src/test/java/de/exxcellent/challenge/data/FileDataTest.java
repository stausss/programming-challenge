package de.exxcellent.challenge.data;

import org.junit.Assert;
import org.junit.Test;

public class FileDataTest {

    private Processable testData = new FileData("1", 5, 3);

    @Test
    public void calcDiff() {
        Assert.assertEquals(testData.calcDiff(),2);
    }

    @Test
    public void getId() {
        Assert.assertEquals(testData.getId(), "1");
    }
}