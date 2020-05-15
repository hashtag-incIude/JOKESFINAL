package com.ak.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ak.jokedisplay.databinding.ActivityJokeBinding;

public class JokeActivity extends AppCompatActivity {

    private String jokeResult;

    private ActivityJokeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJokeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent dataReceivedFromJavaLibrary = getIntent();
        jokeResult = dataReceivedFromJavaLibrary.getStringExtra(getResources().getString(R.string.intent_joke_data));

        binding.displayJokeTextView.setText(jokeResult);
    }
}
