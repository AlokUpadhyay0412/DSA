import java.util.*;
public class missingCoinSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long ps=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]<=ps+1){
                ps+=arr[i];
            }

        }
        System.out.println(ps+1);
    }
}
