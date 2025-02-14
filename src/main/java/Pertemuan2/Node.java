/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ASUS
 */
public class Node {
    private final int nilai;
    private Node next;

    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null;
    }

    public int getNilai() {
        return nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
