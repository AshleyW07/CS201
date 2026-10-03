public class TxMsg{
    public String getMessage(String original){
        String[] originalL = original.split(" ");
        String[] outputL = new String[originalL.length];
        for (int i=0; i<originalL.length; i++){
            boolean allVowel = true;
            for (int j=0; j<originalL[i].length(); j++){
                char a = originalL[i].charAt(j);
                if (!(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')){
                    allVowel = false;
                    break;
                }
            }
            if (allVowel){
                outputL[i] = originalL[i];
            }
            else{
                String temp = "";
                for (int j=0; j<originalL[i].length(); j++){
                    char a = originalL[i].charAt(j);
                    if (!(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')){
                        if (j==0) temp += a;
                        else{
                            char prev = originalL[i].charAt(j-1);
                            if (prev=='a'||prev=='e'||prev=='i'||prev=='o'||prev=='u'){
                                temp += a;
                            }
                        }
                    }
                        
                }
                outputL[i] = temp;
            }
        }
        return String.join(" ", outputL);
    }
}
