/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */

public class LapanganVIP extends Lapangan {
    private String fasilitas;
    private boolean includeCoach;

    public LapanganVIP(String idLapangan, String namaLapangan, int hargaPerJam, String fasilitas, boolean includeCoach) {
        super(idLapangan, namaLapangan, hargaPerJam);
        this.fasilitas = fasilitas;
        this.includeCoach = includeCoach;
    }

    // Getter
    public String getFasilitas() { return fasilitas; }
    public boolean isIncludeCoach() { return includeCoach; }

    @Override
    public String getJenis() { return "VIP"; }

    @Override
    public String toString() {
        return super.toString() + " | Fasilitas: " + fasilitas + 
               " | Include Coach: " + (includeCoach ? "Ya" : "Tidak");
    }
}
