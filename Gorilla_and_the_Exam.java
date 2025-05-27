import java.util.*;
public class Gorilla_and_the_Exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int chances=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(helper(chances,arr));
        }
    }
    private static int helper(int ch,int[]arr){
        if (ch>= arr.length) return 1;
        HashMap<Integer , Integer> mp=new HashMap<>();
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        List<Integer> list=new ArrayList<>(mp.values());
        Collections.sort(list);
        int j = 0;
        while (ch > 0 && j < list.size()) {
            if (list.get(j) > ch) {
                ch = 0;
            } else {
                ch -= list.get(j);
                list.set(j, 0);
            }
            j++;
        }

        int res=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>0)res++;
        }
        return res;
    }
}
