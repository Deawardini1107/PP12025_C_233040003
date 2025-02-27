/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class StrukturListTest { 
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        LinkedList<Integer> list = new LinkedList<>();

        // 2. Tambah elemen 3 di akhir list
        list.add(3);

        // 3. Tambah elemen 4 di akhir list
        list.add(4);

        // 4. Tambah elemen 7 di index 2
        list.add(2, 7);

        // 5. Tambah elemen 8 di index 2
        list.add(2, 8);

        // 6. Tambah elemen 5 di awal list
        list.addFirst(5);

        // 7. Tampilkan elemen list
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
