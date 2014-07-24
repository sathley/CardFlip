package com.appacitive.cardflip;



import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class CardFrontFragment extends Fragment {

    public CardFrontFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_card_front, container, false);
        ((RelativeLayout)view.findViewById(R.id.front)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((CardFlipActivity)getActivity()).flipCard();
            }
        });
        return view;
    }
}
