package com.example.cris.grocery_list.GroceryList;

/**
 * Created by cris on 10/23/2017.
 */

public class GroceryListInterface {

    interface view{
        void showGroceryList();
    }

    interface Presenter{
        void updateGroceryList(String item);
        void startAddItemActivity();
    }
}
