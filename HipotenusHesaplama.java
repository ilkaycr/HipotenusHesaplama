package TemelKavramlar;
import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        int a,b;
        double c,u,alan;
        //Kullanıcıdan girdi almak için scanner açıyoruz
        Scanner input = new Scanner(System.in);


        //Kullanıcıdan girdi alıyoruz

        System.out.print("a : ");
        a = input.nextInt();
        System.out.print("b : ");
        b = input.nextInt();

        //Hiptenüsü hesaplayalım
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüsü : " + c);

        //Çevreyi hesaplayalım

        u = (a+b+c)/2;
        System.out.println("Üçgenin Çevresi : " + 2*u);

        // alan hesaplama
        alan = Math.sqrt(  u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı : "+ alan);

    }


}
