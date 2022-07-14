package com.example.myapplication.Model;

import java.util.ArrayList;
import java.util.List;

public class Books {
    String chaptername;
    List<Chapter> topicsList=new ArrayList<>();

    public Books(String chaptername, List<Chapter> topicsList) {
        this.chaptername = chaptername;
        this.topicsList = topicsList;
    }

    public String getChaptername() {
        return chaptername;
    }

    public List<Chapter> getTopicsList() {
        return topicsList;
    }
}
