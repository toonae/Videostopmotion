package com.example.computer.videostopmotion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class FragmentExplore extends Fragment {


    VideoView VideoView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.explore_fragment, container, false);

        VideoView = (VideoView) view.findViewById(R.id.vdoFragment);
        VideoView.setMediaController(new MediaController(getContext()));
        Uri video = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.vyam);
        VideoView.setVideoURI(video);
        VideoView.start();

        return view;
    }
}















