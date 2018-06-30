import java.util.*;
public class Teianu{
    
    
    public static int median(int a,int b,int c,int d, int e){
        int[] medianValues=new int[5];
        medianValues[0]=a;
        medianValues[1]=b;
        medianValues[2]=c;
        medianValues[3]=d;
        medianValues[4]=e;
         Arrays.sort(medianValues);
         return medianValues[2];
       
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        
        int [][]matrix=new int[n+2][m+2];
      
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
              
              
                    matrix[i][j] = sc.nextInt();
                }
                
            }
            for(int l=1;l<n+1;l++){
                for(int c=1;c<m+1;c++){
                    System.out.println(median(matrix[l-1][c],matrix[l][c-1],matrix[l][c],matrix[l+1][c],matrix[l][c+1]));
                }
            }
                
            }
            
        }
        
    
    
