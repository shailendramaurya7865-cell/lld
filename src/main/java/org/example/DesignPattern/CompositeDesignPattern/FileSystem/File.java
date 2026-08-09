package org.example.DesignPattern.CompositeDesignPattern.FileSystem;

public class File implements FileSystem {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File -> " + fileName);
    }
}
