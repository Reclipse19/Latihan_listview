package com.example.latihan_listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    List<Hero> heroList;
    //listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//menginisialisasi objek
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

//menambahkan beberapa values
        heroList.add(new Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        heroList.add(new Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        heroList.add(new Hero(R.drawable.batman, "Batman", "Justice League"));

//membuat adapter
        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);

        listView.setAdapter(adapter);
    }


}