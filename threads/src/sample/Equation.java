package sample;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Equation {
    public static boolean calc(double x, double y){

        if (pow(x, 2.0) / 49.0 + pow(y, 2.0) / 9.0 - 1.0 <= 0 && abs(x) >= 4.0 && -(3.0 * sqrt(33.0)) / 7.0 <= y && y <= 0) {
            return true;
        }
        if (pow(x, 2.0) / 49.0 + pow(y, 2.0) / 9.0 - 1.0 <= 0 && abs(x) >= 3.0 && -(3.0 * sqrt(33.0)) / 7.0 <= y && y >= 0) {
            return true;
        }
        if (-3.0 <= y
                && y <= 0
                && -4.0 <= x
                && x <= 4.0
                && (abs(x)) / 2.0 + sqrt(1.0 - pow(abs(abs(x) - 2.0) - 1.0, 2.0)) - 1.0 / 112.0 * (3.0 * sqrt(33.0) - 7.0)
                * pow(x, 2.0) - y - 3.0 <= 0) {
            return true;
        }

        if (y >= 0 && 3.0 / 4.0 <= abs(x) && abs(x) <= 1.0 && -8.0 * abs(x) - y + 9.0 >= 0) {
            return true;
        }

        if (1.0 / 2.0 <= abs(x) && abs(x) <= 3.0 / 4.0 && 3.0 * abs(x) - y + 3.0 / 4.0 >= 0 && y >= 0) {
            return true;
        }

        if (abs(x) <= 1.0 / 2.0 && y >= 0 && 9.0 / 4.0 - y >= 0) {
            return true;
        }

        if (abs(x) >= 1.0
                && y >= 0
                && -(abs(x)) / 2.0 - 3.0 / 7.0 * sqrt(10.0) * sqrt(4.0 - pow(abs(x) - 1.0, 2.0)) - y + (6.0 * sqrt(10.0)) / 7.0
                + 3.0 / 2.0 >= 0) {
            return true;
        }
        return false;
    }
}
