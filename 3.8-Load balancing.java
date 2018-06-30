import java.util.ArrayList;
import java.util.Scanner;

public class Teianu {
@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines=sc.nextInt();
        int packages = sc.nextInt();
        ArrayList<ArrayList> al = new ArrayList<>();
        for(int i=0;i<lines;i++){
            al.add(new ArrayList<Integer>());
        }
        int rest = packages % lines;
        int[][] matrice;
        for(int i=0;i<packages;i++){
            int t=i%lines;
            al.get(t).add(sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.get(i).size();j++){
                sb.append(al.get(i).get(j)).append(" ");
                
            }
            System.out.println(sb.toString().trim());
            sb.setLength(0);
        }
    }
    
}
