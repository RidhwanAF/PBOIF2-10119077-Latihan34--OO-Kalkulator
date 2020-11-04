/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan34.oo.kalkulator;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Kalkulator
 */

import kalkulator.kalkulator;
import java.util.Scanner;

public class PBOIF210119077Latihan34OOKalkulator {

    
    public static void main(String[] args) {
      kalkulator calculator = new kalkulator();
      Scanner input = new Scanner(System.in);
      
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        calculator.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        calculator.value2 = input.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan : "+calculator.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+calculator.kurangBilangan());
        System.out.println("Hasil Perkalian : "+calculator.kaliBilangan());
        System.out.println("Hasil Pembagian : "+calculator.bagiBilangan());
        System.out.println("Hasil Sisa : "+calculator.sisaBilangan());
        
    }
    
}
