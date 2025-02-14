/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ASUS
 */
public class NodeMain {
    public static void main(String[] args) {
        
        // Membuat 2 buah node n1 & n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        
        // Membuat relasi Node n1 & n2
        n1.setNext(n2);
        
        // Menampilkan Node n1 & n2 dengan Pointer p
        Node p = n1;
        while (p != null) { 
            System.out.printf("%d ", p.getNilai());
            p = p.getNext(); // Pindah ke node berikutnya
        }
    }
    
}
