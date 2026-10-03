import java.util.ArrayList;

public class StringCuts{
    public String[] filter(String[] list, int minLength){
        ArrayList<String> output = new ArrayList<String>();
        for (String item : list){
            if (item.length()>= minLength && !output.contains(item)){ // dont forget the .contains() method!!
                output.add(item);
            }
        }
        String[] outputL = new String[output.size()];
        for (int i=0; i<output.size(); i++){
            outputL[i]=output.get(i);
        }
        return outputL;
    }
}