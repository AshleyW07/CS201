public class CounterAttack {
    public int[] analyze(String str, String[] words){
        int[] output = new int[words.length];  // java autofill primitive list with 0;
        // (arrays).length; (strings).length(); (arraylist).size()
        String[] strList = str.split(" ");
        for (int i=0; i<words.length; i++){
            for (String item : strList){
                if (item.equals(words[i])){
                    output[i] += 1;
                }
            }
        }
        return output;
    }
}
