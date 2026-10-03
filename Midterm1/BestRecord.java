import java.util.*;
public class BestRecord {
    public String best(String[] games){
        HashMap<String, Integer> recording = new HashMap<>();
        for (String game : games){
            String[] uList = game.split("-");
            int current1 = recording.getOrDefault(uList[0], 0);
            recording.put(uList[0],current1+1);
            int current2 = recording.getOrDefault(uList[1], 0);
            recording.put(uList[1],current2-1);
        }
        int maxRecord = 0;
        String maxUni = "";
        for (String uni:recording.keySet()){
            if (recording.get(uni)>maxRecord){
                maxRecord=recording.get(uni);
                maxUni=uni;
            }
        }
        return maxUni+":"+maxRecord;
    }
    
}
