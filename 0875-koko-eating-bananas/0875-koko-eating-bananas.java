//The following codes pass all cases
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right =Arrays.stream(piles).max().getAsInt();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (calcuhrs(piles, mid) <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    private int calcuhrs(int[] piles, int speed) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / speed;
            if (piles[i] % speed > 0) hours++;
        }
        return hours;
    }
    
}