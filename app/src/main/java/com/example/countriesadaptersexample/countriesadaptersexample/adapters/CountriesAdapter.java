package com.example.countriesadaptersexample.countriesadaptersexample.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.countriesadaptersexample.R;
import com.example.countriesadaptersexample.countriesadaptersexample.models.Country;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>
{
    private ArrayList<Country> countryList;
    public CountriesAdapter(ArrayList<Country> countryList)
    {
        this.countryList = countryList;
    }
    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,parent,false);
        CountryViewHolder mCountryViewHolder = new CountryViewHolder(mView);
        return mCountryViewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Country mCountry = this.countryList.get(position);
        holder.txtname.setText(mCountry.getCountryName());
        holder.imgflag.setImageResource(mCountry.getCountryFlag());
    }
    @Override
    public int getItemCount() {
        return this.countryList.size();
    }
    public class CountryViewHolder extends RecyclerView.ViewHolder {
        TextView txtname;
        ImageView imgflag;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname = itemView.findViewById(R.id.textView2);
            imgflag = itemView.findViewById(R.id.imageView);
        }
    }
}

