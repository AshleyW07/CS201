public class Common {
    public int count(String a, String b) {
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        for (int i = 0; i < a.length(); i++) {
            counts1[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            counts2[b.charAt(i) - 'a']++;
        }
        int total = 0;
        for (int i = 0; i < 26; i++) {
            total += Math.min(counts1[i], counts2[i]);
        }
        return total;
    }
}
