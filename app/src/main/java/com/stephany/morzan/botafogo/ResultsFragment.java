package com.stephany.morzan.botafogo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lecho.lib.hellocharts.view.PieChartView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultsFragment extends Fragment {

    @BindView(R.id.tvi_resultTitle)TextView result_title;
    @BindView(R.id.moodchart)PieChartView moodchart;

    public ResultsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ButterKnife.bind(this.getActivity());
        return inflater.inflate(R.layout.fragment_results, container, false);
    }

}
