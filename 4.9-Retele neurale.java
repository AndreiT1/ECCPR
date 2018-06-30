import java.util.*;
public class Andrei{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String []parts=str.trim().split("\\s+");
        int m=Integer.parseInt(parts[0]);
        int n=Integer.parseInt(parts[1]);
        int p=Integer.parseInt(parts[2]);
        int v[][]=new int[m][n];
        int w[][]=new int[n][p];
        int x[]=new int[m];
        for (int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                v[i][j]=sc.nextInt();
            }
        }
        for(int k=0;k<n;k++){
            for(int t=0;t<p;t++){
                w[k][t]=sc.nextInt();
            }
        }
        for (int z=0;z<m;z++){
        x[z]=sc.nextInt();}
        int s[]=new int[n];
        int y[]=new int[p];
        for(int o=0;o<n;o++){
            for(int c=0;c<m;c++){
                s[o]+=x[c]*v[c][o];
                
            }
        }
        for(int q=0;q<p;q++){
            for(int e=0;e<n;e++){
                y[q]+=s[e]*w[e][q];
            }
        }
        int max=0;
        int index=0;
        for(int r=0;r<y.length;r++){
            if (y[r]>max){
                max=y[r];
                index=r;
            }
        }
        System.out.println(index+1);
        
        
    }
}
