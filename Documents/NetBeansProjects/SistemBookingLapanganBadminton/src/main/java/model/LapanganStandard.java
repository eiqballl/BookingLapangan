/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class LapanganStandard extends Lapangan {
    private String fasilitas;

    public LapanganStandard(String idLapangan, String namaLapangan, int hargaPerJam, String fasilitas) {
        super(idLapangan, namaLapangan, hargaPerJam);
        this.fasilitas = fasilitas;
    }

    // Getter
    public String getFasilitas() { return fasilitas; }

    @Override
    public String getJenis() { return "Standard"; }

    @Override
    public String toString() {
        return super.toString() + " | Fasilitas: " + fasilitas;
    }
}
