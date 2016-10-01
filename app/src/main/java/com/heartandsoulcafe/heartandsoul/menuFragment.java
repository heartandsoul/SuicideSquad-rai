package com.heartandsoulcafe.heartandsoul;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class menuFragment extends Fragment {

    View rootView;
    TextView  txt;


    public menuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_menu, container, false);

        Typeface myTypeface = Typeface.createFromAsset(getActivity().getAssets(), "Pacifico.ttf");
        txt = (TextView) rootView.findViewById(R.id.tvHotfood);
        txt.setTypeface(myTypeface);
        txt = (TextView) rootView.findViewById(R.id.tvBreakfast);
        txt.setTypeface(myTypeface);
        txt = (TextView) rootView.findViewById(R.id.tvLunch);
        txt.setTypeface(myTypeface);
        txt = (TextView) rootView.findViewById(R.id.tvDrinks);
        txt.setTypeface(myTypeface);
        txt = (TextView) rootView.findViewById(R.id.tvSweets);
        txt.setTypeface(myTypeface);




        
        return rootView;


    }

}
