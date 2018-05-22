package fr.wildcodeschool.blablawild2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);

        TripModel tripModel = getIntent().getParcelableExtra(ItinerarySearchActivity.EXTRA_TRIP);
//        this.setTitle(String.format(getString(R.string.departure_to_destination), tripModel.getDeparture(), tripModel.getDestination()));

        /*ancien code
        ListView listTrip = findViewById(R.id.list_trip);
        ArrayList<TripModel> tripList = new ArrayList<>();

        tripList.add(new TripModel("Eric", "Cartman", "21/02/2017"));
        tripList.add(new TripModel("Stan", "Marsh", "21/02/2017"));
        tripList.add(new TripModel("Kenny", "Broflovski", "21/02/2017"));
        tripList.add(new TripModel("Kyle", "McCormick", "21/02/2017"));
        tripList.add(new TripModel("Wendy", "Testaburger", "21/02/2017"));

        TripAdapter adapter = new TripAdapter(this, tripList);
        listTrip.setAdapter(adapter);
        */

        RecyclerView listItineraries = findViewById(R.id.list_itineraries);
// TODO : préciser le type de layout de la liste

        final ArrayList<ItineraryModel> itineraryModels = new ArrayList<>();
        itineraryModels.add(new ItineraryModel("Paris", "Tokyo", "Eric Cartman", new Date(), 15));
        itineraryModels.add(new ItineraryModel("Paris", "Tokyo", "Stan Marsh", new Date(), 20));
        itineraryModels.add(new ItineraryModel("Paris", "Tokyo", "Kenny Broflovski", new Date(), 12));
        itineraryModels.add(new ItineraryModel("Paris", "Tokyo", "Kyle McCormick", new Date(), 18));
        itineraryModels.add(new ItineraryModel("Paris", "Tokyo", "Wendy Testaburger", new Date(), 16));


// TODO : afficher la liste d'itinéraires avec un adapter
        final ItineraryRecyclerAdapter adapter = new ItineraryRecyclerAdapter(itineraryModels);
        listItineraries.setAdapter(adapter);


        // TODO : préciser le type de layout de la liste
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listItineraries.setLayoutManager(layoutManager);

        listItineraries.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), listItineraries, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                String driver = itineraryModels.get(position).getDriver();
               // String driver = new position.ItineraryModel().getDriver();
                Toast.makeText(getApplicationContext(),  " Driver is " +driver, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
}
