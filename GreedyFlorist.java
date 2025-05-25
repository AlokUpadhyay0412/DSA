import java.util.*;
//A group of friends want to buy a bouquet of flowers.
// The florist wants to maximize his number of new customers and the money he makes.
// To do this, he decides he'll multiply the price of each flower by the number of that customer's
// previously purchased flowers plus 1.
// The first flower will be original price, (0+1)*original price, the next will be (1+1)*original price
// and so on.Given the size of the group of friends, the number of flowers they want to purchase and the 
// original prices of the flowers determine the minimum cost to purchase all the flowers. 
// The number of flowers they want equals the length of the C array.
public class GreedyFlorist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int cost[] = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(helper(cost, k));

    }

    private static int helper(int[] cost, int k) {
        Arrays.sort(cost);
        int n = cost.length;
        int totalCost = 0;
        int multiplier = 0;

        for (int i = n - 1; i >= 0; i--) {
            totalCost += (multiplier + 1) * cost[i];
            if ((n - 1 - i + 1) % k == 0) {
                multiplier++;
            }
        }
        return totalCost;
    }
}
