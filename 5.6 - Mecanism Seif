import java.util.*;

public class teianu{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String []numbers=line.trim().split("\\s+");
        int r=sc.nextInt();
        int []sens=new int[r];
        int []nrPoziti=new int[r];
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int k=0;k<6;k++){
            list.add(Integer.parseInt(numbers[k]));
            
        }
        sc.nextLine();
        int valueToRotate=0;
        for(int i=0;i<r;i++){
            String line2=sc.nextLine();
            String[] parts2=line2.trim().split("\\s+");
            sens[i]=Integer.parseInt(parts2[0]);
            nrPoziti[i]=Integer.parseInt(parts2[1]);
            if(sens[i]>0){
                valueToRotate+=nrPoziti[i];
            }else if(sens[i]<0){
                
                valueToRotate=valueToRotate-nrPoziti[i];
            }
            
        
        }
        
        
        System.out.println(list.get(valueToRotate));
        
        
    }
}
