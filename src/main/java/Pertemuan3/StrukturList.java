/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author ASUS
 */
public class StrukturList {
    private Node head; // Atribut head untuk menunjuk ke awal list

    // Constructor untuk inisialisasi list kosong
    public StrukturList() {
        this.head = null;
    }

    // Fungsi untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Fungsi addHead untuk menambahkan elemen di awal list
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    // Fungsi addTail untuk menambahkan elemen di akhir list
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    // Fungsi untuk menampilkan elemen-elemen dalam list
    public void displayElement() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " "); // Menampilkan data node
            temp = temp.getNext();
        }
        System.out.println(); // Pindah baris setelah menampilkan semua elemen
    }
}
