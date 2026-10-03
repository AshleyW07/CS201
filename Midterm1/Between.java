public class Between {
    public String[] sandwiched(String[] words, int low, int high){
        String[] ret = new String[words.length];
        int index=0;
        for (String a : words){
            if (a.length()>=low &&a.length()<=high){
                ret[index]=a;
                index += 1;
            }
        }
        String[] ret1 = new String[index];
        for(int i=0;i<index;i++){
            ret1[i]=ret[i];
        }
        return ret1;
    }    
}
