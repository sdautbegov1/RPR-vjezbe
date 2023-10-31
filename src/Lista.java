
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import  java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args){
        List<Double> l = new ArrayList<Double>();
        Scanner ulaz = new Scanner(System.in);

        while(true){
            String s = ulaz.nextLine();

            if(s.equals("stop")) {
                break;
            }
            double num = Double.parseDouble(s);
            l.add(num);
        }
        if(l.isEmpty()){
            System.out.println("Prazna lista");
        }else{
            //double min = Collection.min(l);
            //double max = Collection.max(l);
            double x = 0;
            for(Double num : l){
                x += num;
            }
            x /= l.size();
            double sum = 0;
            for(Double num : l){
                sum += (num-x)*(num-x);
            }
            double std = Math.sqrt(sum/l.size());

        }
    }
}
