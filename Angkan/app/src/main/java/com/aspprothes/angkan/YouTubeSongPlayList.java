package com.aspprothes.angkan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class YouTubeSongPlayList extends AppCompatActivity {
    private ListView myListView;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setStatusBarColor(getColor(R.color.barclr));
        this.getWindow().setNavigationBarColor(getColor(R.color.barclr));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.you_tube_song_play_list);

        myListView = findViewById(R.id.myListView);
        String songTitle[] = getResources().getStringArray(R.array.song_title);

        arrayAdapter = new ArrayAdapter<>(YouTubeSongPlayList.this,R.layout.my_custom_list_items,R.id.listViewItems,songTitle);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link1);
                    Intent intent0 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent0);
                }else if (position == 1){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link2);
                    Intent intent1 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent1);
                }else if (position == 2){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link3);
                    Intent intent2 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent2);
                }else if (position == 3){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link4);
                    Intent intent3 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent3);
                }else if (position == 4){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link5);
                    Intent intent4 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent4);
                }else if (position == 5){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link6);
                    Intent intent5 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent5);
                }else if (position == 6){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link7);
                    Intent intent6 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent6);
                }else if (position == 7){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link8);
                    Intent intent7 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent7);
                }else if (position == 8){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link9);
                    Intent intent8 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent8);
                }else if (position == 9){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link10);
                    Intent intent9 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent9);
                }else if (position == 10){
                    WebYoutubeViewer.getWebUrl = getString(R.string.link11);
                    Intent intent10 = new Intent(YouTubeSongPlayList.this, WebYoutubeViewer.class);
                    startActivity(intent10);
                }

            }
        });

    }


    // ======================  Menu Show start here =====================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.search_menu,menu);
        MenuItem menuItem = menu.findItem(R.id.searchMenuId);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
    // ======================  Menu Show End here =====================


}