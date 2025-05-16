package BaseConverter;

import java.util.Scanner;

public class BaseConverter {
    private int inputBaseNumber;
    private String inputvalue;
    private int outputBaseNumber;

    public BaseConverter(int inputBaseNumber, String inputvalue, int outputBaseNumber) {
        this.inputBaseNumber = inputBaseNumber;
        this.inputvalue = inputvalue;
        this.outputBaseNumber = outputBaseNumber;
    }

    public String convertBaseNumber(int inputBaseNumber, String inputvalue,int outputBaseNumber) {
        return null;
    }

    private int convertToDecimal(String input, int base) {
        int result = 0;
        int power = 1;

        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            int value = charToValue(ch);
            result += value * power;
            power *= base;
        }
        return result;
    }
}
