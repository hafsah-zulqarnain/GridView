package com.example.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private GridViewAdapter adapter;
    private List<gridItem> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.grid_view);
        itemList = new ArrayList<>();
        itemList.add(new gridItem(R.drawable.image1, "Camera"));
        itemList.add(new gridItem(R.drawable.image2, "Camera Roll"));
        itemList.add(new gridItem(R.drawable.image3, "Featured"));
        itemList.add(new gridItem(R.drawable.image4, "My Videos"));
        itemList.add(new gridItem(R.drawable.image5, "Likes"));
        itemList.add(new gridItem(R.drawable.image6, "Watch Later"));
        itemList.add(new gridItem(R.drawable.image7, "Stats"));
        itemList.add(new gridItem(R.drawable.image8, "Subscription"));
        itemList.add(new gridItem(R.drawable.image9, "Help"));

        adapter = new GridViewAdapter(this, itemList);
        gridView.setAdapter(adapter);
    }
}