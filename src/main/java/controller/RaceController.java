package controller;

import model.CarRaceModel;
import model.InputModel;
import model.PrintModel;
import vo.CarVo;

import java.util.Map;
import java.util.HashMap;

public class RaceController {
    public void CarRaceStart () {
        CarVo carVo = new CarVo();
        carVo = InputModel.getInputCar(carVo);
        int inputRace = InputModel.getInputRace();
        for(int i = 0;  i < inputRace; i++) {
        //    carVo = CarRaceModel.RaceCar(carVo);
        }

        //PrintModel printModel = new PrintModel();
        //printModel.raceResult(carVo);
    }
}
