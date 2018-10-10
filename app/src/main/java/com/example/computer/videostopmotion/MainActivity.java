package com.example.computer.videostopmotion;

import android.media.MediaPlayer;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager= (ViewPager) findViewById(R.id.viewpaper_id);


        volumnImageButton = findViewById(R.id.volume);
        mediaPlayer = MediaPlayer.create(this, R.raw.mgangoom);
        volumnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }else {
                    mediaPlayer.start();

                }

            }
        });

        ViewPaperAdapter adapter = new ViewPaperAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentQuiz(),"บทประพันธ์");
        adapter.AddFragment(new FragmentExplore(),"Video");
        adapter.AddFragment(new FragmentStore(),"วิธีทำ");
        adapter.AddFragment(new FragmentDetail(),"ส่วนผสม");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    public void clickBack(View view) {
        finish();
    }
}
