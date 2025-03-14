/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        // Menambahkan elemen ke dalam list
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(1);

        System.out.println("List sebelum penghapusan:");
        list.display();
        
        // 2. Tampilkan elemen list
        System.out.print("Elemen list: ");
        list.display();

        // Menghapus elemen di tengah list
        list.removeMid();
        System.out.println("List setelah menghapus elemen tengah:");
        list.display();

        // Menghapus elemen tengah lagi hingga output: 2 1
        list.removeMid();
        System.out.println("List setelah penghapusan elemen tengah kedua:");
        list.display();
    }
}
