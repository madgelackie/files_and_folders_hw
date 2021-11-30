package com.codeclan.filefolderservice.filesHW.models;

import java.util.List;

public class Folder {
    private Long id;
    private String title;
    private List<File> files;
    private User user;

    public Folder(String title, List<File> files, User user) {
        this.title = title;
        this.files = files;
        this.user = user;
    }

    public Folder(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addFile(File file){
        this.files.add(file);
    }
}
