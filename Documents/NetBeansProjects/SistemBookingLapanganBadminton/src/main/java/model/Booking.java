/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class Booking {
    private String idBooking;
    private Customer customer;
    private Lapangan lapangan;
    private String tanggal;
    private int jamMulai;
    private int jamSelesai;
    private int totalBayar;

    public Booking(String idBooking, Customer customer, Lapangan lapangan, 
                   String tanggal, int jamMulai, int jamSelesai) {
        this.idBooking = idBooking;
        this.customer = customer;
        this.lapangan = lapangan;
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.totalBayar = (jamSelesai - jamMulai) * lapangan.getHargaPerJam();
    }

    // Getter
    public String getIdBooking() {
        return idBooking; 
    }
    public Customer getCustomer() { 
        return customer; 
    }
    public Lapangan getLapangan() { 
        return lapangan; 
    }
    public String getTanggal() { 
        return tanggal; 
    }
    public int getJamMulai() { 
        return jamMulai; 
    }
    public int getJamSelesai() { 
        return jamSelesai; 
    }
    public int getTotalBayar() { 
        return totalBayar; 
    }

    @Override
    public String toString() {
        return "ID Booking : " + idBooking +
               "\nCustomer  : " + customer.getNama() +
               "\nLapangan  : " + lapangan.getNamaLapangan() + " (" + lapangan.getJenis() + ")" +
               "\nTanggal   : " + tanggal +
               "\nJam       : " + jamMulai + ":00 - " + jamSelesai + ":00" +
               "\nTotal     : Rp" + totalBayar;
    }
}
