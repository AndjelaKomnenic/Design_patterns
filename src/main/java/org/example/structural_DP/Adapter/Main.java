package org.example.structural_DP.Adapter;

public class Main {
    public static void main(String[] args) {

    FileSystemAdapter fileSystemAdapter;
    if (isWindows()) {
        fileSystemAdapter = new WindowsFileSystemAdapter(new WindowsFileSystem());
    } else {
        fileSystemAdapter = new UnixFileSystemAdapter(new UnixFileSystem());
    }

        fileSystemAdapter.createFile("example.txt");
        fileSystemAdapter.deleteFile("example.txt");
    }

    private static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }
}
