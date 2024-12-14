package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.myapplication.Adapter;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    ArrayList<String> source;
    RecyclerView recyclerView;

    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    Adapter adapter;
    LinearLayoutManager HorizontalLayout;
    View ChildView;
  //  int RecyclerViewItemPosition;
  ImageView ayurveda;
  TextView ayurvedatext;
    ImageView Homepathy;
    ImageView Yoga;
    ImageView meditation;
    ImageView physio;
    ImageView Nutrition;
    ImageView supliments;
    ImageView Herbal;
    ImageView Weightgain;
    ImageView physcology;
    public HomeFragment() {
        // Required empty public constructor

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Homepathy=view.findViewById(R.id.homepathy);
        ayurveda = view.findViewById(R.id.ayurveda);

        physio=view.findViewById(R.id.physio);
        Yoga=view.findViewById(R.id.yoga);

        ayurvedatext=view.findViewById(R.id.ayurvedatext);
        Nutrition=view.findViewById(R.id.nutrition);
        meditation=view.findViewById(R.id.meditation);
        Weightgain=view.findViewById(R.id.weightgain);
        supliments=view.findViewById(R.id.supplement);
        Herbal=view.findViewById(R.id.herbal);
physcology=view.findViewById(R.id.phychology);
       //recyclerView = (RecyclerView) view.findViewById(R.id.Recyclerview);
//        RecyclerViewLayoutManager = new LinearLayoutManager(getActivity());
//
//        // Set LayoutManager on Recycler View
//        recyclerView.setLayoutManager(RecyclerViewLayoutManager);
//
//        // Adding items to RecyclerView.
//
//
//        // calling constructor of adapter
//        // with source list as a parameter
//        adapter = new Adapter(source);
//
//        // Set Horizontal Layout Manager
//        // for Recycler view
//        HorizontalLayout
//                = new LinearLayoutManager(
//                getActivity(),
//                LinearLayoutManager.HORIZONTAL,
//                false);
//        recyclerView.setLayoutManager(HorizontalLayout);
//
//        // Set adapter on recycler view
//        recyclerView.setAdapter(adapter);

        ayurveda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getActivity(),Ayurveda.class);
                        startActivity(i);
            }
        });

        ayurvedatext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o= new Intent(getActivity(),Ayurveda.class);
                startActivity(o);
            }
        });

        Homepathy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(getActivity(),Homeopathy.class);
                startActivity(j);
            }
        });
        physcology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p =new Intent(getActivity(),Psychology.class);
                startActivity(p);
            }
        });

        Yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(getActivity(), com.example.myapplication.Yoga.class);
                startActivity(j);
            }
        });
meditation.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent k =new Intent(getActivity(),com.example.myapplication.Meditation.class);
        startActivity(k);
    }
});


physio.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent w=new Intent(getActivity(), com.example.myapplication.physio.class);
        startActivity(w);
    }
});
Nutrition.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent e=new Intent(getActivity(), com.example.myapplication.Nutrition.class);
        startActivity(e);
    }
});
supliments.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent t=new Intent(getActivity(),Supliments.class);
        startActivity(t);
    }
});
     Herbal.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent y=new Intent(getActivity(), com.example.myapplication.Herbal.class);
             startActivity(y);
         }
     });

Weightgain.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent y= new Intent(getActivity(),WeightGain.class);
        startActivity(y);
    }
});

        return view;
        
    }




}




