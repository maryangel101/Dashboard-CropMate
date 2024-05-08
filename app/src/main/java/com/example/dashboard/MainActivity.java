package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView dashboardTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        dashboardTextView = findViewById(R.id.textView);

        // Set Dashboard text
        dashboardTextView.setText("Dashboard");

        // Set click listeners for CardViews
        findViewById(R.id.marketplace_card).setOnClickListener(this);
        findViewById(R.id.recommendations_card).setOnClickListener(this);
        findViewById(R.id.community_card).setOnClickListener(this);
        findViewById(R.id.weather_card).setOnClickListener(this);
        findViewById(R.id.feedback_card).setOnClickListener(this);
        findViewById(R.id.news_card).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        if (view.getId() == R.id.marketplace_card) {
            // Handle click for the Marketplace CardView
            // For example, you can open a new activity or fragment to display marketplace content
            intent = new Intent(MainActivity.this, MarketplaceActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.recommendations_card) {
            // Handle click for the Recommendations CardView
            // Implement your logic here
        } else if (view.getId() == R.id.community_card) {
            // Handle click for the Community CardView
            // Implement your logic here
        } else if (view.getId() == R.id.weather_card) {
            // Handle click for the Weather CardView
            // Implement your logic here
        } else if (view.getId() == R.id.feedback_card) {
            // Handle click for the Feedback CardView
            // Implement your logic here
        } else if (view.getId() == R.id.news_card) {
            // Handle click for the News CardView
            // Implement your logic here
        }
    }
}

