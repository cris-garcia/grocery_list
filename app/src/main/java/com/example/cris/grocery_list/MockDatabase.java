package com.example.cris.grocery_list;

import java.util.ArrayList;

/**
 * Created by cris on 10/23/2017.
 */

public class MockDatabase {

    private ArrayList<String> db= new ArrayList<String>();
    static private MockDatabase instanous;

    private MockDatabase(){
    }

    public static synchronized MockDatabase getInstanous(){
        if (instanous == null){
            instanous = new MockDatabase();
        }
        return instanous;
    }

    public void add(String item){
        db.add(item);
    }

    public ArrayList<String> getAll(){
        return db;
    }
}

