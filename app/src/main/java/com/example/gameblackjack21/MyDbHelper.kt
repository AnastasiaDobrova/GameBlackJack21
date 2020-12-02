package com.example.gameblackjack21

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.gameblackjack21.db.MyDbNameClass
import com.example.gameblackjack21.db.MyDbNameClass.DATABASE_VERSION

class MyDbHelper(context: Context) : SQLiteOpenHelper (context, MyDbNameClass.DATABASE_NAME_, null, DATABASE_VERSION) {
    override fun onCreate(p0: SQLiteDatabase?) {

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

}