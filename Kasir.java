/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasircuu;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 *
 * @author PC
 */
public class Kasir {
        class Tanggal {
            private String getTanggal(){
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = new Date();
                return dateFormat.format(date);
            }
            private String getWaktu(){
                DateFormat dateFormat = new SimpleDateFormat("HH:mm");
                Date date = new Date();
                return dateFormat.format(date);
            }
        }
   
    void apk(){
        Scanner brn = new Scanner(System.in);
        System.out.println("=====WELCOME TO OUR SHOE STORE=====");
        
        
        System.out.println("Silakan Masukkan Nama Kasir: ");
        String NamaKasir = brn.next();
        
        System.out.println("\n =====JAYABARU SHOES=====");
        qasir cetak = new qasir("[1]COWOK  \t[2]CEWEK", "[1]OLAHRAGA\t[2]Lari   \t[3]SANTAI \t[4]KANTORAN", 
                "[1]ADIDAS  \t[2]NIKE   \t[3]SKECHERS\t[4]PUMA   \t[5]REEBOK \t[6]VANS   \t[7]CONVERSE   \t[8]FILA   \t[9]910",
                "[1]BLACK   \t[2]WHITE  \t[3]Gold   \t[4]SILVER \t[5]ORANGE \t[6]Green  \t[7]YELLOW \t[8]BLUE   \t[9]RED");
                
       
        System.out.println("DAFTAR HARGA SEPATU \t:");
        int harga = 2500000;
        System.out.println("[910]           \tRp " + harga);
        int harga2 = 3000000;
        System.out.println("[FILA]          \tRp " + harga2);
        int harga3 = 3500000;
        System.out.println("[CONVERSE]      \tRp " + harga3);
        int harga4 = 4000000;
        System.out.println("[VANS]          \tRp " + harga4);
        int harga5 = 5000000;
        System.out.println("[REEBOK]        \tRp " + harga5);
        int harga6 = 6000000;
        System.out.println("[PUMA]          \tRp " + harga6);
        int harga7 = 4500000;
        System.out.println("[Skechers]      \tRp " + harga7);
        int harga8 = 8000000;
        System.out.println("[NIKE]          \tRp " + harga8);
        int harga9 = 7500000;
        System.out.println("[ADIDAS]        \tRp " + harga9);
        
        
        System.out.println("[BELI >= 2 DISKON KELIPATAN Rp 50000]");
        
        System.out.println("\nSilakan Pilih Kategori Sepatu \t:");
        int kategori = brn.nextInt();
        if (kategori > 2) {
            System.out.println("Mohon Maaf Kategori Tidak Ditemukan,Silakan Pilih Ulang: ");
            int kodeKategori = brn.nextInt();
        }
        System.out.println("Jenis Sepatu yang Dipilih \t:");
        int jenis = brn.nextInt();
        if (jenis > 4){
            System.out.println("Mohon Maaf Jenis Tidak Ditemukan,Silakan Pilih Ulang");
            int kodeJenis = brn.nextInt();
        }
        System.out.println("Merk Sepatu yang Dipilih \t:");
        int merk = brn.nextInt();
        if (merk > 8){
            System.out.println("Mohon Maaf Merk Tidak Ditemukan,Silakan Pilih Ulang");
            int kodeMerk = brn.nextInt();
        }
        System.out.println("Warna yang dipilih \t:");
        int warna = brn.nextInt();
        if (warna > 9){
            System.out.println("Mohon Maaf Warna Tidak Ditemukan,Silakan Pilih Ulang");
            int kodeWarna = brn.nextInt();
        }
        System.out.println("Silakan Pilih Ukuran Sepatu (25-34) \t:");
        int ukuran = brn.nextInt();
        if (ukuran > 34){
            System.out.println("Mohon Maaf Ukuran Tidak Ditemukan,Silakan Pilih Ulang");
            int kodeUkuran = brn.nextInt();
        }
        System.out.println("Jumlah yang ingin dibeli \t:");
        int jumlah = brn.nextInt();
        int diskon = jumlah*50000;
        
        
        System.out.println("\n==========NOTA PEMBELIAN==========");
        System.out.println("       -----JAYABARU SHOES-----        ");
        System.out.println("          Jl.Cinta Penuh Makna        ");
        System.out.println("            (0101)876555            ");
        Tanggal tgl = new Tanggal();
        System.out.println("\nTANGGAL PEMBELIAN \t: " + tgl.getTanggal());
        System.out.println("WAKTU PEMBELIAN     \t: " + tgl.getWaktu());
        System.out.println("Nama Kasir          \t: " + NamaKasir);
        
        if (jenis == 1){
            System.out.println("\nJenis Sepatu: COWOK");
        } else if (jenis == 2){
            System.out.println("\nJenis Sepatu: CEWEK");
        }
        if (kategori == 1){
            System.out.println("KATEGORI SEPATU: OLAHRAGA");
        } else if (kategori == 2){
            System.out.println("KATEGORI SEPATU: LARI");
        } else if (kategori == 3){
            System.out.println("KATEGORI SEPATU: KANTORAN");
        } else if (kategori == 4){
            System.out.println("KATEGORI SEPATU: SANTAI");
        }
        if (merk == 1){
            System.out.println("MERK SEPATU: ADIDAS");
        } else if (merk == 2){
            System.out.println("MERK SEPATU: NIKE");
        } else if (merk == 3){
            System.out.println("MERK SEPATU: SKECHERS");
        } else if (merk == 4){
            System.out.println("MERK SEPATU: PUMA");
        } else if (merk == 5){
            System.out.println("MERK SEPATU: REEBOK");
        } else if (merk == 6){
            System.out.println("MERK SEPATU: VANS");
        } else if (merk == 7){
            System.out.println("MERK SEPATU: CONVERSE");
        } else if (merk == 8){
            System.out.println("MERK SEPATU: FILA");
        } else if (merk == 9){
            System.out.println("MERK SEPATU: 910");
        }
        if (warna == 1){
            System.out.println("WARNA SEPATU: BLACK");
        } else if (warna == 2){
            System.out.println("WARNA SEPATU: WHITE");
        } else if (warna == 3){
            System.out.println("WARNA SEPATU: GOLD");
        } else if (warna == 4){
            System.out.println("WARNA SEPATU: SILVER");
        } else if (warna == 5){
            System.out.println("WARNA SEPATU: ORANGE");
        } else if (warna == 6){
            System.out.println("WARNA SEPATU: GREEN");
        } else if (warna == 7){
            System.out.println("WARNA SEPATU: YELLOW");
        } else if (warna == 8){
            System.out.println("WARNA SEPATU: BLUE");
        } else if (warna == 9){
            System.out.println("WARNA SEPATU: RED");
        }
        System.out.println("UKURAN SEPATU : " + ukuran);
        System.out.println("JUMLAH PEMBELIAN : " + jumlah);
        
        if (merk == 1 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga * jumlah) - diskon)));
        } else if (merk == 2 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga2 + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga2 * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp "  + (pembayaran - ((harga2 * jumlah) - diskon)));
        } else if (merk == 3 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga3 + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga3 * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga3 * jumlah) - diskon)));
        } else if (merk == 4 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga4 + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga4 * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga4 * jumlah) - diskon)));
        } else if (merk == 5 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga5 + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga5 * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga5 * jumlah) - diskon)));
        } else if (merk == 6 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga6 + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga6 * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp " +(pembayaran - ((harga6 * jumlah) - diskon)));
        } else if (merk == 7 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga7 + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga7 * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga7 * jumlah) - diskon)));
        } else if (merk == 8 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga8 + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga8 * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga8 * jumlah) - diskon)));
        } else if (merk == 9 && jumlah >= 2){
            System.out.println("\nHARGA @SEPATU \t: Rp " + harga9 + " x " + jumlah);
            System.out.println("DISKON SEPATU   \t: Rp " + diskon);
            System.out.println("TOTAL HARGA     \t: Rp " + ((harga9 * jumlah) - diskon));
            System.out.println("\nPEMBAYARAN    \t: Rp ");
            int pembayaran = brn.nextInt();
            System.out.println("PENGEMBALIAN    \t: Rp " +(pembayaran - ((harga9 * jumlah) - diskon)));
            
            System.out.println("\n==========TERIMAKASIH ATAS KUNJUNGANNYA=========");
            
            
            
        }
        
                
            }
        }
    

   
    

   
    

