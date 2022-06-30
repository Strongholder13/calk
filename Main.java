import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        String[] datas = data.split(" ");
        String a = datas[0];
        String b = datas[2];
        String d = datas[1];

        String[] rom = new String[11];
        rom[0] = "" ;
        rom[1] = "I";
        rom[2] = "II";
        rom[3] = "III";
        rom[4] = "IV";
        rom[5] = "V";
        rom[6] = "VI";
        rom[7] = "VII";
        rom[8] = "VIII";
        rom[9] = "IX";
        rom[10] = "X";
        List<String> nameList = new ArrayList<>(Arrays.asList(rom));

        boolean bol1 = nameList.contains(a);
        boolean bol2 = nameList.contains(b);

        //System.out.println(bol1);

        if  (bol2 && bol1) {
            Roman aa = Roman.valueOf(a);
            Roman bb = Roman.valueOf(b);
            int otvet = 0;
            int c1 = aa.getConvers();
            int c2 = bb.getConvers();

            switch (d) {
                case "+":
                    otvet = c1 + c2;
                    break;
                case "-":
                    otvet = c1 - c2;
                    break;
                case "*":
                    otvet = c1 * c2;
                    break;
                case "/":
                    otvet = c1 / c2;
                    break;
                default:
                    System.out.println("Операция не опознана");

            }

            if (otvet < 1) {
                System.out.println("Результатом работы калькулятора с римскими числами могут быть только целые положительные числа");
            } else if (otvet < 10) {
                String rimotv = rom[otvet];
                System.out.println(rimotv);
            } else if (otvet < 20) {
                String rimotv = rom[otvet- 10];
                System.out.println("X" + rimotv);
            } else if (otvet < 30) {
                String rimotv = rom[otvet- 20];
                System.out.println("XX" + rimotv);
            } else if (otvet < 40) {
                String rimotv = rom[otvet- 30];
                System.out.println("XXX" + rimotv);
            } else if (otvet < 50) {
                String rimotv = rom[otvet- 40];
                System.out.println("XL" + rimotv);
            } else if (otvet < 60) {
                String rimotv = rom[otvet- 50];
                System.out.println("L" + rimotv);
            } else if (otvet < 70) {
                String rimotv = rom[otvet- 60];
                System.out.println("LX" + rimotv);
            } else if (otvet < 80) {
                String rimotv = rom[otvet- 70];
                System.out.println("LXX" + rimotv);
            } else if (otvet < 90) {
                String rimotv = rom[otvet- 80];
                System.out.println("LXXX" + rimotv);
            } else if (otvet < 100) {
                String rimotv = rom[otvet- 90];
                System.out.println("XC" + rimotv);
            } else if (otvet == 100) {
                System.out.println("C");
            }


            //System.out.println(otvet);
        }
        else {
            Arab arab1 = new Arab();
            Arab arab2 = new Arab();
            arab1.vvod = datas[0];
            arab2.vvod = datas[2];
            int c1 = arab1.perevod();
            int c2 = arab2.perevod();

            int otvet;

            switch (d) {
                case "+":
                    otvet = c1 + c2;
                    System.out.println(otvet);
                    break;
                case "-":
                    otvet = c1 - c2;
                    System.out.println(otvet);
                    break;
                case "*":
                    otvet = c1 * c2;
                    System.out.println(otvet);
                    break;
                case "/":
                    otvet = c1 / c2;
                    System.out.println(otvet);
                    break;
                default:
                    System.out.println("Операция не опознана");
            }
            //System.out.println(otvet);
        }
    }
}

        class Arab {

            String vvod;

            int perevod() {
                switch (vvod) {
                    case "10":
                        int cifra = 10;
                        return cifra;
                    case "1":
                        cifra = 1;
                        return cifra;
                    case "2":
                        cifra = 2;
                        return cifra;
                    case "3":
                        cifra = 3;
                        return cifra;
                    case "4":
                        cifra = 4;
                        return cifra;
                    case "5":
                        cifra = 5;
                        return cifra;
                    case "6":
                        cifra = 6;
                        return cifra;
                    case "7":
                        cifra = 7;
                        return cifra;
                    case "8":
                        cifra = 8;
                        return cifra;
                    case "9":
                        cifra = 9;
                        return cifra;
                    default:
                        System.out.println("Число не опознано");
                }
                return 0 ;
            }
        }










