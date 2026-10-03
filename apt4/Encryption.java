public class Encryption{
    public String encrypt(String message){
        char current = 'a';
        String ret = "";
        int[] coding = new int[300];
        for (char ch:message.toCharArray()){
            if (coding[ch]==0){
                coding[ch] = current;
                current += 1;
            }
            ret += (char) coding[ch];
        }
        return ret;
    }
}