/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4Remove;

/**
 *
 * @author ASUS
 */

public class Node {
    int data;  // Menyimpan nilai data
    Node next; // Pointer ke node berikutnya

    // Konstruktor untuk membuat node baru
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
