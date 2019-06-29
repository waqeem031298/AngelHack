package com.example.theapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment  {
    public TextView pay;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        pay= (TextView) v.findViewById(R.id.payment);
        pay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                PaymentFragment nextFrag= new PaymentFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return v;
    }


}
