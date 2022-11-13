import java.util.Random;
import java.util.Scanner;

public class lab04_w66952 {
    public static void main(String[] args) {
//        Zadanie 1
        Zadanie1(2);
//        Zadanie 2
        Zadanie2();
//        Zadanie 3
        Zadanie3();
//        Zadanie 4
        Zadanie4();
//        Zadanie 5
        Zadanie5();
//        Zadanie 6
        Zadanie6();
//        Zadanie7
        Zadanie7();
    }
    public static double losowe(int a, int b){
        Random rand = new Random();
        int liczba = rand.nextInt(b-a+1)+a;
        return liczba;
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String getWord(){
        return new Scanner(System.in).nextLine();
    }
    public static int[] wypelnij(int[] array){
        for(int i :array){
            array[i] = (int) losowe(0, 10);
            System.out.print(array[i] + ", ");
        }
        return array;
    }

    public static void Zadanie1(int dlugosc){
        int[] array = new int[dlugosc];
        int suma = 0;
        for(int i :array){
            array[i] = (int) losowe(0, 10);
        }
        for (var i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("Suma wynosi: " + suma + ", średnia to "+ (suma/ array.length));
    }
    public static void Zadanie2(){
        int dlugoscEven = (int) (losowe(0, 10 )*2);
        int dlugoscOdd = (int) (losowe(0, 5)) * 2 + 1;
        int[] arrayEven = new int[dlugoscEven];
        int[] arrayOdd = new int[dlugoscOdd];

        for(int i :arrayEven){
            arrayEven[i] = (int) losowe(0, 10);
        }
        System.out.println("Tablica Even");
        for(int i=0; i < arrayEven.length; i++){
            System.out.print(arrayEven[i] + ", ");
        }
        for(int i :arrayOdd){
            arrayOdd[i] = (int) losowe(0, 10);
        }
        System.out.println("\n Tablica Odd");
        for(int i=0; i < arrayEven.length - 2; i++){
            System.out.print(arrayOdd[i] + ", ");
        }
    }
    public static void Zadanie3(){
        String[] array = {"raz", "Dwa", "trzy", "cztery"};
        for (String element: array) {
            System.out.println(element.toUpperCase());
        }

    }
    public static void Zadanie4(){
        String[] array = new String[5];
        int pozycja = 0;
        char ch;
        for (String i: array) {
            System.out.print("Podaj " + (pozycja + 1) + " słowo: ");
            array[pozycja] = getWord();
            System.out.println();
            pozycja++;
        }
        for (String slowo: array){
            String nstr="";
            for (int j =0; j<slowo.length(); j++){
                ch = slowo.charAt(j);
                nstr = ch + nstr;
            }
            System.out.println(nstr);
        }
    }
    public static void Zadanie5(){
        int[] array = new int[8];
        for(int i=0; i < array.length; i++){
            System.out.print("Podaj " + (i + 1)  + " liczbe: ");
            array[i]= getInt();
            System.out.println();
        }
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        for (int i = 0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }
    }
    public static void Zadanie6(){
        int[] array = new int[5];
        for(int i=0; i < array.length; i++){
            System.out.print("Podaj " + (i + 1)  + " liczbe: ");
            array[i]= getInt();
            System.out.println();
        }
        for (int i=0; i< array.length;i++){
            int silnia =1;
            for (int k = 1; k<= array[i]; k++){
                silnia = silnia*k;
            }
            System.out.println("Wilnia liczby " + array[i] + " jest równa: "+ silnia);

        }
    }
    public static void Zadanie7(){
        String[] firstArray = {"raz", "Dwa", "trzy", "cztery"};
        String[] secondArray = {"raz", "Dwa", "trzy", "cztery"};
        int zgodnosc = 0;
        int dlugosc= 0;
        if (firstArray.length == secondArray.length){
            dlugosc = firstArray.length;
            for(int i=0; i<dlugosc; i++){
                if (firstArray[i]== secondArray[i]) zgodnosc++;
            }
        }
        if (zgodnosc == dlugosc){
            System.out.println("Tablice są zgodne");
        }
        else {
            System.out.println("Tablice nie są zgodne");
        }

    }
}