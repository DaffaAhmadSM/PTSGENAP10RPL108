package com.example.ptsgenap10rpl108;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class DashboardMenu extends AppCompatActivity {
    RecyclerView RecyclerView;
    DashboardAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_menu);

        RecyclerView = findViewById(R.id.recycleView);
        myAdapter = new DashboardAdapter(this, getMyList());

        RecyclerView.setAdapter(myAdapter);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DashboardMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


    private ArrayList<DashboardModel> getMyList() {

        ArrayList<DashboardModel> models = new ArrayList<>();

        DashboardModel m = new DashboardModel();
        m.setMenu("newsfeed");
        m.setDeskripsi("This is description..");
        m.setImage(R.drawable.ic_baseline_assignment_24);
        models.add(m);

        m = new DashboardModel();
        m.setMenu("Profile");
        m.setDeskripsi("This is description..");
        m.setImage(R.drawable.ic_baseline_person_24);
        models.add(m);

        m = new DashboardModel();
        m.setMenu("Setting");
        m.setDeskripsi("This is description..");
        m.setImage(R.drawable.ic_baseline_settings_24);
        models.add(m);


        return models;

    }

}