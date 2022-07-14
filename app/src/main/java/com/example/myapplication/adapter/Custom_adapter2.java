package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;


import com.example.myapplication.Model.Books;
import com.example.myapplication.R;


import java.util.List;

public class Custom_adapter2 extends BaseExpandableListAdapter {
    static List<Books> chapterlist;
    Context context;

    public Custom_adapter2(List<Books> chapterlist, Context  context) {
        this.chapterlist = chapterlist;
        this.context = context;
    }


    @Override
    public int getGroupCount() {
        return chapterlist.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return chapterlist.get(i).getTopicsList().size();
    }

    @Override
    public Object getGroup(int i) {
        return chapterlist.get(i);
    }
    @Override
    public Object getChild(int i, int i1) {
        return chapterlist.get(i).getTopicsList().get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean isExpanded, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.books_item_new,parent,false);
        TextView ChapterName= convertView.findViewById(R.id.Book_name);
        ChapterName.setText(chapterlist.get(i).getChaptername());
        return convertView;
    }

    @Override
    public View getChildView(final int i, final int i1, boolean isLastChild, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.chapter_item_new,parent,false);
        TextView TopicName= convertView.findViewById(R.id.chapter_num);
        TopicName.setText(chapterlist.get(i).getTopicsList().get(i1).getChapter());

     /*   CardView cardview=convertView.findViewById(R.id.hapter_click);

        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=(new Intent(context, FullView.class));
                intent.putExtra("fileName",chapterlist.get(i).getTopicsList().get(i1).getFileName());
                context.startActivity(intent);

            }
        });*/
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
