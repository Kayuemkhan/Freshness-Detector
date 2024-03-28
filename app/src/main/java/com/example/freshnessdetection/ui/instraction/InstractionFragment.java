package com.example.freshnessdetection.ui.instraction;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freshnessdetection.R;
import com.example.freshnessdetection.ui.instraction.model.TimeLineModel;

import java.util.ArrayList;

public class InstractionFragment extends Fragment {
    private final ArrayList<TimeLineModel> mDataList  = new ArrayList<>();

    private RecyclerView recyclerView;
    public InstractionFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setDataListItems();
        initRecyclerView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_instraction, container, false);
        recyclerView = view.findViewById(R.id.recyclerViews);
        return view;
    }
    private void setDataListItems() {
        mDataList.add(new TimeLineModel("Item successfully delivered", "", "INACTIVE"));
        mDataList.add(new TimeLineModel("Courier is out to delivery your order", "2017-02-12 08:00", "ACTIVE"));
        mDataList.add(new TimeLineModel("Order placed successfully", "2017-02-10 14:00", "COMPLETED"));
    }

    private void initRecyclerView() {
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        ExampleTimeLineAdapter exampleTimeLineAdapter = new ExampleTimeLineAdapter(mDataList);
        recyclerView.setAdapter(exampleTimeLineAdapter);
    }
}