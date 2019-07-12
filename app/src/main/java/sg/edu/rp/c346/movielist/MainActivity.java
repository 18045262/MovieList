package sg.edu.rp.c346.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<String> movieList;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie = findViewById(R.id.listViewMovie);
        movieList = new ArrayList<>();
        movieList.add("Avengers Infinity Way Release DATE: 2018.04");
        movieList.add("Justice League Release Date: 2017.11");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,movieList);
        lvMovie.setAdapter(adapter);

    }
}
