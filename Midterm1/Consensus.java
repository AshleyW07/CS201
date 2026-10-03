public class Consensus {
    public String consensus(String[] words){
        int maxLen = words[0].length();
        String ansStr = "";
        for (int i=0;i<maxLen;i++){
            int[] tempAlpha = new int[26];
            for (String a:words){
                char character = a.charAt(i);
                tempAlpha[character-'a']+=1;
            }
            int maxIndex = 0;
            int maxCnt = 0;
            for (int j=0;j<26;j++){
                if (tempAlpha[j]>maxCnt){
                    maxCnt = tempAlpha[j];
                    maxIndex=j;
                }
            }
            char tempAdd = (char) ('a'+maxIndex);
            ansStr+=tempAdd;
        }
        return ansStr;
    }
    
}
