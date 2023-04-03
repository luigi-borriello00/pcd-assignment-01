package model;

import java.io.File;
import java.util.List;

public class FileLoader {
    private String path;
    private List<File> files;

    FileLoader(String path){
        this.path = path;
        this.loadFiles();
    }

    // Given a path, load all the files in the path having .java extension
    private void loadFiles(){
        File folder = new File(this.path);
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                this.files.add(file);
            }
        }
    }

    public List<File> getFiles(){
        return this.files;
    }
}
