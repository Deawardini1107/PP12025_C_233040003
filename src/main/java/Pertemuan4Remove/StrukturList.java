/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4Remove;

/**
 *
 * @author ASUS
 */
public class StrukturList {
    private Node head;

    // Menambahkan elemen di awal list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Menampilkan elemen dalam list
    public void printList() {
        if (head == null) {
            System.out.println("(List kosong)");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Metode untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Menghapus elemen pertama (Latihan 1)
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node temp = head;
            head = head.next;
            dispose(temp);
        }
    }

    // Fungsi untuk menghapus node secara aman
    private void dispose(Node temp) {
        temp.next = null;
        temp = null;
    }

    // Menghapus elemen terakhir (Latihan 3)
    public void removeTail() {
        if (head == null) {
            System.out.println("List kosong, tidak bisa removeTail.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Kelas Node untuk menyimpan data
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
