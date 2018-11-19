package de.exxcellent.challenge;

import de.exxcellent.challenge.analysis.Analyser;
import de.exxcellent.challenge.analysis.DataAnalyser;
import de.exxcellent.challenge.data.Processable;
import de.exxcellent.challenge.reader.CSVReader;
import de.exxcellent.challenge.reader.FileReader;

import java.util.ArrayList;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    public static void main(String... args) {

        // Your preparation code …
        Analyser myAnalyser = new DataAnalyser();
        FileReader myReader = new CSVReader();

        // Task 1
        String weatherFileName = "src/main/resources/de/exxcellent/challenge/weather.csv";
        String weatherIdLabel = "Day";
        String weatherArg1Label = "MxT";
        String weatherArg2Label = "MnT";

        ArrayList<Processable> weatherData;
        weatherData = myReader.read(weatherFileName, weatherIdLabel, weatherArg1Label, weatherArg2Label);

        String dayWithSmallestTempSpread = myAnalyser.findSmallestDiff(weatherData);    // Your day analysis function call …
        String teamWithSmallesGoalSpread = "A good team"; // Your goal analysis function call …

        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallesGoalSpread);
    }
}
