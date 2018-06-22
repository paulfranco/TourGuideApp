package co.paulfran.paulfranco.tourguideapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Find all of the views for the Menu
         */
        // Find the View that shows the hotels category
        ImageView hotels = (ImageView) findViewById(R.id.ic_hotel);
        // Find the View that shows the Bars category
        ImageView bars = (ImageView) findViewById(R.id.ic_bar);
        // Find the View that shows the Restaurants/Dining Category
        ImageView restaurants = (ImageView) findViewById(R.id.ic_dining);
        // Find the View that shows the Shopping Category
        ImageView shopping = (ImageView) findViewById(R.id.ic_shopping);

        /*
         * Set OnClick Listeners on the Views in the menu
         */
        // Set a click listener on the Hotels View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Hotels category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HotelsActivity}
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);

                // Start the new activity
                startActivity(hotelsIntent);
            }
        });
        // Set a click listener on the Bar View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Bar Category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BarActivity}
                Intent barIntent = new Intent(MainActivity.this, BarActivity.class);

                // Start the new activity
                startActivity(barIntent);
            }
        });
        // Set a click listener on the Restaurant/Dining View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Restaurant/Dining category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantActivity}
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });
        // Set a click listener on the Shopping View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Shopping Category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });


    }
}
