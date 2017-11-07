package com.example.cris.grocery_list.GroceryList;

import android.content.Context;

import com.example.cris.grocery_list.MockDatabase;

/**
 * Created by cris on 10/23/2017.
 */

public class GroceryListPresenter implements GroceryListInterface.Presenter {


    private MockDatabase db;
    private Context appContext;
    private GroceryListInterface.view view;

    public GroceryListPresenter(GroceryListInterface.view groceryView, Context context){
        db = MockDatabase.getInstanous();
        appContext = context;
        view = groceryView;
    }
    @Override
    public void updateGroceryList() {
        ArrayList<String> groceries = MockDatabase.getALL();


        groceryView.showGroceryList(groceries);
    }

    @Override
    public void startAddItemActivity() {
        Intent addItemIntent = new Intent(appContext, AddItemActivity.close);
        appContext.startActivity(Intent);
    }
}
