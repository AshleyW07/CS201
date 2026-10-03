// hardhard
public class PrefixCode {
    public String isOne(String[] words){
        String output = "Yes";
        if (words.length==1){
            return output;
        }
        else{
            for (int i=0;i<words.length;i++){
                for (int j=0;j<words.length;j++){
                    if (words[j].length()>words[i].length() && i!=j){
                        if (words[i].equals(words[j].substring(0, words[i].length()))){
                            output = "No, "+i;
                            return output;
                        }
                    }
                }
            }
        }
        return output;
    }
    
}
