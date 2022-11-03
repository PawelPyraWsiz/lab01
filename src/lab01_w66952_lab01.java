import java.util.Random;
import java.util.Scanner;

public class lab01_w66952_lab01 {
    public static void main(String[] args) {
//        System.out.println(ZwrocImie() + " " + ZwrocWiek());
        int a=0, b=0;
        do {
            System.out.println("podaj a:");
            a = getInt();
            System.out.println("podaj b:");
            b = getInt();
        }while(b < a);
        System.out.println(trojkat(a, b));
    }

    public static void Wypisz(){
//        int a= -2, b =25;
//        Scanner input = new Scanner(System.in);
//        System.out.println("podaj c:");
//        int c = getInt();
//        System.out.println("a = " + a + ", b = " + b + " c = " + c);
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static int getDouble(){
        return new Scanner(System.in).nextInt();
    }
    public static String ZwrocImie(){
        return("Paweł");
    }
    public static int ZwrocWiek(){
        return(21);
    }
    public static void SimpleCalc(int a, int b){
        System.out.println("suma => a+b = "+ (a+b) );
        System.out.println("roznica => a-b = "+ (a-b) );
        System.out.println("iloczyn => a*b = "+ (a*b) );
    }
    public static boolean CzyParzysta(int a){
        if(a%2==0) return true;
        return false;
    }
    public static boolean TrzyiPiec(int a){
        if(a%3==0 && a%5==0) return true;
        return false;
    }
    public static int Potega(int a){
        int b = (int) Math.pow(a, 3);
        return b;
    }
    public static double pierwiastek(int a){
        return (int) Math.sqrt(a);
    }
    public static double losowe(int a, int b){
        Random rand = new Random();
        int liczba = rand.nextInt(b-a+1)+a;
        return liczba;
    }
    public static boolean trojkat(int a, int b){
        double pierwsza = losowe(a,b);
        double druga = losowe(a,b);
        double trzecia = losowe(a,b);
        double sumaBokow = (double) Math.pow(pierwsza, 2) + Math.pow(druga, 2);
        trzecia = Math.pow(trzecia, 2);
        if (sumaBokow == trzecia) return true;
        return false;
    }
}