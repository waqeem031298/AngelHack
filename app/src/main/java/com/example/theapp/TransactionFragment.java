package com.example.theapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransactionFragment extends Fragment {

    static final String[] StringArray = new String[] {"Jun 25, 2019","Facebook","-$150","Jun 24, 2019","Enoc Petrol","-$12.57","Jun 24, 2019","Carrefour","-$20",
            "Jun 21, 2019","Sharaf DG","-$200","Jun 21, 2019","Withdrawal","-$100","Jun 20, 2019","Deposit","+$600",
            "Jun 16, 2019","A Cafe","-$10","Jun 10, 2019","Amazon.ae","-$180","Jun 8, 2019","Noon.com","-$50",
            "Jun 7, 2019","Carrefour","-$18"};
    public TransactionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r =  inflater.inflate(R.layout.fragment_transaction, container, false);
        GridView gridView = (GridView) r.findViewById(R.id.gview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, StringArray);
        gridView.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
        gridView.setAdapter(adapter);
        return r;
    }

}
