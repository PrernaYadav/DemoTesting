package com.example.starlingsoftwares.demotesting;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class MainActivity extends AppCompatActivity {
    Shimmer shimmer;
    ShimmerTextView shimmerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shimmer = new Shimmer();

        shimmerTextView=findViewById(R.id.shimmer_tv);
        shimmer.start(shimmerTextView);

    }
}
