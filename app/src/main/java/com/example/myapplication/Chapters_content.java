package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Chapters_content extends AppCompatActivity {


    TextView textview;
    String content;
    FloatingActionButton back,forward;
    String child;
    String parent;
    int child_index;
    int parent_index;
   // final String[] chapters=new String[200];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapters_content);

        textview=findViewById(R.id.chapters_content);
        back=findViewById(R.id.back);
        forward=findViewById(R.id.forward);
        MainActivity m=new MainActivity();
//        m.expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//            @Override
//            public boolean onChildClick(ExpandableListView parent, View v, int i, int i1, long l) {

        //child=m.selected;
                //Toast.makeText(Chapters_content.this, "SELECTED IS: "+child, Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });



        Bundle b=getIntent().getExtras();
        String first=b.getString("chapter_1");
        child=b.getString("child_name");
        parent=b.getString("parent_name");
        child_index=b.getInt("child_index");
        parent_index=b.getInt("parent_index");

        final String[] chapters2=b.getStringArray("chapters_content");
        if(child_index==0){
            back.setVisibility(View.GONE);
        }
        if(child_index==(chapters2.length-1)){
            forward.setVisibility(View.GONE);
        }

        //final String[] chapters=b.getStringArray("chapters_content");
//        if(parent_index==0){
//            final String[] chapters=getResources().getStringArray(R.array.matthew_chapters);
//        }
//        else if(parent_index==1){
//            final String[] chapters=getResources().getStringArray(R.array.Mark_chapters);
//        }
//       content=getIntent().getStringExtra("");
        textview.setText(first);

        Toast.makeText(Chapters_content.this, "SELECTED IS: "+child+" "+child_index+" "+parent+" "+parent_index, Toast.LENGTH_SHORT).show();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String[] chapters=b.getStringArray("chapters_content");
                Toast.makeText(Chapters_content.this, "BACK BUTTON IS PRESSED ", Toast.LENGTH_LONG).show();
                String content2=chapters[child_index-1];

                if(child_index>=0){
                    forward.setVisibility(View.VISIBLE);
                }

                    child_index = child_index - 1;

                textview.setText(content2);

                if(child_index-1<0){
                    back.setVisibility(View.GONE);
                }
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] chapters=b.getStringArray("chapters_content");
                String content2=chapters[child_index+1];
                if(child_index>=0){
                    back.setVisibility(View.VISIBLE);
                }
//                if((child_index+1)==chapters.length){
//                    forward.setVisibility(View.GONE);
//                }
                child_index=child_index+1;
                textview.setText(content2);
                if(child_index>=(chapters.length-1)){
                    forward.setVisibility(View.GONE);
                }
                Toast.makeText(Chapters_content.this, "FORWARD BUTTON IS PRESSED", Toast.LENGTH_SHORT).show();
            }
        });
    }
}