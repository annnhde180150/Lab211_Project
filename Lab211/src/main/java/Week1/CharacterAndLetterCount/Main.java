package Week1.CharacterAndLetterCount; 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input string
        String enterString;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        enterString = scanner.nextLine();
        System.out.println(enterString);

        CharacterAndLetterCount characterAndLetterCount = new CharacterAndLetterCount(enterString);
        //Letter count
        System.out.println(characterAndLetterCount.letterCount());
        //Character count
        characterAndLetterCount.characterCount();
        scanner.close();
    }
}
