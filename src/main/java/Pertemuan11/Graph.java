/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Graph {
    private final ArrayList<Vertex> vertexList;
    private final int[][] adjMatrix;
    private final int maxVertices;

    public Graph(int maxVertices) {
        this.maxVertices = maxVertices;
        vertexList = new ArrayList<>();
        adjMatrix = new int[maxVertices][maxVertices];

        // Inisialisasi adjacency matrix dengan 0
        for (int i = 0; i < maxVertices; i++) {
            for (int j = 0; j < maxVertices; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void addVertex(String label) {
        if (vertexList.size() < maxVertices) {
            vertexList.add(new Vertex(label));
        } else {
            System.out.println("Jumlah maksimum vertex tercapai.");
        }
    }

    public void addEdge(int start, int end) {
        if (start >= 0 && end >= 0 && start < vertexList.size() && end < vertexList.size()) {
            adjMatrix[start][end] = 1;
            adjMatrix[end][start] = 1; // jika graph tidak berarah
        } else {
            System.out.println("Indeks vertex tidak valid.");
        }
    }

    public void adjacencyMatrix() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < vertexList.size(); i++) {
            for (int j = 0; j < vertexList.size(); j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}