package com.example.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Settings extends AppCompatActivity {
    Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        b1=findViewById(R.id.lang);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showChangeLanguageDialog();
            }
        });
    }

    private void showChangeLanguageDialog() {

        final String[]listitems ={"English","አማርኛ"};
        AlertDialog.Builder mbuilder=new AlertDialog.Builder(Settings.this);
        mbuilder.setTitle("Choose language");
        mbuilder.setSingleChoiceItems(listitems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if(which ==0){
                    setLocale("en");
                    recreate();
                }
                else if(which == 1){
                    setLocale("am");
                    recreate();
                }
                dialog.dismiss();

            }
        });
        AlertDialog  mDialog=mbuilder.create();
        mDialog.show();
    }
    private void setLocale(String lang) {
        Locale locale=new Locale(lang);
        Locale.setDefault(locale);
        Configuration congig=new Configuration();
        congig.locale=locale;
        getBaseContext().getResources().updateConfiguration(congig,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("My language",lang);
        editor.apply();
    }

    public void loadLocale(){
        SharedPreferences preferences=getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language=preferences.getString("My language","");
        setLocale(language);
    }
}
