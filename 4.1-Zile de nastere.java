
import java.util.*;
public class Andrei{
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       sc.nextLine();
       String str;
       ArrayList<ZiNastere> aList=new ArrayList<ZiNastere>();
       for(int i=0;i<n;i++){
           str=sc.next().toString().trim();
           String []parts=str.split("-");
           String zi=parts[0];
           String luna=parts[1];
           boolean t=true;
           for(int z=0;z<aList.size();z++){
               ZiNastere c=aList.get(z);
               if(zi.equals(c.zi) && luna.equals(c.luna)){
                   t = false;
               }
               
           }
           if(t==true){
           aList.add(new ZiNastere(zi,luna));
           }
           
       }
       
       Collections.sort(aList, Comparator.comparing(ZiNastere::getLuna).thenComparing(ZiNastere::getZi));
       for(int i=0;i<aList.size();i++){
           ZiNastere c=aList.get(i);
           System.out.println(c.toString());
           
           
       }
      
    }
}
class ZiNastere{
    String zi;
    String luna;
    
    ZiNastere(String zi,String luna){
        this.zi=zi;
        this.luna=luna;
    }
    @Override
    public String toString(){
        return this.zi + "-" + this.luna;
    }
    
    
    public String getZi(){
        return this.zi;
    }
    public String getLuna(){
        return this.luna;
    }
}
