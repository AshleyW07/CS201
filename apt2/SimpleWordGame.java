public class SimpleWordGame {
    public int points(String[] player, String[] dictionary){
        int score = 0;
        for (String word : dictionary){
            for (String remem : player){
                if (remem.equals(word)){
                    score += word.length()*word.length();
                    break;
                }
            }
        }
        return score;
    }
}
