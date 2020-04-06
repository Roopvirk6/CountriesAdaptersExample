package com.example.countriesadaptersexample.countriesadaptersexample.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.countriesadaptersexample.R;
import com.example.countriesadaptersexample.countriesadaptersexample.models.Country;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>
{
    private ArrayList<Country> countryList,countryArrayList;

    public CountriesAdapter(ArrayList<Country> countryArrayList)
    {
        this.countryArrayList = countryArrayList;
    };

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,parent,false);
        CountryViewHolder mCountryViewHolder = new CountryViewHolder(mView);
        return mCountryViewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull final CountryViewHolder holder, final int position) {
        Country mCountry = this.countryList.get(position);
        holder.txtname.setText(mCountry.getCountryName());
        holder.imgflag.setImageResource(mCountry.getCountryFlag());
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Country c = countryArrayList.get(position);
                Toast.makeText(holder.itemView.getContext(), "C : " + c.getCountryName(), Toast.LENGTH_SHORT).show();
                Log.d("CLICK", "hello");

                //Intent mIntent = new Intent(holder.itemView.getContext(), MainActivity.class);
                //Add Parameter - Parcalble or serializable
                //holder.itemView.getContext().startActivity(mIntent);

            }
        });
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

