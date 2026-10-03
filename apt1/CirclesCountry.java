public class CirclesCountry {
    public boolean isInside(int x, int y, int cx, int cy, int r) {
        // be aware of the type of the variables
        double dx = x-cx;
        double dy = y-cy;
        double distSquared = dx * dx + dy * dy;
        double radSquared = r * r;
        return distSquared < radSquared;
    } 
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2){
        int cnt = 0;
        for (int i=0; i<x.length; i++){
            if (isInside(x1, y1, x[i], y[i], r[i])&& !isInside(x2, y2, x[i], y[i], r[i])
            || !isInside(x1, y1, x[i], y[i], r[i])&& isInside(x2, y2, x[i], y[i], r[i])){
                cnt += 1;
            }
        }
        return cnt;
    }
}
