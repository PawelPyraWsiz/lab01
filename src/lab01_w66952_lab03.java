import java.util.Random;
import java.util.Scanner;

public class lab01_w66952_lab03 {
    public static void main(String[] args){
//         Zadanie 1
        Zadanie1();

//         Zadanie 2
        Zadanie2();

//        Zadanie 3
        int[] array = {4, 3, 6, 10, 1};
        Zadanie3(array);

//         Zadanie 4
        Zadanie4();

//         Zadanie 5
        System.out.println(Zadanie5("kajak"));
        System.out.println(Zadanie5("kamillimak"));
        System.out.println(Zadanie5("słowo"));


    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }
    public static boolean getBoolean() {
        return new Scanner(System.in).nextBoolean();
    }
    public static int losowe(int a, int b){
        Random rand = new Random();
        int liczba = rand.nextInt(b-a+1)+a;
        return liczba;
    }



    public static void Zadanie1() {
        System.out.printf("Podaj n: ");
        var n = getInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Podaj punkty studenta (" + (i)+ ") : ");
            var points = getInt();
            sum += points;
        }

        var sred= sum / n;
        System.out.println("Srednia punktow to: " + sred);
    }
    public static void Zadanie2() {
        var n = 10;
        int dodatnie = 0;
        double dodatnieSuma = 0;
        int ujemne = 0;
        double negativeSum = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe całkowitą (dodatnia lub ujemna)");
            System.out.println("Pozostało: " + (n - i - 1));
            var num = getInt();

            if(num >= 0) {
                dodatnie++;
                dodatnieSuma += num;
            }
            else {
                ujemne++;
                negativeSum += num;
            }
        }

        System.out.println("Dodatnie: " + dodatnie + " ich suma: " + dodatnieSuma);
        System.out.println("Ujemne: " + ujemne + " ich suma: " + negativeSum);
    }
    public static void Zadanie3(int[] array) {
        int suma = 0;

        for (var i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                suma += array[i];
            }
        }

        System.out.println("Suma: " + suma);
    }
    public static void Zadanie4() {
        System.out.println("Podaj n: ");
        var n = getInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = losowe(-10, 45);
        }

        Zadanie3(array);
    }

    public static boolean Zadanie5(String word) {
        StringBuilder reverse = new StringBuilder();
        String base = word.toLowerCase();
        var chars = word.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse.append(chars[i]);
        }
        if((reverse.toString()).equals(base)){
            return true;
        }
        else return false;
    }
}
