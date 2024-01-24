package org.example.structural_DP.Adapter;

public class UnixFileSystemAdapter implements FileSystemAdapter{
    private UnixFileSystem unixFileSystem;

    public UnixFileSystemAdapter(UnixFileSystem unixFileSystem) {
        this.unixFileSystem = unixFileSystem;
    }

    @Override
    public void createFile(String fileName) {
        unixFileSystem.createFileInUnix(fileName);
    }

    @Override
    public void deleteFile(String fileName) {
        unixFileSystem.deleteFileInUnix(fileName);
    }
}
