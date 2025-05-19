package Week1.BaseConverter;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choice = true;
        while (choice) {
            //Enter input Number base
            System.out.println("=== Number Base Converter ===");
            System.out.println("Choose input base:");
            System.out.println("1. Binary (Base 2)");
            System.out.println("2. Decimal (Base 10)");
            System.out.println("3. Hexadecimal (Base 16)");
            System.out.print("Your choice: ");
            int inputBaseChoice = sc.nextInt();

            //Check valid input
            int inputBase = getBase(inputBaseChoice);
            if (inputBase == -1) {
                System.out.println("Invalid output base. Try again.\n");
                continue;
            }

            //Enter Output Number base
            System.out.println("Choose output base:");
            System.out.println("1. Binary (Base 2)");
            System.out.println("2. Decimal (Base 10)");
            System.out.println("3. Hexadecimal (Base 16)");
            System.out.print("Your choice: ");
            int outputBaseChoice = sc.nextInt();

            //Check valid input
            int outputBase = getBase(outputBaseChoice);
            if (outputBase == -1) {
                System.out.println("Invalid output base. Try again.\n");
                continue;
            }

            //Enter input value
            System.out.print("Enter the input value: ");
            sc.nextLine(); // Consume leftover newline
            String inputValue = sc.nextLine();
            BaseConverter baseConverter = new BaseConverter(inputBase,inputValue,outputBase);
            String outputValue = baseConverter.convertBaseNumber();
            if (outputValue == null) {
                System.out.println("Invalid input value. Try again");
            }else{
                System.out.println("Out put value:"+outputValue);
            }
            boolean IsContinute = true;
            while (IsContinute){
                System.out.println("Do you want to continue? (Y/N):");
                String exit = sc.nextLine();
                if (exit.equalsIgnoreCase("y")){
                    System.out.println("Thank you!");
                    IsContinute = false;
                    choice = false;
                }
                else
                {
                    System.out.println("Invalid input. Try again");
                }
            }


        }
    }


    public static int getBase(int choice){
        switch(choice){
            case 1: return 2;
            case 2: return 10;
            case 3: return 16;
            default: return -1;
        }
    }
}