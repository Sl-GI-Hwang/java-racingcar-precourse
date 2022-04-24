package model;

import camp.nextstep.edu.missionutils.Console;
import vo.CarVo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputModel {
    public static CarVo getInputCar(CarVo carVo) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String racingCarName = Console.readLine();
        carVo = seperateCar(racingCarName, carVo);
        return carVo;
    }

    private static CarVo seperateCar(String input, CarVo carVo) {
        String[] array = input.split(",");
        List<String> carInfo = new ArrayList<String>();
        List<Integer> carScore = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++) {
            carInfo.add(array[i]);
            carScore.add(0);
        }
        carVo.setCarName(Arrays.asList(array));
        carVo.setCarScore(carScore);
        return carVo;
    }

    public static int getInputRace() {
        System.out.println("시도할 횟수는 몇회인가요?");
        String input = Console.readLine();
        int raceCicle = Integer.parseInt(input);
        System.out.println(raceCicle);
        return raceCicle;
    }

}
