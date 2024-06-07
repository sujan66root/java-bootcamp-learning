// Power of a Number
public class Power {
    public int calc(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp > 0) {
            return base * calc(base, exp - 1);
        }else{
            return -1;
        }
    }
}
