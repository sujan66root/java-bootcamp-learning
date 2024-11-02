//Leetcode Blind 75: Easy 1431: Kid with Greatest Number of Candies
import java.util.ArrayList;
import java.util.List;

public class KidGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = 0;
        for(int i = 0; i< candies.length; i++){
            maxValue = Math.max(maxValue, candies[i]);
        }
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i< candies.length; i++){
            if(candies[i] + extraCandies >= maxValue){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
