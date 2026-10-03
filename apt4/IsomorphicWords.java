import java.util.*;
public class IsomorphicWords {
    public int countPairs(String[] words){
        int cnt = 0;
        for (int i=0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (isPair(words[i], words[j])) {
                    cnt+=1;
                }
            }
        }
        return cnt;
    }
    public boolean isPair(String a, String b){
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Character> hash1 = new HashMap<>();
        HashMap<Character, Character> hash2 = new HashMap<>();
        for (int i=0;i<a.length();i++){
            char charA=a.charAt(i);
            char charB=b.charAt(i);
            if (hash1.containsKey(charA)&&hash1.get(charA)!=charB){
                return false;
            }
            if (hash2.containsKey(charB)&&hash2.get(charB)!=charA){
                return false;
            }
            hash1.put(charA, charB);
            hash2.put(charB, charA);
        }
        return true;
    }
    
}


