/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

public interface KelolaData {
    void tambahData(PenghuniKost penghuni);
    void hapusData(String id);
    PenghuniKost cariData(String id);
}