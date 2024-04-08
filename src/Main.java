import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("вводите целые положительные числа");
        Scanner read = new Scanner(System.in);
        array.add(read.nextInt());
        while (array.getLast()>0){
            array.add(read.nextInt());
        }
        array.removeLast();
        System.out.println(array);
        array.sort(Comparator.naturalOrder());
        System.out.println(array);
        double m;
        if (array.size()%2 == 0)
            m = (double)(array.get(array.size()/2-1) + array.get(array.size()/2))/2;
        else
            m = array.get(array.size()/2);
        System.out.println(m);
    }
}