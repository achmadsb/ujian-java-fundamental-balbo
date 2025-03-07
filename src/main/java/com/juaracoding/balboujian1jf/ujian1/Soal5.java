package com.juaracoding.balboujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat array untuk menyimpan harga dari 5 tiket film
        int[] hargaTiket = new int[5];

        // Meminta input harga tiket untuk setiap film
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan harga tiket film " + (i+1) + ": ");
            hargaTiket[i] = input.nextInt();
        }

        // Menghitung total harga tiket
        int totalHarga = 0;
        for (int i = 0; i < hargaTiket.length; i++) {
            totalHarga += hargaTiket[i];
        }

        // Menampilkan harga tiket setiap film
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i+1) + ": " + hargaTiket[i]);
        }

        // Menampilkan total harga tiket
        System.out.println("Total harga tiket: " + totalHarga);
    }
}
