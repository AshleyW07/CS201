public class Starter {
    public int begins(String[] words, String first){
        int cnt = 0;
        for (int i=0; i<words.length; i++){
            if (words[i].startsWith(first)){
                boolean found = false;
                for (int j=0; j<i; j++){  //!!! here it shouldn't be <words.length
                    if (words[i].equals(words[j])){
                        found = true;
                    }
                }
                if (found == false){
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
    
}
