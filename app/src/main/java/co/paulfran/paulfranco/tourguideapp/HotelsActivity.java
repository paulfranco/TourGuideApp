package co.paulfran.paulfranco.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        // Find the View that shows the category header
        TextView header = (TextView) findViewById(R.id.Header);

        // Set the correct category name
        header.setText(R.string.hotels_header);

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
        // Find the View that shows the home category
        ImageView home = (ImageView) findViewById(R.id.ic_home);

        /*
         * Set OnClick Listeners on the Views in the menu
         */
        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(HotelsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
                finish();
            }
        });

        // Set a click listener on the Bar View
        bars.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Bar Category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BarActivity}
                Intent barIntent = new Intent(HotelsActivity.this, BarActivity.class);

                // Start the new activity
                startActivity(barIntent);
            }
        });
        // Set a click listener on the Restaurant/Dining View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Restaurant/Dining category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantActivity}
                Intent restaurantIntent = new Intent(HotelsActivity.this, RestaurantActivity.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });
        // Set a click listener on the Shopping View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Shopping Category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(HotelsActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

        // Create an ArrayList of Location objects
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.paramount_hotel), getString(R.string.paramount_text), R.drawable.paramount_hotel));
        locations.add(new Location(getString(R.string.hotel_sorrento), getString(R.string.hotel_sorrento_text), R.drawable.hotel_sorrento));
        locations.add(new Location(getString(R.string.maxwell_hotel), getString(R.string.maxwell_text), R.drawable.maxwell_hotel));

        // Create an {@link LocationAdapter}, whose data source is a list of
        // {@link Location}s. The adapter knows how to create list item views for each item
        // in the list.
        LocationAdapter locationAdapter = new LocationAdapter(this, locations);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(locationAdapter);
    }
}
