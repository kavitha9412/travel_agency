package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ListController {

    final TemperatureService temperatureService = new TemperatureService();

    @GetMapping("/api/temperature")
    public CountryTemerature getTemperature(@RequestParam String country){
        System.out.println("try");

        LocalDate date_j = LocalDate.now(); //Date jour j
        LocalDate date_j1 = LocalDate.now().minusDays(1); //Date jour j-1

        double temp_j = temperatureService.getTemperature(country); //Temperature jour j
        double temp_j1 = temperatureService.getTemperature(country); //Temperature jour j-1

        return new CountryTemerature(country, List.of(new DayTemperature(date_j.toString(),temp_j),new DayTemperature(date_j1.toString(),temp_j1)));
    }
}
