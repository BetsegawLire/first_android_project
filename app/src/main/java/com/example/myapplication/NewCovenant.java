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
import com.example.myapplication.adapter.Custom_adapter2;

import java.util.ArrayList;

import java.util.List;


public class NewCovenant extends Fragment {
    ExpandableListView expandableListView;
    Custom_adapter2 customadapter;

    List<Books> BookList;
    List<Chapter> ChapterList;

    long group_num;
    long chapter_num;
    long selected;
    long parent_name;
    String name;
ExpandableListAdapter expandableListAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.new_covenant,container,false);


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
                    final String[] chapters=getResources().getStringArray(R.array.matthew_chapters);

                    intentMethod(childPosition,groupPosition,chapters);
                }
              else if(parent_name==1){
                    final String[] chapters=getResources().getStringArray(R.array.Mark_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==2){
                    final String[] chapters=getResources().getStringArray(R.array.Luke_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==3){
                    final String[] chapters=getResources().getStringArray(R.array.Luke_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==4){
                    final String[] chapters=getResources().getStringArray(R.array.Luke_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==5){
                    final String[] chapters=getResources().getStringArray(R.array.Luke_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==6){
                    final String[] chapters=getResources().getStringArray(R.array.Corinthians1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==7){
                    final String[] chapters=getResources().getStringArray(R.array.Corinthians2_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==8){
                    final String[] chapters=getResources().getStringArray(R.array.Galatians_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==9){
                    final String[] chapters=getResources().getStringArray(R.array.Ephisians_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==10){
                    final String[] chapters=getResources().getStringArray(R.array.Philippians_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }

                else if(parent_name==11){
                    final String[] chapters=getResources().getStringArray(R.array.Colossians_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==12){
                    final String[] chapters=getResources().getStringArray(R.array.Thessalonians1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==13){
                    final String[] chapters=getResources().getStringArray(R.array.Thessalonians2_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==14){
                    final String[] chapters=getResources().getStringArray(R.array.Timothy1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==15){
                    final String[] chapters=getResources().getStringArray(R.array.Timothy2_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==16){
                    final String[] chapters=getResources().getStringArray(R.array.Titus_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==17){
                    final String[] chapters=getResources().getStringArray(R.array.Philemon_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==18){
                    final String[] chapters=getResources().getStringArray(R.array.Hebrew_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==19){
                    final String[] chapters=getResources().getStringArray(R.array.James_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==20){
                    final String[] chapters=getResources().getStringArray(R.array.Peter1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==21){
                    final String[] chapters=getResources().getStringArray(R.array.Peter2_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==22){
                    final String[] chapters=getResources().getStringArray(R.array.John1_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==23){
                    final String[] chapters=getResources().getStringArray(R.array.John2_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==24){
                    final String[] chapters=getResources().getStringArray(R.array.John3_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==25){
                    final String[] chapters=getResources().getStringArray(R.array.Jude_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
                else if(parent_name==26){
                    final String[] chapters=getResources().getStringArray(R.array.Revelation_chapters);
                    intentMethod(childPosition,groupPosition,chapters);
                }
//                else{
//                Toast.makeText(getActivity(), "SELECTED IS: "+selected+" "+parent_name, Toast.LENGTH_SHORT).show();
//           }


                //return true;
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


         name=getResources().getString(R.string.mathew);
        BookList.add(new Books(name,ChapterList));

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


         name=getResources().getString(R.string.mark);
        BookList.add(new Books(name,ChapterList));
        //BookList.add(new Books("Mark",ChapterList));

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
        BookList.add(new Books("Luke",ChapterList));

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

        BookList.add(new Books("John",ChapterList));

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


        BookList.add(new Books("Acts",ChapterList));

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



        BookList.add(new Books("Romans",ChapterList));

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


        BookList.add(new Books("1 Corinthians",ChapterList));


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

        BookList.add(new Books("2 Corinthians",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));


        BookList.add(new Books("Galatians",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));


        BookList.add(new Books("Ephesians",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));

        BookList.add(new Books("Philippians",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));

        BookList.add(new Books("Colossians",ChapterList));
        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));

        BookList.add(new Books("1 Thessalonians",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));


        BookList.add(new Books("2 Thessalonians",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));


        BookList.add(new Books("1 Timothy",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));

        BookList.add(new Books("2 Timothy",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));

        BookList.add(new Books("Titus",ChapterList));



        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        BookList.add(new Books("Philemon",ChapterList));



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


        BookList.add(new Books("Hebrews",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));
        ChapterList.add(new Chapter("Chapter 6"," "));


        BookList.add(new Books("James",ChapterList));

        ChapterList=new ArrayList<>();
        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));

        BookList.add(new Books("1 Peter",ChapterList));

        ChapterList=new ArrayList<>();
        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));

        BookList.add(new Books("2 Peter",ChapterList));


        ChapterList=new ArrayList<>();
        ChapterList.add(new Chapter("Chapter 1"," "));
        ChapterList.add(new Chapter("Chapter 2"," "));
        ChapterList.add(new Chapter("Chapter 3"," "));
        ChapterList.add(new Chapter("Chapter 4"," "));
        ChapterList.add(new Chapter("Chapter 5"," "));

        BookList.add(new Books("1 John",ChapterList));
        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));

        BookList.add(new Books("2 John",ChapterList));

        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));

        BookList.add(new Books("3 John",ChapterList));


        ChapterList=new ArrayList<>();

        ChapterList.add(new Chapter("Chapter 1"," "));

        BookList.add(new Books("Jude",ChapterList));

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

        BookList.add(new Books("Revelation",ChapterList));




        sendData();

    }

    void sendData(){
        customadapter=new Custom_adapter2(BookList,this.getContext());
        expandableListView.setAdapter(customadapter);
    }


}
