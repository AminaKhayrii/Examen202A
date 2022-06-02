package com.example.examen202;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper {

    public static String Db_Name="enterprises.db";
    public static String table="Entreprise";
    public static String col1="id";
    public static String col2="raison";
    public static String col3="adresse";
    public static String col4="capital";

    public MyDatabase(Context c){
        super(c,Db_Name,null,1);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table " + table + "("+col1+" integer primary key autoincrement,"+col2+" TEXT,"+col3+" TEXT,"+col4+" double)";
        sqLiteDatabase.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql= "DROP TABLE " + table;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);

    }
}
