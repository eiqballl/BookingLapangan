/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class Customer {
    
    private String idCustomer;
    private String nama;
    private String noTelp;

    public Customer(String idCustomer, String nama, String noTelp) {
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    // Getter
    public String getIdCustomer() { return idCustomer; }
    public String getNama() { return nama; }
    public String getNoTelp() { return noTelp; }

    // Setter
    public void setNama(String nama) { this.nama = nama; }
    public void setNoTelp(String noTelp) { this.noTelp = noTelp; }

    @Override
    public String toString() {
        return "ID: " + idCustomer + " | Nama: " + nama + " | No Telp: " + noTelp;
    }

}
