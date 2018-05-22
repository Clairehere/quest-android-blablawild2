package fr.wildcodeschool.blablawild2;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ItineraryRecyclerAdapter extends RecyclerView.Adapter{

    // TODO : ajouter le constructeur initialisant la liste d'itinéraires

    private ArrayList<ItineraryModel> mItineraries;

    public ItineraryRecyclerAdapter(ArrayList<ItineraryModel> itineraries) {
        mItineraries = itineraries;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // TODO : associer le layout utilisé par un item
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // TODO : action à l'affichage d'un item

    }

    @Override
    public int getItemCount() {
        // TODO : modifier pour afficher le nombre d'itinéraires
        return mItineraries.size();
    }
}
