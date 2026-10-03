public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc){
        String returnS = "";
        int occur = 0;
        for (String a:strands){
            int tempOccur = 0;
            for (int i=0; i<a.length(); i++){
                if (a.charAt(i)==nuc.charAt(0)){
                    tempOccur += 1;
                }
            }
            if (tempOccur > occur){
                returnS = a;
                occur = tempOccur;
            }
            else if (tempOccur == occur && tempOccur > 0 && a.length()>returnS.length()){
                returnS = a;
                occur = tempOccur;
            }
        }
        return returnS;
    }
}
