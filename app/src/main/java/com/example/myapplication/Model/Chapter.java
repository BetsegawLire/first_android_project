package com.example.myapplication.Model;

public class Chapter {
    String Chapter,fileName;

    public Chapter(String Chapter, String fileName) {
        this.Chapter = Chapter;
        this.fileName = fileName;
    }

    public String getChapter() {
        return Chapter;
    }

    public String getFileName() {
        return fileName;
    }
}
