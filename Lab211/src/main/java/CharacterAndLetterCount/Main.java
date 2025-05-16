package CharacterAndLetterCount;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input string
        String enterString;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        enterString = scanner.nextLine();
        System.out.println(enterString);


        //Split string and count word
        String[] words = enterString.split("\\s+");
        int wordCount = 0;
        for (String word : words) {
            if(!word.isEmpty())
                wordCount++;
        }

        //Count word check exist
        System.out.println("Work count:" + wordCount);
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if(!word.isEmpty()){

                if(map.containsKey(word)){
                    int count = map.get(word);
                    map.put(word, count + 1);
                }else{
                    map.put(word, 1);
                }
            }
        }
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }

        //Count character
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i=0 ; i < enterString.length() ;i++ ){
            char word = enterString.charAt(i);
            if(word == ' ') continue;
            //Check hashmap contains word
            if(charCountMap.containsKey(word)){
               charCountMap.put(word, charCountMap.get(word)+1);
            }else{
                charCountMap.put(word, 1);
            }
        }

        //print char count
        for (char word : charCountMap.keySet()) {
            System.out.println(word + ": " + charCountMap.get(word));
        }
        scanner.close();
    }
}
