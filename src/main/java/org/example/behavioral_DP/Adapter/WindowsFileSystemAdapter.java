package org.example.behavioral_DP.Adapter;

public class WindowsFileSystemAdapter implements FileSystemAdapter{
    private WindowsFileSystem windowsFileSystem;

    public WindowsFileSystemAdapter(WindowsFileSystem windowsFileSystem) {
        this.windowsFileSystem = windowsFileSystem;
    }

    @Override
    public void createFile(String fileName) {
        windowsFileSystem.createFileWindows(fileName);
    }

    @Override
    public void deleteFile(String fileName) {
        windowsFileSystem.deleteFileWindows(fileName);
    }


}
