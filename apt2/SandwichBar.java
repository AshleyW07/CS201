public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        for (int i=0; i<orders.length; i++){
            String want = orders[i];
            String[] wantList = want.split(" ");;
            boolean canMake = true;

            for (String iwant : wantList){
                boolean found = false;
                for (String check : available){
                    if (check.equals(iwant)){
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    canMake = false;
                    break;
                }
            }
            if (canMake == true){
                return i; 
            }
        }
        return -1;
    }
}
