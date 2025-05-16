//package BaseConverter;
//
//import java.util.Scanner;
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            //Enter input Number base
//            System.out.println("=== Number Base Converter ===");
//            System.out.println("Choose input base:");
//            System.out.println("1. Binary (Base 2)");
//            System.out.println("2. Decimal (Base 10)");
//            System.out.println("3. Hexadecimal (Base 16)");
//            System.out.print("Your choice: ");
//            int inputBaseChoice = sc.nextInt();
//
//            //Check valid input
//            int inputBase = getBase(inputBaseChoice);
//            if (inputBase == -1) {
//                System.out.println("Invalid output base. Try again.\n");
//                continue;
//            }
//
//            //Enter Output Number base
//            System.out.println("Choose output base:");
//            System.out.println("1. Binary (Base 2)");
//            System.out.println("2. Decimal (Base 10)");
//            System.out.println("3. Hexadecimal (Base 16)");
//            System.out.print("Your choice: ");
//            int outputBaseChoice = sc.nextInt();
//
//            //Check valid input
//            int outputBase = getBase(outputBaseChoice);
//            if (outputBase == -1) {
//                System.out.println("Invalid output base. Try again.\n");
//                continue;
//            }
//
//            //Enter input value
//            System.out.print("Enter the input value: ");
//            sc.nextLine(); // Consume leftover newline
//            String inputValue = sc.nextLine();
//
//            BaseConverter baseConverter = new BaseConverter(outputBase,inputValue,inputBase);
//
//
//        }
//    }
//
//
//    public static int getBase(int choice){
//        switch(choice){
//            case 1: return 2;
//            case 2: return 10;
//            case 3: return 16;
//            default: return -1;
//        }
//    }
//}