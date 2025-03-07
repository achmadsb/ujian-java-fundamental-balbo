package com.juaracoding.balboujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // Memasukkan nama film
        System.out.print("Masukkan Nama Film: ");
        String namaFilm = input.nextLine();

        // Mengubah nama film menjadi huruf besar/kapital menggunakan method toUpperCase()
        String namaFilmHurufBesar = namaFilm.toUpperCase();

        // Menampilkan output
        System.out.println("Nama Film Dalam Huruf Besar: " + namaFilmHurufBesar);
    }
}
