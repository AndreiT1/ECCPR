import java.util.*;
public class Andrei {
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        double []a =new double[n];
        double []b =new double[n];
        double []c =new double[n];
        ArrayList<Integer> index=new ArrayList<>();
        ArrayList<Double> raport=new ArrayList<>();
       //ArrayList<Triunghi> tr=new ArrayList<Triunghi>();
       for(int i=0;i<n;i++){
           String str=sc.nextLine();
           String[] splits=str.trim().split("\\s+");
           String lat1=splits[0];
           lat1=lat1.replace("<","");
           lat1=lat1.replace(">","");
           String lat2=splits[1];
           lat2=lat2.replace("<","");
           lat2=lat2.replace(">","");
           String lat3=splits[2];
           lat3=lat3.replace("<","");
           lat3=lat3.replace(">","");
           a[i]=Double.parseDouble(lat1);
           b[i]=Double.parseDouble(lat2);
           c[i]=Double.parseDouble(lat3);
           if(a[i]<b[i]+c[i] && b[i]<c[i]+a[i] && c[i]<a[i]+b[i]){
               if(a[i]!=b[i] && b[i]!=c[i] && c[i]!=a[i]){
                   
                   double ap=a[i]*a[i];
                   double bp=b[i]*b[i];
                   double cp=c[i]*c[i];
                   if(ap!=bp+cp && bp!=ap+cp && cp!=bp+ap){
                       double s=(a[i]+b[i]+c[i])/2;
                       double p=a[i]+b[i]+c[i];
                       double A=Math.sqrt(s*(s-a[i])*(s-b[i])*(s-c[i]));
                       double r=A/p;
                       index.add(i);
                       raport.add(r);
                      
                   }
               }
           }
           
           
       }
       
        double max=0;
            int ind=0;
         for(int k=0;k<raport.size();k++){
            
             if(raport.get(k)>max){
               max=raport.get(k);
                  ind=k;
            }
        }
           
       System.out.printf("%d %.3f",index.get(ind),max);
       
       
    }
    
    
}

    


