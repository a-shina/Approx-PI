package edu.gcccd.csis;

import java.util.Random;

public class ApproximatePI {
    public static void main(String[] args) {
        System.out.println(value());
    }

    public static float value() {
        float sqPoints = 0;
        float cirPoints = 0;
        final double MIN_PI = 3.1415910;
        final double MAX_PI = 3.1415899;

        Random rd = new Random();
        float PI;

        while (true) {
            float x = rd.nextFloat();
            float y = rd.nextFloat();
            float coordinate = x * x + y * y;
            sqPoints++;

            if (coordinate < 1) {
                cirPoints++;
            }
            float ratio = cirPoints / sqPoints;
            PI = ratio * 4;
            if (PI <= MIN_PI && PI >= MAX_PI) {
                break;
            }
        }
        return PI;
    }
}

