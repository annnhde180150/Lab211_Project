package Week1.BaseConverter;

public class BaseConverter {
    private final int inputBaseNumber;
    private String inputValue;
    private final int outputBaseNumber;

    public BaseConverter(int inputBaseNumber, String inputValue, int outputBaseNumber) {
        this.inputBaseNumber = inputBaseNumber;
        this.inputValue = inputValue;
        this.outputBaseNumber = outputBaseNumber;
    }

    public String convertBaseNumber() {
        //Decimal to hexadecimal
        if(inputBaseNumber == 10 && outputBaseNumber== 16){
            StringBuilder hex = new StringBuilder();
            char[] hexDigits = "0123456789ABCDEF".toCharArray();
            int decimalNumber = Integer.parseInt(inputValue);
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 16;
                hex.insert(0, hexDigits[remainder]);
                decimalNumber /= 16;
            }
            return hex.toString();
        }
        //Hexadecimal to decimal
        if(inputBaseNumber == 16 && outputBaseNumber== 10){
            inputValue = inputValue.toUpperCase(); // To handle lowercase input
            int decimalValue = 0;
            int power = 1;
            for (int i = inputValue.length() - 1; i >= 0; i--) {
                char c = inputValue.charAt(i);
                int digit;

                if (c >= '0' && c <= '9') {
                    digit = c - '0';
                } else if (c >= 'A' && c <= 'F') {
                    digit = c - 'A' + 10;
                } else {
                    throw new IllegalArgumentException("Invalid hex digit: " + c);
                }
                decimalValue += digit * power;
                power *= 16;
            }
            return String.valueOf(decimalValue);
        }
        //Decimal to binary
        if(inputBaseNumber == 10 && outputBaseNumber== 2){
            int input = 0;
            //Check input value have character
            try
            {
                input = Integer.parseInt(inputValue); //Change input to integer
            }
            catch(NumberFormatException e){
                return null;
            }

           // update here
            StringBuilder binary = new StringBuilder();
            while(input>0){
                int remainder = input % 2;
                binary.insert(0, remainder);
                input /= 2;
            }
            return binary.toString();

        }

        //Binary to decimal
        if(inputBaseNumber == 2 && outputBaseNumber== 10){
            // Remove leading/trailing spaces and normalize
            inputValue = inputValue.trim();
            int decimal = binaryToDecimal(inputValue);
            return String.valueOf(decimal);
        }

        //Binary to Hexadecimal
        if(inputBaseNumber == 2 && outputBaseNumber== 16){
            // Remove leading/trailing spaces and normalize
            inputValue = inputValue.trim();

            // Pad binary with 0s on the left to make its length a multiple of 4
            int paddingLength = 4 - (inputValue.length() % 4);
            if (paddingLength != 4) {
                inputValue = "0".repeat(paddingLength) + inputValue;
            }

            //Change binary to hexadecimal
            StringBuilder hex = new StringBuilder();
            for (int i = 0; i < inputValue.length(); i += 4) {
                String fourBits = inputValue.substring(i, i + 4);
                int decimal = binaryToDecimal(fourBits);
                hex.append(decimalToHexChar(decimal));
            }

            return hex.toString();

        }
        return null;
    }

    private int binaryToDecimal(String bin) {
        int value = 0;
        int power = 1; // 2^0

        for (int i = bin.length() - 1; i >= 0; i--) {
            int bit = bin.charAt(i) - '0';
            value += bit * power;
            power *= 2;
        }

        return value;
    }

    private char decimalToHexChar(int value) {
        return (char) (value < 10 ? value + '0' : value - 10 + 'A');
    }

}
