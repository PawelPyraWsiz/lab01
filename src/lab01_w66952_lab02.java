import java.util.Scanner;

public class lab01_w66952_lab02 {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        System.out.printf("Podaj a:");
        int a = getInt();
        System.out.printf("Podaj b:");
        int b = getInt();
        System.out.printf("Podaj c:");
        int c = getInt();
        Zadanie1(a, b, c);

//        Zadanie 2 - funkcja a, b, c
        System.out.println("Zadanie 2");
        var x= getDouble();
        System.out.println(Zadanie2a(x));
        System.out.println(Zadanie2b(x));
        System.out.println(Zadanie2c(x));

//        zadanie 3
        System.out.println("Zadanie 3");
        var d= getDouble();
        var e= getDouble();
        var f= getDouble();
        Zadanie3(d, e, f);

//        Zadanie 4
        System.out.println("Zadanie 4");
        System.out.printf("Czy pada deszcz? (true/false):");
        var rain = getBoolean();
        System.out.printf("Czy autobus czeka? (true/false):");
        var bus = getBoolean();
        Zadanie4(rain, bus);

//        Zadanie 5
        System.out.println("Zadanie 5");
        System.out.printf("Czy otrzymano znizke? (true/false): ");
        var znizka = getBoolean();
        System.out.printf("Czy dostales premie? (true/false): ");
        var premia = getBoolean();
        Zadanie5(znizka, premia);

//        Zadanie 6
        System.out.println("Zadanie 6");
        int dzialanie = 0;
        while (dzialanie < 1 || dzialanie > 5) {
            System.out.println("Jakie dzialanie chcesz wykonac? \n 1 - Dodawanie \n 2 - Odejmowanie \n 3 - Iloczyn \n 4- Iloraz \n 5 - Reszta z dzielenia");
            dzialanie = getInt();
        }
        System.out.printf("Podaj a: ");
        var g = getDouble();
        System.out.printf("Podaj b: ");
        var h = getDouble();
        var wynik = Zadanie6(dzialanie, g, h);
        System.out.println("Wynik dzialania to " + wynik);

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

    public static void Zadanie1(int a, int b, int c) {
        double delta = (double) b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("równanie nie ma pierwiastków");
        } else if (delta == 0) {
            double x1 = (double) -b / (2 * a);
            System.out.println("x = " + x1);
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = "+  x1 + ", x2 = "+ x2);
        }
    }
    public static double Zadanie2a(double x) {
        if (x > 0) {
            return 2 * x;
        } else if (x == 0) {
            return 0;
        } else {
            return -3 * x;
        }
    }
    public static double Zadanie2b(double x) {
        if (x >= 1) {
            return x * x;
        } else {
            return x;
        }
    }
    public static double Zadanie2c(double x) {
        if (x > 2) {
            return 2 + x;
        } else if (x == 2) {
            return 8;
        } else {
            return x - 4;
        }
    }
    public static void Zadanie3(double a, double b, double c) {
        double buffor;

        if (a > b) {
            buffor = a;
            a = b;
            b = buffor;
        }
        else if (a > b) {
            buffor = a;
            a = b;
            b = buffor;
        }

        else if (b > c) {
            buffor = b;
            b = c;
            c = buffor;
        }
        System.out.println("Posortowane liczby: " + a + " " + b + " " + c);
    }
    public static void Zadanie4(boolean rain, boolean bus) {
        if (rain && bus) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        } else if (rain) {
            System.out.println("Nie dostaniesz się na uczelnie");
        } else if (bus) {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }
    public static void Zadanie5(boolean znizka, boolean premia) {
        if (!znizka || premia) {
            System.out.println("Możesz kupić samochód");
            System.out.println("Zniżki na samochód nie ma");
        }

        else if (!znizka || !premia) {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }

        else if (znizka || premia) {
            System.out.println("Możesz kupić samochód");
        }
    }
    public static double Zadanie6(int dzialanie, double a, double b) {
        switch (dzialanie) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b == 0) {
                    System.out.println("Nie mozna dzielic przez zero");
                    return 0;
                }

                return a / b;
            case 5:
                if (b == 0) {
                    System.out.println("Nie mozna dzielic przez zero");
                    return 0;
                }

                return a % b;
            default:
                System.out.println("Nie rozpoznano dzialania");
                return 0;
        }
    }
}
