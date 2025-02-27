/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author ASUS
 */
public class Node {
    private final double data;
    private Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    public double getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

