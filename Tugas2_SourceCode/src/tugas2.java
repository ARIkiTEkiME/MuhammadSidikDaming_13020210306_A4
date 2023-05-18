import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUH. SIDIK DAMING
 */
public class tugas2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang!");
        System.out.print("Masukkan pilihan (1: Halo, 2: Dunia, 3: Keluar): ");
        int pilihan = scanner.nextInt();
        
        while (pilihan != 3) {
            switch (pilihan) {
                case 1 -> System.out.println("Halo!");
                case 2 -> System.out.println("Dunia!");
                default -> System.out.println("Pilihan tidak valid.");
            }
            
            System.out.print("Masukkan pilihan (1: Halo, 2: Dunia, 3: Keluar): ");
            pilihan = scanner.nextInt();
        }
        
        System.out.println("Terima kasih!");
    }
}