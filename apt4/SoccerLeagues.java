public class SoccerLeagues {
    public int[] points(String[] matches){
        int[] points = new int[matches.length];
        for (int i=0;i<matches.length;i++){
            int cnt = 0;
            for (char a : matches[i].toCharArray()){
                if (a=='W') cnt += 3;
                else if(a=='D') cnt += 1;
            }
            for (int j=0;j<matches.length;j++){
                if (j!=i){
                    char temp = matches[j].toCharArray()[i];
                    if (temp=='L') cnt += 3;
                    else if (temp=='D') cnt += 1;
                }
            }
            points[i]=cnt;
        }
        return points;
    }
    
}
