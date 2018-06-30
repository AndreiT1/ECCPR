import java.util.*;
public class Andrei{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []r=new double[n];
        for (int i=0;i<n;i++){
            r[i]=sc.nextFloat();
            
        }
        double sum=0;
        for(int j=0;j<n;j++)
        sum+=r[j];
        double rn=sum/n ;
    
    double S=0;
    for (int i=0;i<n;i++){
        S+=(r[i]-rn)*(r[i]-rn);
        
    }
    double Sd=Math.sqrt(S/n);
    
    
    double Rminus=rn-Sd;
    double Rplus=rn+Sd;
    int count=0;
    for(int k=0;k<n;k++){
        if(r[k]>=Rminus && r[k]<=Rplus){
            count++;
        }
    }
    double procent=(double)count/(double)n *100;;
    System.out.println(procent);
    
    }
    
    
}
