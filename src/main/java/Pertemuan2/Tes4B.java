/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ASUS
 */
public class Tes4B {
    public static void main(String[] args) {
        // Membuat node-node
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        
        // Menyusun relasi antar node
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        
        // Menampilkan urutan node
        Node p = n1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext(); // Pindah ke node berikutnya
        }
    }
}