import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1
        System.out.println("Task1");
        int [] one = new int [3];
        one [0] = 1;
        one [1] = 2;
        one [2] = 3;

        double [] two = {1.57, 7.654, 9.986};

        int three [] = {9, 8, 7};

        //2
        System.out.println("Task2");
        System.out.println(one [0] + ", " + one[1] + ", " + one[2]);
        System.out.println(two [0] + ", " + two[1] + ", " + two[2]);
        System.out.println(three [0] + ", " + three[1] + ", " + three[2]);

        //3
        System.out.println("Task3");
        System.out.println(one [2] + ", " + one[1] + ", " + one[0]);
        System.out.println(two [2] + ", " + two[1] + ", " + two[0]);
        System.out.println(three [2] + ", " + three[1] + ", " + three[0]);

        //4
        System.out.println("Task4");
        for (int i = one.length - 1; i >= 0; i--) {
            if (one[i] % 2 != 0) {
                one[i]++;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}