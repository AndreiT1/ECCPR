import java.util.*;

public class Andrei{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int m=sc.nextInt();
        int n=sc.nextInt();
        int s=sc.nextInt();
        sc.nextLine();
        int [][]rgb=new int[n*m][3];
        for( int i=0 ; i<n*m;i++){
            String line=sc.nextLine();
            String []parts=line.trim().split("\\s+");
            rgb[i][0]=Integer.parseInt(parts[0]);
            rgb[i][1]=Integer.parseInt(parts[1]);
            rgb[i][2]=Integer.parseInt(parts[2]);

        }
        
        
        for(int j=0;j<n*m;j++){
            for(int k=0;k<3;k++){
               for(int t=0;t<s;t++){
                   if((rgb[j][k] > (t*256)/s) && (rgb[j][k] <= (t+1)*256/s))
                   rgb[j][k]=t;
                   
                   
               }
              System.out.print(rgb[j][k] + " ");
            }
            System.out.println();
        }
        
    }
}
