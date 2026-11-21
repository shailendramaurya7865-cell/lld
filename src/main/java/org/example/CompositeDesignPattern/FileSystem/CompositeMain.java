package org.example.CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
    static void main(String[] args) {
        List<FileSystem> listMarvel = new ArrayList<>();
        File file1 = new File();
        file1.setFileName("Iron Man 1");
        listMarvel.add(file1);

        File file2 = new File();
        file2.setFileName("Iron Man 2");
        listMarvel.add(file2);

        File file3 = new File();
        file3.setFileName("Iron Man 3");
        listMarvel.add(file3);

        Directory marvel = new Directory("Marvel", listMarvel);

        List<FileSystem> listDC = new ArrayList<>();

        File file4 = new File();
        file4.setFileName("Batman Begins");
        listDC.add(file4);

        File file5 = new File();
        file5.setFileName("The Dark Knight");
        listDC.add(file5);

        File file6 = new File();
        file6.setFileName("Dark Knight Rises");
        listDC.add(file6);

        Directory dc = new Directory("DC", listDC);

        List<FileSystem> movies = new ArrayList<>();
        movies.add(dc);
        movies.add(marvel);

        Directory dirMovies = new Directory("Movies", movies);
        dirMovies.ls();
    }
}
