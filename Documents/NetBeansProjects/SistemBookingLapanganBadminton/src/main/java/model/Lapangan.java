/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public abstract class Lapangan {
    private String idLapangan;
    private String namaLapangan;
    private int hargaPerJam;

    public Lapangan(String idLapangan, String namaLapangan, int hargaPerJam) {
        this.idLapangan = idLapangan;
        this.namaLapangan = namaLapangan;
        this.hargaPerJam = hargaPerJam;
    }

    // Getter
    public String getIdLapangan() { return idLapangan; }
    public String getNamaLapangan() { return namaLapangan; }
    public int getHargaPerJam() { return hargaPerJam; }

    // Setter
    public void setHargaPerJam(int hargaPerJam) { this.hargaPerJam = hargaPerJam; }

    public abstract String getJenis();

    @Override
    public String toString() {
        return "ID: " + idLapangan + " | Nama: " + namaLapangan +
               " | Harga/Jam: Rp" + hargaPerJam + " | Jenis: " + getJenis();
    }
}
