import java.util.HashMap;
// look through this thingy!!!
public class BigWord {
    public String most(String[] sentences){
        HashMap<String, Integer> counts = new HashMap<>(); //!!!hashmap
        String biggest="";
        int highest=0;
        for (String sentence:sentences){
            String[] words = sentence.split(" ");
            for (String word:words){
                word = word.toLowerCase();
                if (counts.containsKey(word)){
                    counts.put(word, counts.get(word)+1);
                }
                else{
                    counts.put(word,1);
                }
                if (counts.get(word)>highest){
                    highest = counts.get(word);
                    biggest = word;
                }
            }
        }

        return biggest;
        
    }
    
}
