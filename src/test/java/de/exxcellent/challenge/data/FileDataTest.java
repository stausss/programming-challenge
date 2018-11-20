package de.exxcellent.challenge.data;

import org.junit.Assert;
import org.junit.Test;

public class FileDataTest {
    private Processable testData = new FileData("1", 3, 5);

    @Test
    public void calcDiff() {
        Assert.assertEquals(testData.calcDiff(), 2);
    }

    @Test
    public void getId() {
        Assert.assertEquals( "1", testData.getId());
    }
}
