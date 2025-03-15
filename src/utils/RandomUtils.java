package utils;

import java.util.Random;

public class RandomUtils {

    public RandomUtils(){}

    public Integer getRandomNumber(Integer size) {
        Random rand = new Random();

        if (size == null || size < 1 || size > 9) {
            throw new IllegalArgumentException("The size must be between 1 and 9");
        }

        int min = (int) Math.pow(10, size - 1);
        int max = (int) Math.pow(10, size) - 1;

        return rand.nextInt(max - min + 1) + min;
    }
}
