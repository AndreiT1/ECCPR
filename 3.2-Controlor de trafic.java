import java.util.*;
public class Andrei{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String numbers=sc.nextLine();
        String[] values=numbers.split("\\s+");
       ArrayList<Integer> al=new ArrayList<Integer>();
       for(int i=0;i<values.length;i++){
           al.add(Integer.parseInt(values[i]));
           
       }
       ArrayList<Integer> al2=new ArrayList<Integer>();
       for(int i=1;i<=n;i++){
           al2.add(i);
       }
       for(int j=0;j<al.size();j++){
           al2.remove(al.get(j));
       }
       int sum=0;
        for(int x=0;x<al2.size();x++){
            sum+=al2.get(x);
        }
        System.out.println(sum);
    }
}
