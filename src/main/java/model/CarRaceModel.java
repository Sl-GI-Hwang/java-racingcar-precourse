package model;

import camp.nextstep.edu.missionutils.Randoms;
import vo.CarVo;

import java.util.ArrayList;
import java.util.List;

public class CarRaceModel {

    public static CarVo RaceCar(CarVo carVo) {
        int raceScore = 0, setWinner = 0;
        List<Integer> setRaceScore = new ArrayList<Integer>();
        for(int i = 0; i < carVo.getCarName().size(); i++) {
            raceScore = makeRace();
            setWinner = judgeToWin(raceScore);
            carVo.getCarScore().add(i, carVo.getCarScore().get(i) + setWinner);
        }
        return carVo;
    }

    private static int judgeToWin(int raceScore) {
        int[] setWinner = {};
        if(raceScore >= 4) {
            return 1;
        }
        return 0;
    }

    private static int makeRace() {
        int getRace = Randoms.pickNumberInRange(1, 9);
        return getRace;
    }


}
