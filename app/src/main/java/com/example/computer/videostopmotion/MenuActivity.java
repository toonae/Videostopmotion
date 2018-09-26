package com.example.computer.videostopmotion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);
       // hGrid = (GridLayout)findViewById(R.id.hGrid);
       // sGrid = (GridLayout)findViewById(R.id.sGrid);
        //fGrid = (GridLayout)findViewById(R.id.fGrid);

        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid){
        for (int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            //final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View view){
                    //if (finalI ==0) {
                        Intent m = new Intent(MenuActivity.this, MeatfoodActivity.class);
                        startActivity(m);
                    }
                   // else if (finalI ==1)
                  {
                        Intent s = new Intent(MenuActivity.this, SweetfoodActivity.class);
                        startActivity(s);
                   // }
                }
            });
        }
    }
}
