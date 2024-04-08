import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        readListOfPositiveInt(array);
        System.out.println(array);
        array.sort(Comparator.naturalOrder());
        System.out.println(array);
        double m;
        m = getM(array);
        System.out.println(m);
    }

    private static void readListOfPositiveInt(ArrayList<Integer> array) {
        System.out.println("вводите целые положительные числа");
        Scanner read = new Scanner(System.in);
        int n;
        n = read.nextInt();
        while (n>0){
            array.add(n);
            n = read.nextInt();
        }
    }

    private static double getM(ArrayList<Integer> array) {
        double m;
        if (array.size()%2 == 0)
            m = (double)(array.get(array.size()/2-1) + array.get(array.size()/2))/2;
        else
            m = array.get(array.size()/2);
        return m;
    }
}