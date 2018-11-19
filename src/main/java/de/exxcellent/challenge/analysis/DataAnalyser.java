package de.exxcellent.challenge.analysis;

import de.exxcellent.challenge.data.Processable;

import java.util.ArrayList;
import java.util.Collections;

public class DataAnalyser implements Analyser {

    public DataAnalyser() {
    }

    @Override
    public String findSmallestDiff(ArrayList<Processable> analyseData) {

        ArrayList<Integer> diffs = new ArrayList<>();

        for (Processable data: analyseData) {
            diffs.add(data.calcDiff());
        }

        int minIndex = diffs.indexOf(Collections.min(diffs));

        return analyseData.get(minIndex).getId();
    }
}
