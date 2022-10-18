import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        double normalTotal, normal12Yas, indirimli12Yas, normal24Yas, indirimli24Yas, indirimliBilet, normal65Yas, indirimli65Yas, km, age;
        int yolculukTuru;
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuğunuzun mesafesini km cinsinden giriniz: ");
        km = input.nextDouble();
        System.out.print("Yolcunun yaşını giriniz: ");
        age = input.nextDouble();
        System.out.print("Yolculuk türünü seçiniz Tek yön=>1 , Gidiş-dönüş=>2");
        yolculukTuru = input.nextInt();
        normalTotal = km * 0.1;
        normal12Yas = (normalTotal * 0.5);
        normal24Yas = (normalTotal * 0.9);
        normal65Yas = (normalTotal * 0.7);
        indirimliBilet = (normalTotal * 0.8) * 2;
        indirimli24Yas = (normal24Yas * 0.8) * 2;
        indirimli12Yas = (normal12Yas * 0.8) * 2;
        indirimli65Yas = (normal65Yas * 0.8) * 2;
        if (km > 0){
            if (age < 12 && age >0){
                if (yolculukTuru == 1){
                    System.out.print("Bilet ücreti = "+ normal12Yas);
                }else if (yolculukTuru == 2){
                    System.out.println("Gidiş Dönüş uçak bileti tutarınız= "+ indirimli12Yas);
                }else {
                    isError = true;
                }
            }else if (age>= 12 && age < 24){
                if (yolculukTuru == 1){
                    System.out.print("Bilet ücreti = "+ normal24Yas);
                }else if (yolculukTuru == 2){
                    System.out.println("Gidiş Dönüş uçak bileti tutarınız= "+ indirimli24Yas);
                }else {
                    isError = true;
                }
            }else if (age>= 24 && age < 65) {
                if (yolculukTuru == 1) {
                    System.out.print("Bilet ücreti = " + normalTotal);
                } else if (yolculukTuru == 2) {
                    System.out.println("Gidiş Dönüş uçak bileti tutarınız= " + indirimliBilet);
                } else {
                    isError = true;
                }
            }else if (age>65) {
                if (yolculukTuru == 1) {
                    System.out.print("Bilet ücreti = " + normal65Yas);
                } else if (yolculukTuru == 2) {
                    System.out.println("Gidiş Dönüş uçak bileti tutarınız= " + indirimli65Yas);
                } else {
                    isError = true;
                }
            }else {
                isError = true;
            }
        }else {
            isError = true;
        }if (isError){
            System.out.println("Hatalı veri girdiniz!");
        }

    }
}
