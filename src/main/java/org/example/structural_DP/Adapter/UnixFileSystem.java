package org.example.structural_DP.Adapter;

public class UnixFileSystem {
    void createFileInUnix(String fileName) {
        System.out.println("Unix: Creating file " + fileName);
    }

    void deleteFileInUnix(String fileName) {
        System.out.println("Unix: Deleting file " + fileName);
    }
}
