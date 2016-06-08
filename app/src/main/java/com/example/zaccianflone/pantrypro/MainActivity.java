package com.example.zaccianflone.pantrypro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ShoppingList shop = new ShoppingList();

    }
}

class Recipe {

    protected ArrayList<Item> ingredients;
    private String name;


    //This method should create new recipe
    void CreateRecipe (){


    }

    //This method should add ingredients to existing recipe
    void EditRecipe (){

    }



    void testCreate () {
        assert (!ingredients.isEmpty());
        assert (ingredients.size() <= 10000);//tests for corruption by limiting size to arbitrary amount
        assert (name.length() != 0);
        assert (name.length() <= 1000);
    }


    void testEdit() {
        Item test=null;
        assert(ingredients.add(test));      //tests add and remove
        assert(ingredients.remove(test));
    }


}

class Item {

}

// commit by Ben Wright 6/7/16
class ShoppingList {
    ShoppingList(){}


    // it will be a good idea for addToPantry to be overloaded
    // that way you can have one that handles a recipe and the other a item

    // overload 1
    void addToPantry(Recipe recipe){
        //pass in a recipe

        // Create a new row in the Recipe Table for the recipe

        // Add in the recipe with its other values (parameters if any)

        // complete recipe update.

    }

    // overload 2
    void addToPantry(Item item, String expiration) {
        // pass in a item

        // Create a new row in the item table

        // Add in the item with its expiration date

        // Complete item update
    }

    // compare a recipe to another
    void comprRecipe() {
        // pass in two recipes for comparing


    }

}

//Test Comment Ben3
//Test Comment Kylor
//Test Comment Ben
//Test comment Kylor2
//test comment ben2