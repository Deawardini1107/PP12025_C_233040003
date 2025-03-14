/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4Remove;

/**
 *
 * @author ASUS
 */
public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // === Latihan 2: Menambah elemen ke list ===
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7);
        System.out.println("List setelah penambahan elemen:");
        list.printList(); // Output: 7 9 2

        // Menghapus elemen di awal list (Latihan 1)
        list.removeHead();
        System.out.println("List setelah removeHead:");
        list.printList(); // Output: 9 2

        // Menghapus elemen di awal list sebanyak 3x
        list.removeHead();
        list.printList(); // Output: 2
        list.removeHead();
        list.printList(); // Output: (kosong)

        // === Latihan 4: Menambah elemen baru ke list ===
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2);
        System.out.println("List awal:");
        list.printList(); // Output: 2 6 3 5 1

        // Menghapus elemen di akhir (Latihan 3)
        list.removeTail();
        System.out.println("Setelah removeTail:");
        list.printList(); // Output: 2 6 3 5

        // Menghapus elemen di awal (Latihan 1)
        list.removeHead();
        System.out.println("Setelah removeHead:");
        list.printList(); // Output: 6 3 5

        // Menghapus elemen di akhir lagi (Latihan 3)
        list.removeTail();
        System.out.println("Setelah removeTail lagi:");
        list.printList(); // Output: 6 3
    }
}
