package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.myapplication.Model.Books;
import com.example.myapplication.Model.Chapter;
import com.example.myapplication.adapter.Custom_adapter1;

import java.util.ArrayList;
import java.util.List;

public class OldCovenant extends Fragment {
    ExpandableListView expandableListView;
    Custom_adapter1 customadapter;
    List<Books> BookList;
    List<Chapter> ChapterList;
    long group_num;
    long chapter_num;
    long selected;
    long parent_name;
    ExpandableListAdapter expandableListAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.old_covenant,container,false);


    }


    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        expandableListView=(ExpandableListView) view.findViewById(R.id.expandablelistView);


        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int lastExpandedPosition =-1;
            @Override
            public void onGroupExpand(int groupPosition) {
                if(lastExpandedPosition !=-1 && groupPosition != lastExpandedPosition){
                    expandableListView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition =groupPosition;
            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View v, int groupPosition, int childPosition, long id) {
                selected= customadapter.getChildId(groupPosition,childPosition);
                parent_name= customadapter.getGroupId(groupPosition);

                if(parent_name==0){
                    final String[] chapters=getResources().getStringArray(R.array.Genesis_chapters);

                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==1){
                    final String[] chapters=getResources().getStringArray(R.array.Exodus_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==2){
                    final String[] chapters=getResources().getStringArray(R.array.Leviticus_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==3){
                    final String[] chapters=getResources().getStringArray(R.array.Numbers_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==4){
                    final String[] chapters=getResources().getStringArray(R.array.Dueteronomy_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==5){
                    final String[] chapters=getResources().getStringArray(R.array.Joshua_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==6){
                    final String[] chapters=getResources().getStringArray(R.array.Judges_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                if(parent_name==7){
                    final String[] chapters=getResources().getStringArray(R.array.Ruth_chapters);

                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==8){
                    final String[] chapters=getResources().getStringArray(R.array.Samuel1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==9){
                    final String[] chapters=getResources().getStringArray(R.array.Samuel2_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==10){
                    final String[] chapters=getResources().getStringArray(R.array.Kings1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==11){
                    final String[] chapters=getResources().getStringArray(R.array.Kings2_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==12){
                    final String[] chapters=getResources().getStringArray(R.array.Chronicles1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==13){
                    final String[] chapters=getResources().getStringArray(R.array.Chronicles2_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                if(parent_name==14){
                    final String[] chapters=getResources().getStringArray(R.array.Ezra_chapters);

                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==15){
                    final String[] chapters=getResources().getStringArray(R.array.Nehemiah_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==16){
                    final String[] chapters=getResources().getStringArray(R.array.Ester_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==17){
                    final String[] chapters=getResources().getStringArray(R.array.Job_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==18){
                    final String[] chapters=getResources().getStringArray(R.array.Psalms_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==19){
                    final String[] chapters=getResources().getStringArray(R.array.Proverb_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==20){
                    final String[] chapters=getResources().getStringArray(R.array.Ecclesiastes_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                if(parent_name==21){
                    final String[] chapters=getResources().getStringArray(R.array.Songs0ssolomon_chapters);

                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==22){
                    final String[] chapters=getResources().getStringArray(R.array.Isaiah_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==23){
                    final String[] chapters=getResources().getStringArray(R.array.Jeremiah_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==24){
                    final String[] chapters=getResources().getStringArray(R.array.Lamentations_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==25){
                    final String[] chapters=getResources().getStringArray(R.array.Ezekiel_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==26){
                    final String[] chapters=getResources().getStringArray(R.array.Daniel_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==27){
                    final String[] chapters=getResources().getStringArray(R.array.Hosea1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                if(parent_name==28){
                    final String[] chapters=getResources().getStringArray(R.array.Hosea2_chapters);

                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==29){
                    final String[] chapters=getResources().getStringArray(R.array.Amos_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==30){
                    final String[] chapters=getResources().getStringArray(R.array.Obadiah_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==31){
                    final String[] chapters=getResources().getStringArray(R.array.Jonah_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==32){
                    final String[] chapters=getResources().getStringArray(R.array.Micah_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==33){
                    final String[] chapters=getResources().getStringArray(R.array.Nahum_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==34){
                    final String[] chapters=getResources().getStringArray(R.array.Habakkuk_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                if(parent_name==35){
                    final String[] chapters=getResources().getStringArray(R.array.Zephaniah_chapters);

                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==36){
                    final String[] chapters=getResources().getStringArray(R.array.Haggai_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==37){
                    final String[] chapters=getResources().getStringArray(R.array.Zechariah_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==38){
                    final String[] chapters=getResources().getStringArray(R.array.Malachi_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
               
                //Toast.makeText(getActivity(),"Selected book "+group_num+ "chapter number"+chapter_num,Toast.LENGTH_SHORT).show();
                return true;
            }
        });




        addData();
        sendData();
    }
    public void intentMethod(int child,int parent, String[] chapters){
        String content=chapters[child];
        String child_name=customadapter.getChild(parent,child).toString();
        String parent_name=customadapter.getGroup(parent).toString();

        Intent intent=new Intent(getActivity(),Chapters_content.class);


        intent.putExtra("chapter_1",content);
        intent.putExtra("child_name",child_name);
        intent.putExtra("parent_name",parent_name);
        intent.putExtra("child_index",child);
        intent.putExtra("parent_index",parent);
        intent.putExtra("chapters_content",chapters);
        startActivity(intent);
    }

    void addData(){
        BookList=new ArrayList<>();
        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));
        ChapterList.add(new Chapter("Chapter 37"," "));
        ChapterList.add(new Chapter("Chapter 38"," "));
        ChapterList.add(new Chapter("Chapter 39"," "));
        ChapterList.add(new Chapter("Chapter 40"," "));
        ChapterList.add(new Chapter("Chapter 41"," "));
        ChapterList.add(new Chapter("Chapter 42"," "));
        ChapterList.add(new Chapter("Chapter 43"," "));
        ChapterList.add(new Chapter("Chapter 44"," "));
        ChapterList.add(new Chapter("Chapter 45"," "));
        ChapterList.add(new Chapter("Chapter 46"," "));
        ChapterList.add(new Chapter("Chapter 47"," "));
        ChapterList.add(new Chapter("Chapter 48"," "));
        ChapterList.add(new Chapter("Chapter 49"," "));
        ChapterList.add(new Chapter("Chapter 50"," "));

        BookList.add(new Books("Genesis",ChapterList));

        ChapterList=new ArrayList<>();
        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));
        ChapterList.add(new Chapter("Chapter 37"," "));
        ChapterList.add(new Chapter("Chapter 38"," "));
        ChapterList.add(new Chapter("Chapter 39"," "));
        ChapterList.add(new Chapter("Chapter 40"," "));

        BookList.add(new Books("Exodus",ChapterList));

        ChapterList=new ArrayList<>();
        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        BookList.add(new Books("Leviticus",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));
        BookList.add(new Books("Numbers",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));

        BookList.add(new Books("Dueteronomy",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));


        BookList.add(new Books("Joshua",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));

        BookList.add(new Books("Judges",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));

        BookList.add(new Books("Ruth",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));

        BookList.add(new Books("1 Samuel",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));


        BookList.add(new Books("2 Samuel",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));


        BookList.add(new Books("1 Kings",ChapterList));



        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));

        BookList.add(new Books("2 Kings",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));

        BookList.add(new Books("1 Chronicles",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));

        BookList.add(new Books("2 Chronicles",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));

        BookList.add(new Books("Ezra",ChapterList));



        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));


        BookList.add(new Books("Nehemiah",ChapterList));
        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));

        BookList.add(new Books("Ester",ChapterList));

        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));
        ChapterList.add(new Chapter("Chapter 37"," "));
        ChapterList.add(new Chapter("Chapter 38"," "));
        ChapterList.add(new Chapter("Chapter 39"," "));
        ChapterList.add(new Chapter("Chapter 40"," "));
        ChapterList.add(new Chapter("Chapter 41"," "));
        ChapterList.add(new Chapter("Chapter 42"," "));

        BookList.add(new Books("Job",ChapterList));


        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));
        ChapterList.add(new Chapter("Chapter 37"," "));
        ChapterList.add(new Chapter("Chapter 38"," "));
        ChapterList.add(new Chapter("Chapter 39"," "));
        ChapterList.add(new Chapter("Chapter 40"," "));
        ChapterList.add(new Chapter("Chapter 41"," "));
        ChapterList.add(new Chapter("Chapter 42"," "));
        ChapterList.add(new Chapter("Chapter 43"," "));
        ChapterList.add(new Chapter("Chapter 44"," "));
        ChapterList.add(new Chapter("Chapter 45"," "));
        ChapterList.add(new Chapter("Chapter 46"," "));
        ChapterList.add(new Chapter("Chapter 47"," "));
        ChapterList.add(new Chapter("Chapter 48"," "));
        ChapterList.add(new Chapter("Chapter 49"," "));
        ChapterList.add(new Chapter("Chapter 50"," "));
        ChapterList.add(new Chapter("Chapter 51"," "));
        ChapterList.add(new Chapter("Chapter 52"," "));
        ChapterList.add(new Chapter("Chapter 53"," "));
        ChapterList.add(new Chapter("Chapter 54"," "));
        ChapterList.add(new Chapter("Chapter 55"," "));
        ChapterList.add(new Chapter("Chapter 56"," "));
        ChapterList.add(new Chapter("Chapter 57"," "));
        ChapterList.add(new Chapter("Chapter 58"," "));
        ChapterList.add(new Chapter("Chapter 59"," "));
        ChapterList.add(new Chapter("Chapter 60"," "));
        ChapterList.add(new Chapter("Chapter 61"," "));
        ChapterList.add(new Chapter("Chapter 62"," "));
        ChapterList.add(new Chapter("Chapter 63"," "));
        ChapterList.add(new Chapter("Chapter 64"," "));
        ChapterList.add(new Chapter("Chapter 65"," "));
        ChapterList.add(new Chapter("Chapter 66"," "));
        ChapterList.add(new Chapter("Chapter 67"," "));
        ChapterList.add(new Chapter("Chapter 68"," "));
        ChapterList.add(new Chapter("Chapter 69"," "));
        ChapterList.add(new Chapter("Chapter 70"," "));
        ChapterList.add(new Chapter("Chapter 71"," "));
        ChapterList.add(new Chapter("Chapter 72"," "));
        ChapterList.add(new Chapter("Chapter 73"," "));
        ChapterList.add(new Chapter("Chapter 74"," "));
        ChapterList.add(new Chapter("Chapter 75"," "));
        ChapterList.add(new Chapter("Chapter 76"," "));
        ChapterList.add(new Chapter("Chapter 77"," "));
        ChapterList.add(new Chapter("Chapter 78"," "));
        ChapterList.add(new Chapter("Chapter 79"," "));
        ChapterList.add(new Chapter("Chapter 80"," "));
        ChapterList.add(new Chapter("Chapter 81"," "));
        ChapterList.add(new Chapter("Chapter 82"," "));
        ChapterList.add(new Chapter("Chapter 83"," "));
        ChapterList.add(new Chapter("Chapter 84"," "));
        ChapterList.add(new Chapter("Chapter 85"," "));
        ChapterList.add(new Chapter("Chapter 86"," "));
        ChapterList.add(new Chapter("Chapter 87"," "));
        ChapterList.add(new Chapter("Chapter 88"," "));
        ChapterList.add(new Chapter("Chapter 89"," "));
        ChapterList.add(new Chapter("Chapter 90"," "));
        ChapterList.add(new Chapter("Chapter 91"," "));
        ChapterList.add(new Chapter("Chapter 92"," "));
        ChapterList.add(new Chapter("Chapter 93"," "));
        ChapterList.add(new Chapter("Chapter 94"," "));
        ChapterList.add(new Chapter("Chapter 95"," "));
        ChapterList.add(new Chapter("Chapter 96"," "));
        ChapterList.add(new Chapter("Chapter 97"," "));
        ChapterList.add(new Chapter("Chapter 98"," "));
        ChapterList.add(new Chapter("Chapter 99"," "));
        ChapterList.add(new Chapter("Chapter 100"," "));
        ChapterList.add(new Chapter("Chapter 101"," "));
        ChapterList.add(new Chapter("Chapter 102"," "));
        ChapterList.add(new Chapter("Chapter 103"," "));
        ChapterList.add(new Chapter("Chapter 104"," "));
        ChapterList.add(new Chapter("Chapter 105"," "));
        ChapterList.add(new Chapter("Chapter 106"," "));
        ChapterList.add(new Chapter("Chapter 107"," "));
        ChapterList.add(new Chapter("Chapter 108"," "));
        ChapterList.add(new Chapter("Chapter 109"," "));
        ChapterList.add(new Chapter("Chapter 110"," "));
        ChapterList.add(new Chapter("Chapter 111"," "));
        ChapterList.add(new Chapter("Chapter 112"," "));
        ChapterList.add(new Chapter("Chapter 113"," "));
        ChapterList.add(new Chapter("Chapter 114"," "));
        ChapterList.add(new Chapter("Chapter 115"," "));
        ChapterList.add(new Chapter("Chapter 116"," "));
        ChapterList.add(new Chapter("Chapter 117"," "));
        ChapterList.add(new Chapter("Chapter 118"," "));
        ChapterList.add(new Chapter("Chapter 119"," "));
        ChapterList.add(new Chapter("Chapter 120"," "));
        ChapterList.add(new Chapter("Chapter 121"," "));
        ChapterList.add(new Chapter("Chapter 122"," "));
        ChapterList.add(new Chapter("Chapter 123"," "));
        ChapterList.add(new Chapter("Chapter 124"," "));
        ChapterList.add(new Chapter("Chapter 125"," "));
        ChapterList.add(new Chapter("Chapter 126"," "));
        ChapterList.add(new Chapter("Chapter 127"," "));
        ChapterList.add(new Chapter("Chapter 128"," "));
        ChapterList.add(new Chapter("Chapter 129"," "));
        ChapterList.add(new Chapter("Chapter 130"," "));
        ChapterList.add(new Chapter("Chapter 131"," "));
        ChapterList.add(new Chapter("Chapter 132"," "));
        ChapterList.add(new Chapter("Chapter 133"," "));
        ChapterList.add(new Chapter("Chapter 134"," "));
        ChapterList.add(new Chapter("Chapter 135"," "));
        ChapterList.add(new Chapter("Chapter 136"," "));
        ChapterList.add(new Chapter("Chapter 137"," "));
        ChapterList.add(new Chapter("Chapter 138"," "));
        ChapterList.add(new Chapter("Chapter 139"," "));
        ChapterList.add(new Chapter("Chapter 140"," "));
        ChapterList.add(new Chapter("Chapter 141"," "));
        ChapterList.add(new Chapter("Chapter 142"," "));
        ChapterList.add(new Chapter("Chapter 143"," "));
        ChapterList.add(new Chapter("Chapter 144"," "));
        ChapterList.add(new Chapter("Chapter 145"," "));
        ChapterList.add(new Chapter("Chapter 146"," "));
        ChapterList.add(new Chapter("Chapter 147"," "));
        ChapterList.add(new Chapter("Chapter 148"," "));
        ChapterList.add(new Chapter("Chapter 149"," "));
        ChapterList.add(new Chapter("Chapter 150"," "));

        BookList.add(new Books("Psalms",ChapterList));

        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));

        BookList.add(new Books("Proverb",ChapterList));


        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));

        BookList.add(new Books("Ecclesiastes",ChapterList));


        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));

        BookList.add(new Books("Songs of Solomon",ChapterList));


        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));
        ChapterList.add(new Chapter("Chapter 37"," "));
        ChapterList.add(new Chapter("Chapter 38"," "));
        ChapterList.add(new Chapter("Chapter 39"," "));
        ChapterList.add(new Chapter("Chapter 40"," "));
        ChapterList.add(new Chapter("Chapter 41"," "));
        ChapterList.add(new Chapter("Chapter 42"," "));
        ChapterList.add(new Chapter("Chapter 43"," "));
        ChapterList.add(new Chapter("Chapter 44"," "));
        ChapterList.add(new Chapter("Chapter 45"," "));
        ChapterList.add(new Chapter("Chapter 46"," "));
        ChapterList.add(new Chapter("Chapter 47"," "));
        ChapterList.add(new Chapter("Chapter 48"," "));
        ChapterList.add(new Chapter("Chapter 49"," "));
        ChapterList.add(new Chapter("Chapter 50"," "));
        ChapterList.add(new Chapter("Chapter 51"," "));
        ChapterList.add(new Chapter("Chapter 52"," "));
        ChapterList.add(new Chapter("Chapter 53"," "));
        ChapterList.add(new Chapter("Chapter 54"," "));
        ChapterList.add(new Chapter("Chapter 55"," "));
        ChapterList.add(new Chapter("Chapter 56"," "));
        ChapterList.add(new Chapter("Chapter 57"," "));
        ChapterList.add(new Chapter("Chapter 58"," "));
        ChapterList.add(new Chapter("Chapter 59"," "));
        ChapterList.add(new Chapter("Chapter 60"," "));
        ChapterList.add(new Chapter("Chapter 61"," "));
        ChapterList.add(new Chapter("Chapter 62"," "));
        ChapterList.add(new Chapter("Chapter 63"," "));
        ChapterList.add(new Chapter("Chapter 64"," "));
        ChapterList.add(new Chapter("Chapter 65"," "));
        ChapterList.add(new Chapter("Chapter 66"," "));

        BookList.add(new Books("Isaiah",ChapterList));





        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));
        ChapterList.add(new Chapter("Chapter 37"," "));
        ChapterList.add(new Chapter("Chapter 38"," "));
        ChapterList.add(new Chapter("Chapter 39"," "));
        ChapterList.add(new Chapter("Chapter 40"," "));
        ChapterList.add(new Chapter("Chapter 41"," "));
        ChapterList.add(new Chapter("Chapter 42"," "));
        ChapterList.add(new Chapter("Chapter 43"," "));
        ChapterList.add(new Chapter("Chapter 44"," "));
        ChapterList.add(new Chapter("Chapter 45"," "));
        ChapterList.add(new Chapter("Chapter 46"," "));
        ChapterList.add(new Chapter("Chapter 47"," "));
        ChapterList.add(new Chapter("Chapter 48"," "));
        ChapterList.add(new Chapter("Chapter 49"," "));
        ChapterList.add(new Chapter("Chapter 50"," "));
        ChapterList.add(new Chapter("Chapter 51"," "));
        ChapterList.add(new Chapter("Chapter 52"," "));

        BookList.add(new Books("Jeremiah",ChapterList));


        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));


        BookList.add(new Books("Lamentations",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));
        ChapterList.add(new Chapter("Chapter 15"," "));
        ChapterList.add(new Chapter("Chapter 16"," "));
        ChapterList.add(new Chapter("Chapter 17"," "));
        ChapterList.add(new Chapter("Chapter 18"," "));
        ChapterList.add(new Chapter("Chapter 19"," "));
        ChapterList.add(new Chapter("Chapter 20"," "));
        ChapterList.add(new Chapter("Chapter 21"," "));
        ChapterList.add(new Chapter("Chapter 22"," "));
        ChapterList.add(new Chapter("Chapter 23"," "));
        ChapterList.add(new Chapter("Chapter 24"," "));
        ChapterList.add(new Chapter("Chapter 25"," "));
        ChapterList.add(new Chapter("Chapter 26"," "));
        ChapterList.add(new Chapter("Chapter 27"," "));
        ChapterList.add(new Chapter("Chapter 28"," "));
        ChapterList.add(new Chapter("Chapter 29"," "));
        ChapterList.add(new Chapter("Chapter 30"," "));
        ChapterList.add(new Chapter("Chapter 31"," "));
        ChapterList.add(new Chapter("Chapter 32"," "));
        ChapterList.add(new Chapter("Chapter 33"," "));
        ChapterList.add(new Chapter("Chapter 34"," "));
        ChapterList.add(new Chapter("Chapter 35"," "));
        ChapterList.add(new Chapter("Chapter 36"," "));
        ChapterList.add(new Chapter("Chapter 37"," "));
        ChapterList.add(new Chapter("Chapter 38"," "));
        ChapterList.add(new Chapter("Chapter 39"," "));
        ChapterList.add(new Chapter("Chapter 40"," "));
        ChapterList.add(new Chapter("Chapter 41"," "));
        ChapterList.add(new Chapter("Chapter 42"," "));
        ChapterList.add(new Chapter("Chapter 43"," "));
        ChapterList.add(new Chapter("Chapter 44"," "));
        ChapterList.add(new Chapter("Chapter 45"," "));
        ChapterList.add(new Chapter("Chapter 46"," "));
        ChapterList.add(new Chapter("Chapter 47"," "));
        ChapterList.add(new Chapter("Chapter 48"," "));

        BookList.add(new Books("Ezekiel",ChapterList));


        ChapterList=new ArrayList<>();


        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));

        BookList.add(new Books("Daniel",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));

        BookList.add(new Books("Hosea",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        BookList.add(new Books("Hosea",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        BookList.add(new Books("Amos",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        BookList.add(new Books("Obadiah",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        BookList.add(new Books("Jonah",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        BookList.add(new Books("Micah",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        BookList.add(new Books("Nahum",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        BookList.add(new Books("Habakkuk",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        BookList.add(new Books("Zephaniah",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        BookList.add(new Books("Haggai",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));
        ChapterList.add(new Chapter("Chapter 7"," "));
        ChapterList.add(new Chapter("Chapter 8"," "));
        ChapterList.add(new Chapter("Chapter 9"," "));
        ChapterList.add(new Chapter("Chapter 10"," "));
        ChapterList.add(new Chapter("Chapter 11"," "));
        ChapterList.add(new Chapter("Chapter 12"," "));
        ChapterList.add(new Chapter("Chapter 13"," "));
        ChapterList.add(new Chapter("Chapter 14"," "));

        BookList.add(new Books("Zechariah",ChapterList));
        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        BookList.add(new Books("Malachi",ChapterList));



        sendData();

    }
    void sendData(){
        customadapter=new Custom_adapter1(BookList,this.getContext());
        expandableListView.setAdapter(customadapter);
    }
}


