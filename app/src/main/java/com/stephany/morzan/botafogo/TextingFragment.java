package com.stephany.morzan.botafogo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextingFragment extends Fragment {

    @BindView(R.id.ete_answer) EditText ete_answer;
    @BindView(R.id.tvi_question)TextView tvi_question;
    @BindView(R.id.but_sendAnswer) Button but_send;

    //usar librería Crouton

    public TextingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ButterKnife.bind(this.getActivity());
        return inflater.inflate(R.layout.fragment_texting, container, false);
    }

}
