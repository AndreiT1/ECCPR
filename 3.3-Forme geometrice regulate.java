import java.util.*;
public class Teianu{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<Float> x=new ArrayList<Float>();
         ArrayList<Float> y=new ArrayList<Float>();
        
        for(int i=0;i<n;i++){
            String str=sc.nextLine(); 
            String []values=str.split("\\s+");
            x.add(Float.parseFloat(values[0]));
            y.add(Float.parseFloat(values[1]));
        }
        ArrayList<Double> distance=new ArrayList<Double>();
        for(int j=1;j<x.size();j++){
            double d= Math.sqrt(Math.pow((x.get(j-1) - x.get(j)),2) + Math.pow((y.get(j-1) - y.get(j)),2));
           
            distance.add(d);
        }
        double dist= Math.sqrt(Math.pow((x.get(0) - x.get(x.size()-1)),2) + Math.pow((y.get(0) - y.get(y.size()-1)),2));
        boolean bool=false;
        for(int k=1;k<distance.size();k++){
            if(Math.abs(1-dist/distance.get(k))<=0.0001){
                bool=true;
            }else {
                bool=false;
                break;
            }
        }
        if(bool){
             System.out.println("da");
        }else{
            System.out.println("nu");
        }
      
    
    }
}
