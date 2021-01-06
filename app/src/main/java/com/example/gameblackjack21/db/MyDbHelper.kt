package com.example.gameblackjack21

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.gameblackjack21.db.MyDbNameClass
import com.example.gameblackjack21.db.MyDbNameClass.DATABASE_VERSION

class MyDbHelper(context: Context) : SQLiteOpenHelper (context, MyDbNameClass.DATABASE_NAME_,
    null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(MyDbNameClass.CREATE_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion : Int) {
        db?.execSQL(MyDbNameClass.SQL_DELETE_TABLE)
        onCreate(db)
    }

}