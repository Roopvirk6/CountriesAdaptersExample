package com.example.countriesadaptersexample.countriesadaptersexample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.countriesadaptersexample.R;
import com.example.countriesadaptersexample.countriesadaptersexample.adapters.CountriesAdapter;
import com.example.countriesadaptersexample.countriesadaptersexample.models.Country;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
        private ArrayList<Country> country;
        private RecyclerView rvCountryList;
        private CountriesAdapter countryAdapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //RecyclerView
            rvCountryList = findViewById(R.id.rvCountryList);
            populateCountries();
            countryAdapter = new CountriesAdapter(country);
            // RecyclerView.LayoutManager laymanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,true);
            GridLayoutManager mGridManager = new GridLayoutManager(this,2);
            GridLayoutManager mGridM = new GridLayoutManager(this,2, RecyclerView.VERTICAL,false);
            rvCountryList.setLayoutManager(mGridM);
            rvCountryList.setAdapter(countryAdapter);
        }
        private void populateCountries()
        {
            country = new ArrayList<Country>();
            country.add(new Country(1,"AUs","test12344",R.drawable.ag));
            country.add(new Country(2,"Ind","test12344",R.drawable.ad));
            country.add(new Country(3,"UK","test12344",R.drawable.ae));
            country.add(new Country(4,"USA","test12344",R.drawable.af));
            country.add(new Country(5,"EUP","test12344",R.drawable.al));
            country.add(new Country(6,"test","test12344",R.drawable.am));
            country.add(new Country(7,"test","test12344",R.drawable.ao));
            country.add(new Country(8,"test","test12344",R.drawable.ar));
            country.add(new Country(9,"test","test12344",R.drawable.at));
            country.add(new Country(10,"test","test12344",R.drawable.au));
            country.add(new Country(11,"test","test12344",R.drawable.az));
            country.add(new Country(12,"test","test12344",R.drawable.ba));
            country.add(new Country(13,"test","test12344",R.drawable.bb));
            country.add(new Country(14,"test","test12344",R.drawable.be));
            country.add(new Country(15,"test11111","test12344",R.drawable.bd));
        }
    }



