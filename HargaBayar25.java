import java.util.Scanner;

/**
 * HargaBayar25
 */
public class HargaBayar25 {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        
        int harga, jumlah, halamanBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukan Merk Buku yang akan dibeli");
        merkBuku=input.next();
        System.out.println("Masukan jumlah halaman buku");
        halamanBuku=input.nextInt();
        System.out.println("Masukan jumlah jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukan besaran diskon");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-dis;

        System.out.println("Diskon yang anda dapatkan adalah : " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " +bayar);
    }
}