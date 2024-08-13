/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal2;

/**
 *
 * @author PC RPL - R1
 */
public class Bab9soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiAwal = 5;
        int nilaiAkhir =100;
        
        System.out.println("Nilai Awal  ?: " + nilaiAwal);
        System.out.println("Nilai Akhir ?: " + nilaiAkhir);

        System.out.println("Hasilnya:");
        
        int counter = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(counter + ". " + i);
            counter++;
        }
    }
}