package com.juaracoding.balboujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int HargaWeekday = 35000;
        int HargaWeekend = 45000;

        Scanner input = new Scanner(System.in);

        // Meminta input jumlah tiket
        System.out.print("Jumlah tiket: ");
        int jumlahTiket = input.nextInt();
        input.nextLine();

        // Meminta input untuk menentukan harga tiket
        System.out.print("Weekday Atau Weekend: ");
        String jenisHari = input.nextLine().toLowerCase();

        int harga;
        if (jenisHari.equals("weekday")) {
            harga = HargaWeekday;
        } else if (jenisHari.equals("weekend")) {
            harga = HargaWeekend;
        } else {
            System.out.println("Input tidak valid. Harga yang digunakan adalah harga weekday.");
            harga = HargaWeekday;
        }

        // Menghitung total harga sebelum diskon
        int totalHarga = harga * jumlahTiket;

        // Memberikan diskon jika jumlah tiket lebih dari 5 dengan diskon 10%
        if (jumlahTiket > 5) {
            double diskon = 0.1 * totalHarga;
            totalHarga -= diskon;
            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Total harga (dengan diskon): " + totalHarga);
        } else {
            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Total harga: " + totalHarga);
        }

    }
}
