public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize){
        long space = 0;
        for (int fileSize : sizes){
            if (fileSize!=0){
                space += clusterSize*(fileSize/clusterSize);
                if (fileSize%clusterSize!=0){
                    space += clusterSize;
                }
            }
        }

        return space;
    }
}
