package org.example.CompositeDesignPattern.FileSystem;

import java.util.List;

public class Directory implements FileSystem {
    private String dirName;
    private List<FileSystem> list;

    public Directory(String dirName, List<FileSystem> list) {
        this.dirName = dirName;
        this.list = list;
    }

    public void add(FileSystem fileSystem) {
        list.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory -> " + dirName);
        for (FileSystem fileSystem  : list) {
            fileSystem.ls();
        }
    }
}
