import java.util.*;
public class MemberCheck{
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3){
        HashSet<String> set1 = new HashSet<>(Arrays.asList(club1));
        HashSet<String> set2 = new HashSet<>(Arrays.asList(club2));
        HashSet<String> set3 = new HashSet<>(Arrays.asList(club3));
        HashMap<String, Integer> record = new HashMap<String, Integer>();
        for (String name: set1){
            record.put(name,record.getOrDefault(name,0)+1);
        }
        for (String name: set2){
            record.put(name,record.getOrDefault(name,0)+1);
        }
        for (String name: set3){
            record.put(name,record.getOrDefault(name,0)+1);
        }
        HashSet<String> dishonest=new HashSet<>();
        for (String name:record.keySet()){
            if (record.get(name)>1){
                dishonest.add(name);
            }
        }
        String[] results = dishonest.toArray(new String[dishonest.size()]);
        Arrays.sort(results);
        return results;
    }
}