package co.paulfran.paulfranco.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param locations  A List of Venue objects to display in a list
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID tittle_item
        TextView tittleTextView = (TextView) listItemView.findViewById(R.id.tittle_item);
        // Get the location tittle from the current Location object and
        // set this text on the Tittle TextView
        tittleTextView.setText(currentLocation.getLocationTittle());

        // Find the TextView in the list_item.xml layout with the ID text_item
        TextView textTextView = (TextView) listItemView.findViewById(R.id.text_item);
        // Get the location text from the current Location object and
        // set this text on the text TextView
        textTextView.setText(currentLocation.getLocationText());

        // Find the ImageView in the list_item.xml layout with the ID photo_item
        ImageView photoView = (ImageView) listItemView.findViewById(R.id.photo_item);
        // Get the image resource ID from the current Location object and
        // set the image to photoView
        photoView.setImageResource(currentLocation.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
