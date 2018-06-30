import java.util.*;
public class Andrei{
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Integer> v1=new ArrayList<Integer>();
        ArrayList<Integer> v2=new ArrayList<Integer>();
        int[][] imag=new int[m][n];
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++){
            
            imag[i][j]=sc.nextInt();
            v1.add(imag[i][j]);
        }
        
    
     Collections.sort(v1);   
     //System.out.println(Arrays.toString(v1.toArray()));
    HashSet<Integer> uniqueValues = new HashSet<>(v1);
     //int occurrences = Collections.frequency(animals, "bat");
     Iterator it=uniqueValues.iterator();
     while(it.hasNext()){
         int c=(Integer)it.next();
         //System.out.println(c);
          int occurrences = Collections.frequency(v1, c); // find occurence of elements within collection
          v2.add(c);
          v2.add(occurrences);
     }
    // uniqueValues.forEach(System.out::println);
    // System.out.println(Arrays.toString(v1.toArray()));
 
    System.out.println(v1.size()-v2.size());
    }
}

