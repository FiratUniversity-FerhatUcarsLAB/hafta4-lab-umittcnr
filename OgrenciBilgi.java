/*
 * Ad Soyad: [ÜMİTCAN ÇİNAR]
 * Ogrenci No: [250541009]
 * Tarih: [1/11/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        

/* değiişkenler ;
string ad,soyad int;öğreni no,yaş,double gpa
 */

public class OgrenciBilgi {
    public static void main(String[] args) {
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        Scanner input = new Scanner(System.in);
        System.out.print("isminizi giriniz: ");
        String isim = (input.nextLine());
        System.out.print("soyisminizi giriniz: ");
        String soyisim = (input.nextLine());
        System.out.print("öğrenci numaranızı giriniz: ");
        int ogrencino = (input.nextInt());
        System.out.print("yaşınızı giriniz: ");
        int yas = (input.nextInt());
        System.out.print("GPA giriniz: ");
        double GPA = (input.nextDouble());
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("adiniz = %s%n", isim);
        System.out.printf("soyadiniz = %s%n", soyisim);
        System.out.printf("ogrenci no = %d%n", ogrencino);
        System.out.printf("yasiniz = %d%n", yas);
        System.out.printf("GPA'nız = %.2f%n", GPA);
        //gpa kontrolü
        if (GPA < 2.0) {
            System.out.println("Durum: Başarısız ❌");
        } else if (GPA < 2.5) {
            System.out.println("Durum: Vasat 😐");
        } else if (GPA < 3.0) {
            System.out.println("Durum: Orta 😊");
        } else if (GPA < 3.5) {
            System.out.println("Durum: İyi 👍");
        } else {
            System.out.println("Durum: Mükemmel 🌟");
        }

        input.close();
    }
}
        
    }
}
