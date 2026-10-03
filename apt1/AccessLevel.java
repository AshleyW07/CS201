public class AccessLevel{
    public String canAccess(int[] rights, int minPermission){
        String output = "";
        for (int i=0; i<rights.length; i++){
            if (rights[i]<minPermission){
                output += "D";
            }
            else{
                output += "A";
            }
        }
        return output;
    }
}