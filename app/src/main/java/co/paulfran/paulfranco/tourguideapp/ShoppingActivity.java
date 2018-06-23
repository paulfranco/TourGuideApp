package co.paulfran.paulfranco.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        // Find the View that shows the category header
        TextView header = (TextView) findViewById(R.id.Header);

        // Set the correct category name
        header.setText(R.string.shopping_header);

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
                Intent homeIntent = new Intent(ShoppingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
                finish();
            }
        });

        // Set a click listener on the Hotels View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Hotel Category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HotelsActivity}
                Intent hotelsIntent = new Intent(ShoppingActivity.this, HotelsActivity.class);

                // Start the new activity
                startActivity(hotelsIntent);
            }
        });
        // Set a click listener on the Bar View
        bars.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Bar category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BarActivity}
                Intent barIntent = new Intent(ShoppingActivity.this, BarActivity.class);

                // Start the new activity
                startActivity(barIntent);
            }
        });
        // Set a click listener on the Restaurant View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Restaurant Category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantActivity}
                Intent restaurantIntent = new Intent(ShoppingActivity.this, RestaurantActivity.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });

        // Create an ArrayList of Location objects
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.space_needle), getString(R.string.space_needle_text), R.drawable.space_needle));
        locations.add(new Location(getString(R.string.pikes_place), getString(R.string.pikes_place_text), R.drawable.pikes_place));
        locations.add(new Location(getString(R.string.pioneer_square), getString(R.string.pioneer_square_text), R.drawable.pioneer_square));

        // Create an {@link LocationAdapter}, whose data source is a list of
        // {@link Location}s. The adapter knows how to create list item views for each item
        // in the list.
        LocationAdapter locationAdapter = new LocationAdapter(this, locations);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(locationAdapter);
    }
}
