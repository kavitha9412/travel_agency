package fr.lernejo.prediction;

import java.util.List;

public record CountryTemerature(String country, List<DayTemperature> temperatures) {
}
