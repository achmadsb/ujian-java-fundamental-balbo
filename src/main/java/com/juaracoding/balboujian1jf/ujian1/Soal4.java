package com.juaracoding.balboujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat array untuk menyimpan 5 nama film
        String[] namaFilm = new String[5];

        System.out.println("Daftar film bioskop");

        // Menggunakan perulangan untuk meminta input nama film
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama film " + (i+1) + ": ");
            namaFilm[i] = input.nextLine();
        }

        // Menampilkan daftar film yang ingin ditonton
        System.out.println("Film yang ingin ditonton:");

        // Menggunakan perulangan untuk menampilkan daftar film
        for (int i = 0; i < namaFilm.length; i++) {
            System.out.println((i+1) + ". " + namaFilm[i]);
        }
    }
}
