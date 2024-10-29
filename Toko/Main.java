/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toko;
public class Main {
    public static void main(String[] args) {
        Pembayaran produkElektronik = new Elektronik();
        Pembayaran produkMakanan = new Makanan();
        
        double hargaElektronik = 100000;
        double hargaMakanan = 50000;
        
        double pajakElektronik = produkElektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = produkMakanan.hitungPajak(hargaMakanan);
        
        double totalElektronik = hargaElektronik + pajakElektronik;
        double totalMakanan = hargaMakanan + pajakMakanan;
        
        System.out.println("Pajak untuk Elektronik : " + pajakElektronik);
        System.out.println("Harga Elektronik setelah pajak : " + totalElektronik);
        System.out.println("");
        System.out.println("Pajak untuk Makanan : " + pajakMakanan);
        System.out.println("Harga Makanan setelah pajak : " + totalMakanan);
    }
}
