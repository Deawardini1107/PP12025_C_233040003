/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author ASUS
 */
public class ListMain {
    public static void main(String[] args) {
        // Membuat list baru
        StrukturList list = new StrukturList();

        // Tambahkan elemen ke akhir list
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        // Tampilkan elemen list
        System.out.print("Elemen: ");
        list.displayElement();
    }
}

  
