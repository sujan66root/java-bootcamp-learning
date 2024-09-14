import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

//Leetcode 71: Simplify Path
public class SimplifyCanonicalPath {
    //    output should be /home/user/Pictures
    public static void main(String[] args) {
        String path = "/home/../..";
        Stack<String> stck = new Stack<>();
        String[] parts = path.split("/");
        System.out.println(Arrays.toString(parts));
        for (int i = 0; i < parts.length; i++) {
            if (!stck.isEmpty() && parts[i].equals("..")) stck.pop();
            else if (!parts[i].equals("") && !parts[i].equals(".")) {
                stck.push(parts[i]);
            }
        }
        if (stck.isEmpty()) System.out.println("/");
        StringBuilder sb = new StringBuilder();
        while (!stck.isEmpty()) {
            sb.insert(0, "/" + stck.pop());
        }
        if(sb.length() == 0){
            sb.append("/");
        }
        System.out.println(sb);
        if(sb.length() == 0){
            sb.append("/");
        };
    }
}


