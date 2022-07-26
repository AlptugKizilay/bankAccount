import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        int right = 3;
        int select, tutar, bakiye = 2000, select2;
        Scanner input = new Scanner(System.in);


        while (right > 0) {
            System.out.print("Kullanici Adi: ");
            username = input.nextLine();
            System.out.print("Sifre: ");
            password = input.nextLine();
            if (username.equals("patika") && password.equals("dev12")) {
                System.out.println("Sisteme Giris Yaptiniz.");
                do {
                    System.out.println("1-Para Cekme\n2-Para Yatirma\n3-Bakiye Sorgulma\n4-Cikis yap");
                    System.out.print("Yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Bakiye: "+ bakiye);
                        System.out.println("Cekmek istediginiz tutari giriniz: ");
                        tutar = input.nextInt();
                        if (bakiye > tutar) {
                            bakiye = bakiye - tutar;
                            System.out.println("Kalan tutar: " + bakiye);
                        } else {
                            System.out.println("Yetersiz Bakiye.");
                        }

                        System.out.println("1- Ana menuye don\n2-Cikis yap");
                        select2 = input.nextInt();
                        if (select2 == 1) {
                        } else if (select2 == 2) {
                            break;
                        }

                    } else if (select == 2) {
                        System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                        tutar = input.nextInt();
                        bakiye += tutar;
                        System.out.println("Bakiyeniz: " + bakiye);
                        System.out.println("1- Ana menuye don\n2-Cıkıs yap");
                        select2 = input.nextInt();
                        if (select2 == 1) {
                        } else if (select2 == 2) {
                            break;
                        }

                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + bakiye);
                        System.out.println("1- Ana menuye don\n2-Cıkıs yap");
                        select2 = input.nextInt();
                        if (select2 == 1) {
                        } else if (select2 == 2) {
                            break;
                        }

                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzeri");
                break;

            } else {
                right--;
                System.out.println("Hatalı Giris Yaptıniz.");
                System.out.println("Kalan Hak: " + right);
                if (right == 0) {
                    System.out.println("Hesabiniz Bloke Oldu!\nLütfen bankaniz ile iletişime geçiniz.");
                }

            }


        }
    }
}