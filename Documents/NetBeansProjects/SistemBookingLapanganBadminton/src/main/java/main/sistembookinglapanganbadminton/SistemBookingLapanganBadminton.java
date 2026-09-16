/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.sistembookinglapanganbadminton;

/**
 *
 * @author Acer
 */

import model.Customer;
import model.Lapangan;
import model.Booking;
import model.LapanganVIP;
import model.LapanganStandard;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemBookingLapanganBadminton {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Lapangan> lapangans = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {
        // data awal lapangan
        lapangans.add(new LapanganStandard("L001", "Lapangan A", 50000, "Net, Free 12 Shuttlecock"));
        lapangans.add(new LapanganStandard("L002", "Lapangan B", 50000, "Net, Free 12 Shuttlecock"));
        lapangans.add(new LapanganVIP("L003", "Lapangan VIP 1", 100000, "Net, Free 32 Shuttlecock, AC", true));
        lapangans.add(new LapanganVIP("L004", "Lapangan VIP 2", 100000, "Net, Free 32 Shuttlecock, AC", true));

        boolean running = true;
        while (running) {
            System.out.println("\n=============================================");
            System.out.println("===== SISTEM BOOKING LAPANGAN BADMINTON =====");
            System.out.println("=============================================");
            System.out.println("1. Tambah Customer");
            System.out.println("2. Tampilkan Semua Customer");
            System.out.println("3. Tampilkan Semua Lapangan");
            System.out.println("4. Buat Booking");
            System.out.println("5. Tampilkan Semua Booking");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> tambahCustomer();
                case 2 -> tampilkanCustomer();
                case 3 -> tampilkanLapangan();
                case 4 -> buatBooking();
                case 5 -> tampilkanBooking();
                case 6 -> running = false;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
        System.out.println("Terima kasih!");
    }

    static void tambahCustomer() {
        System.out.println("\n+===================+");
        System.out.println("+  DAFTAR CUSTOMER  +");
        System.out.println("+===================+");
        String id = "C00" + (customers.size() + 1);
        System.out.print("Nama     : "); String nama = sc.nextLine();
        System.out.print("No Telp  : "); String noTelp = sc.nextLine();
        customers.add(new Customer(id, nama, noTelp));
        System.out.println("Customer berhasil ditambahkan! ID: " + id);
    }

    static void tampilkanCustomer() {
        System.out.println("\n+===================+");
        System.out.println("+  DAFTAR CUSTOMER  +");
        System.out.println("+===================+");
        if (customers.isEmpty()) { System.out.println("Belum ada customer."); return; }
        for (Customer c : customers) System.out.println(c);
    }

    static void tampilkanLapangan() {
        System.out.println("\n+===================+");
        System.out.println("+  DAFTAR LAPANGAN  +");
        System.out.println("+===================+");
        for (Lapangan l : lapangans) System.out.println(l);
    }

    static void buatBooking() {
        System.out.println("\n+================+");
        System.out.println("+  BUAT BOOKING  +");
        System.out.println("+================+");
        if (customers.isEmpty()) { System.out.println("Belum ada customer, tambah customer dulu!"); return; }

        // pilih customer
        tampilkanCustomer();
        System.out.print("Masukkan ID Customer: "); String idCustomer = sc.nextLine();
        Customer customer = customers.stream()
                .filter(c -> c.getIdCustomer().equals(idCustomer))
                .findFirst().orElse(null);
        if (customer == null) { System.out.println("Customer tidak ditemukan!"); return; }

        // pilih lapangan
        tampilkanLapangan();
        System.out.print("Masukkan ID Lapangan: "); String idLapangan = sc.nextLine();
        Lapangan lapangan = lapangans.stream()
                .filter(l -> l.getIdLapangan().equals(idLapangan))
                .findFirst().orElse(null);
        if (lapangan == null) { System.out.println("Lapangan tidak ditemukan!"); return; }

        // input waktu
        System.out.print("Tanggal (DD/MM/YYYY): "); String tanggal = sc.nextLine();
        System.out.print("Jam Mulai (0-23)     : "); int jamMulai = sc.nextInt();
        System.out.print("Jam Selesai (0-23)   : "); int jamSelesai = sc.nextInt();
        sc.nextLine();

        if (jamSelesai <= jamMulai) { System.out.println("Jam selesai harus lebih besar dari jam mulai!"); return; }

        String idBooking = "B00" + (bookings.size() + 1);
        Booking booking = new Booking(idBooking, customer, lapangan, tanggal, jamMulai, jamSelesai);
        bookings.add(booking);

        System.out.println("\nBooking berhasil dibuat!");
        System.out.println(booking);
    }

    static void tampilkanBooking() {
        System.out.println("\n+=================+");
        System.out.println("+  DAFTAR BOOKING +");
        System.out.println("+=================+");
        if (bookings.isEmpty()) { System.out.println("Belum ada booking."); return; }
        for (Booking b : bookings) {
            System.out.println("-----------------------------");
            System.out.println(b);
        }
    }
}

