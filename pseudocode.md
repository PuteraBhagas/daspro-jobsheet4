Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan
harga barang}

Deklarasi:
harga, jumlah ,halamanBuku: int
dis, total, bayar, jmlDis : double
merkBuku: string

Deskripsi:
1. print "Masukkan harga barang yang dibeli”
2. read harga
3. print "Masukan merk buku yang akan dibeli"
4. read merkBuku
5. print "Masukan jumlah halaman"
6. read halamanBuku
7. print " Masukkan Jumlah jumlah barang yang dibeli”
8. read jumlah
9. print " Masukan Besaran Diskon"
10. read dis
11. total = harga *jumlah
12. jmlDis=total*dis
13. bayar=total-jmlDis
14. print “Diskon yang anda dapatkan adalah”
15. print jmlDiskon
16. print "Jumlah yang harus dibayar adalah”
17. print bayar