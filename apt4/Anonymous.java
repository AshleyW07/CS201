import java.util.*;
public class Anonymous {
    public int howMany(String[] headlines, String[] messages){
        HashMap<Character, Integer> map = new HashMap<>();
        for (String headline:headlines){
            for (char a : headline.toCharArray()){
                if (a!=' '){
                    map.put(Character.toLowerCase(a), map.getOrDefault(Character.toLowerCase(a), 0)+1);
                }
            }
        }
        int cnt = 0;


        for (String message:messages){
            int[] checkList = new int[26];

            for (char b : message.toCharArray()){
                if (b!=' '){
                    checkList[Character.toLowerCase(b)-'a']+=1;
                }
            }
            boolean flag = true;

            for (int i=0;i<26;i++){
                char letter = (char) ('a'+i);
                if (map.getOrDefault(letter,0)<checkList[i]){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                cnt += 1;
            }
        }
        return cnt;
    }
    
}