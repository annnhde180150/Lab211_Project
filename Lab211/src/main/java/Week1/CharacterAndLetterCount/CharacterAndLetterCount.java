package Week1.CharacterAndLetterCount;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CharacterAndLetterCount {
    private String input;
    public CharacterAndLetterCount(String input) {
        this.input = input;
    }

    public Map<String, Integer> letterCount(){
        //Split string and count word
        Map<String, Integer> kq = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {

            String word = tokenizer.nextToken();
            kq.put(word, kq.getOrDefault(word, kq.getOrDefault(word,0)) + 1);

        }
        return kq;


    }

    public void characterCount(){
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
