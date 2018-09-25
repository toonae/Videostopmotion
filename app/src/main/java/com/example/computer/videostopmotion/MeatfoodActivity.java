package com.example.computer.videostopmotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MeatfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meatfood);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.food,"ยำใหญ่",R.drawable.yam));
        mlist.add(new item(R.drawable.table,"แกงอ่อม",R.drawable.gangoom));
        Adapter adapter = new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
