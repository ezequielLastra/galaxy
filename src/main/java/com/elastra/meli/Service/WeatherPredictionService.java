package com.elastra.meli.Service;

import com.elastra.meli.Model.PlanetPosition;
import com.elastra.meli.Model.WeatherPrediction;

import java.util.List;

public interface WeatherPredictionService {

    WeatherPrediction findPredictionByDay(Long day)throws Exception;
    List<WeatherPrediction> presistPredictions(List<WeatherPrediction> list);
    WeatherPrediction generateWeatherPrediction(PlanetPosition pp1, PlanetPosition pp2, PlanetPosition pp3, long day);
    String calculateAndPesistPredictions(int years);
    List<WeatherPrediction> getPredictions();
    String cleanPredictions();

}
