package com.example.android.songdetail.content;

import android.widget.ImageView;

import com.example.android.songdetail.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample song content.
 */
public class SongUtils {

    // An ArrayList of Songs
    public static final List<Song> SONG_ITEMS = new ArrayList<>();

    // The ID for the index into song titles.
    public static final String SONG_ID_KEY = "item_id";

    // The number of songs.
    private static final int COUNT = 13;

    /**
     * A Song item represents a song title, and song details.
     */
    public static class Song {
        public final String song_title;
        public final String details;
//        public final ImageView icon;

        private Song(String content, String details) {
            this.song_title = content;
            this.details = details;
//            this.icon = icon;
        }
    }

    /**
     * Add an item to the array.
     *
     * @param item Each song
     */
    private static void addItem(Song item) {
        SONG_ITEMS.add(item);
    }

    static {
        // Fill the array with songs.
        for (int i = 0; i < COUNT; i++) {
            addItem(createSongAtPosition(i));
        }
    }

    private static Song createSongAtPosition(int position) {
        String newTitle;
        String newDetail;
//        ImageView newIcon = (ImageView) newIcon.findViewById(R.id.team_icon_image);

        switch (position) {
            case 0:
                newTitle = "Worlds 2011";
                newDetail = "Fnatic";
                break;
            case 1:
                newTitle = "Worlds 2012";
                newDetail = "Taipei Assassins";
                break;
            case 2:
                newTitle = "Worlds 2013";
                newDetail = "SK Telecom T1";
                break;
            case 3:
                newTitle = "Worlds 2014";
                newDetail = "Samsung White";
                break;
            case 4:
                newTitle = "Worlds 2015";
                newDetail = "SK Telecom T1 (x2)";
                break;
            case 5:
                newTitle = "Worlds 2016";
                newDetail = "SK Telecom T1 (x3)";
                break;
            case 6:
                newTitle = "Worlds 2017";
                newDetail = "Samsung Galaxy (x2)";
                break;
            case 7:
                newTitle = "Worlds 2018";
                newDetail = "Invictus Gaming";
                break;
            case 8:
                newTitle = "Worlds 2019";
                newDetail = "FunPlus Phoenix";
                break;
            case 9:
                newTitle = "Worlds 2020";
                newDetail = "DAMWON Gaming";
                break;
            case 10:
                newTitle = "Worlds 2021";
                newDetail = "EDward Gaming";
                break;
            case 11:
                newTitle = "Worlds 2022";
                newDetail = "DRX";
                break;
            default:
                newTitle = "Worlds 2023 - newest!";
                newDetail = "T1";
                break;
        }
        return new Song(newTitle, newDetail);
    }
}
