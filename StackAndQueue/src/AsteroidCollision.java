import java.util.Stack;

// Leetcode 735. Asteroid Collision
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        System.out.println(asteroidCollision(asteroids));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            boolean destroyed = false;
            while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroids[i]) {
                    stack.pop(); // The right-moving asteroid is smaller and gets destroyed
                    continue;    // Continue checking for further collisions
                } else if (stack.peek() == -asteroids[i]) {
                    stack.pop();
                }
                destroyed = true;
                break;
            }
            // If the current asteroid is not destroyed, add it to the stack
            if (!destroyed) {
                stack.push(asteroids[i]);
            }
        }
//        change stack into an array and return it
        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        return result;
    }
}
