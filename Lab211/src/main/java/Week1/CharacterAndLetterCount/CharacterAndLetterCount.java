package Week1.CharacterAndLetterCount;

import java.util.HashMap;

public class CharacterAndLetterCount {
    private String input;
    public CharacterAndLetterCount(String input) {
        this.input = input;
    }

    public void letterCount(String input){
        //Split string and count word
        String[] words = input.split("\\s+");
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
    }

    public void characterCount(String input){
        //Count character
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i=0 ; i < input.length() ;i++ ){
            char word = input.charAt(i);
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
    }
}
