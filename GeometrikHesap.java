/*
 * Ad Soyad: [ümitcan çinar]
 * Ogrenci No: [250541009]
 * Tarih: [1/11/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 *
 * Bu program kullanicidan ogrenci bilgilerini alir ardından
 * duzenli bir formatta ekrana yazdirir.
 */
import java.util.Scanner;
/* değiişkenler ;
double pi,int r
 */
import static java.lang.System.*;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("yaricap degeri giriniz: ");
        int r = input.nextInt();
        final double pi = Math.PI;
        double Daire_Alani = pi * r * r;
        double Daire_Çevresi = 2*pi*r;
        double Daire_Capi = 2*r;
        double KUre_Hacmi= 4.0/3.0*pi*r*r*r;
        double KUre_Yüzey_Alani = 4*pi*r*r;
        System.out.printf("=== GEOMETRIK HESAPLAYICI ===" +"%n");
        System.out.printf(" DAİRE ALANİ = %.2f %n ",Daire_Alani);
        System.out.printf("DAİRE CEVRESİ = %.2f %n ",Daire_Çevresi);
        System.out.printf("DAİRE CAPİ = %.2f %n ",Daire_Capi);
        System.out.printf("KURE HACMİ = %.2f %n ",KUre_Hacmi);
        System.out.printf("KURE YUZEY ALANİ = %.2f %n  ",KUre_Yüzey_Alani);

                input.close();
    }
}
