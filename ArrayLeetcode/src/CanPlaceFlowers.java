// Leetcode 605. Can Place Flowers
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
//            checking if where we place flowers is 0 && check neighbors left and right if we can place over there
//            if first and last element, dont check neighbours as index will be outof bounds
            if(flowerbed[i] == 0 && (i ==0 || flowerbed[i-1] == 0) &&( i == flowerbed.length-1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                count++;
            }
            if(count >= n){
                return true;
            }
        }
        return false;
    }

}
