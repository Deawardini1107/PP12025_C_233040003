/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author ASUS
 */
public class GraphMain {
    public static void main(String[] args) {
        System.out.println("=== LATIHAN 5 ===");
        latihan5();

        System.out.println("\n=== LATIHAN 6 ===");
        latihan6();
    }

    // Latihan 5: Membuat graph sesuai gambar A - B - C - D - E
    public static void latihan5() {
        Graph graph = new Graph(5); // Buat graph dengan kapasitas 5 vertex

        // Tambah vertex
        graph.addVertex("A"); // 0
        graph.addVertex("B"); // 1
        graph.addVertex("C"); // 2
        graph.addVertex("D"); // 3
        graph.addVertex("E"); // 4

        // Tambah edge sesuai gambar di modul Latihan 5
        graph.addEdge(0, 1); // A - B
        graph.addEdge(0, 2); // A - C
        graph.addEdge(1, 3); // B - D
        graph.addEdge(2, 4); // C - E

        // Tampilkan adjacency matrix
        graph.adjacencyMatrix();

    }

    // Latihan 6: Memodifikasi graph sesuai gambar pada Latihan 6
    public static void latihan6() {
        Graph graph = new Graph(4); // Buat graph dengan kapasitas 4 vertex

        // Tambah vertex
        graph.addVertex("A"); // 0
        graph.addVertex("B"); // 1
        graph.addVertex("C"); // 2
        graph.addVertex("D"); // 3

        graph.addEdge(0, 1); // A - B
        graph.addEdge(0, 2); // A - C
        graph.addEdge(0, 3); // A - D
        graph.addEdge(1, 3); // B - D

        // Tampilkan adjacency matrix
        graph.adjacencyMatrix();

        // Struktur graph:
        //     B
        //    / \
        //   A - D
        //    \
        //     C
    }
}