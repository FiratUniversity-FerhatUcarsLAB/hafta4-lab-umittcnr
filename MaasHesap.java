/*
 * Ad Soyad: [ümitcan çinar]
 * Ogrenci No: [250541009]
 * Tarih: [1/11/2025]
 * Aciklama: Gorev 3 - Maas Hesap Sistemi
 *
 * Bu program kullanicidan gerekli bilgileri alir ardından
 * duzenli bir formatta ekrana yazdirir.
 */

/*değişkenler
double mesai_ucreti = (maas/160)*msaat*1.5;
        double toplam_gelir = (maas+mesai_ucreti);
        double sgk = (toplam_gelir*0.14);
        double gelir_vergisi = (toplam_gelir*0.15);
        double damga_vergisi = (toplam_gelir*0.00759);
        double toplam_kesinti = (sgk+gelir_vergisi+damga_vergisi);
        double net_maas = (toplam_gelir - toplam_kesinti);
        
 */
import java.util.Scanner;

import static java.lang.System.out;

public class MaasHesap  {
    static void main(String[] args) {
        /* Alınacak Bilgiler:
        Çalışan adı soyadı (String)
        Aylık brüt maaş (double, TL)
        Haftalık çalışma saati (int)
        Mesai saati sayısı (int) */

        System.out.println("CALISAN KİSİYE AİT;");
        Scanner input = new Scanner(System.in);
        System.out.print("Çalışan adı soyadı: ");
        String ad = input.nextLine();
        System.out.print("Aylık brüt maaş: ");
        float maas= (float) input.nextFloat();
        System.out.print("Haftalık çalışma saati: ");
        int hsaat = input.nextInt();
        System.out.print("Mesai saati : ");
        int msaat = input.nextInt();

        /*HESAPLAMALAR
        1. Gelirler:
        Brüt Maaş
        Mesai Ücreti= (Brüt Maaş / 160) × Mesai Saat × 1.5
        Toplam Gelir= Brüt + Mesai
        2. Kesintiler:
        SGK: Toplam Gelir × 0.14
        Gelir Vergisi: Toplam Gelir × 0.15
        Damga Vergisi: Toplam Gelir × 0.00759
        Toplam Kesinti= SGK + Gelir V. + Damga V.
        3. Net Maaş:
        Net Maaş= Toplam Gelir - Toplam Kesinti
         */

        double mesai_ucreti = (maas/160)*msaat*1.5;
        double toplam_gelir = (maas+mesai_ucreti);
        double sgk = (toplam_gelir*0.14);
        double gelir_vergisi = (toplam_gelir*0.15);
        double damga_vergisi = (toplam_gelir*0.00759);
        double toplam_kesinti = (sgk+gelir_vergisi+damga_vergisi);
        double net_maas = (toplam_gelir - toplam_kesinti);
        //İSTATİSTİKLER
        /*4. Hesaplanacak İstatistikler:
        Kesinti Oranı (%):
        (Toplam Kesinti / Toplam Gelir) × 100
        Saatlik Net Kazanç:
        Net Maaş / 176 saat
        (22 gün × 8 saat= 176 saat/ay)
        Günlük Net Kazanç:
        Net Maaş / 22 gün
        */
        double kesinti_orani = ((toplam_kesinti/toplam_gelir)*100);
        double saatlik_net_kazanc = (net_maas/176);
        //(22 gün × 8 saat= 176 saat/ay)
        double gunluk_net_kazanc = (net_maas/22);

        //çıktı
        System.out.println("====================================");
        System.out.println("      "+"MAAS BORDROSU");
        System.out.println("====================================");
        System.out.println("Calisan: "+ad);
        System.out.println("GELİRLER:");
        System.out.printf("  Brut Maas                  =%.2f%n",maas);
        System.out.printf("  Mesai Ucreti(10 saat)       =%.2f%n",mesai_ucreti);
        System.out.println("  "+"------------------------");
        System.out.println("  "+"TOPLAM GELIR:");
        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (yüzde14.0)   = %.2f%n",sgk);
        System.out.printf("Gelir Vergisi (yüzde15.0)   = %.2f%n", gelir_vergisi);
        System.out.printf("Damga Vergisi (yüzde0.8)    = %.2f%n", damga_vergisi);
        System.out.println("  "+"------------------------" );
        System.out.printf("TOPLAM KESINTI          =%.2f\n",toplam_kesinti);
        System.out.printf("NET MAAS                =%.2f%n",net_maas);
        System.out.printf("====================================");
        input.close();
        //SABİTLER:
        //final double SGK_ORANI = 0.14;
        //final double GELIR_VERGISI_ORANI = 0.15;
        //final double DAMGA_VERGISI_ORANI = 0.00759;


    }
}
