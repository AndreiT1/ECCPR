import java.util.ArrayList;
import java.util.Scanner;

public class Andrei {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> ns = new ArrayList<>();
        for (int i = 0; i < n * n; i++) {
            int t=sc.nextInt();
            ns.add(t);
        }
        
        for (int i = 0; i < k; i++) {
            int x =sc.nextInt();
            
            for(int j=0;j<ns.size();j++){
                if(ns.get(j).equals(x)){
                    ns.remove(ns.get(j));
                }
            }
            
            
        }
        int sum = 0;
        if (ns.isEmpty()) {
            System.out.println("BINGO!");
        } else {
            for (int i = 0; i < ns.size(); i++) {
                
                sum += 1;
            }
            System.out.println(sum);
        }

    }

}
