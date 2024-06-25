package com.example.android.songdetail.content;

import com.example.android.songdetail.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample song content.
 */
public class Utils {

    // An ArrayList of Songs
    public static final List<Song> ITEMS = new ArrayList<>();

    // The ID for the index into song titles.
    public static final String ID_KEY = "item_id";

    // The number of songs.
    private static final int COUNT = 13;

    public static final int[] teamIconResources = {
            R.drawable.fnc,
            R.drawable.tpa,
            R.drawable.skt,
            R.drawable.ssw,
            R.drawable.ssg,
            R.drawable.ig,
            R.drawable.fpx,
            R.drawable.dwg,
            R.drawable.edg,
            R.drawable.drx,
            R.drawable.t1,
    };

    /**
     * A Song item represents a song title, and song details.
     */
    public static class Song {
        public final String song_title;
        public final String details;
        public final int iconResource;


        private Song(String content, String details, int iconResource) {
            this.song_title = content;
            this.details = details;
            this.iconResource = iconResource;
        }
    }

    /**
     * Add an item to the array.
     *
     * @param item Each song
     */
    private static void addItem(Song item) {
        ITEMS.add(item);
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
        int newIconResource;

        switch (position) {
            case 0:
                newTitle = "Worlds 2011";
                newDetail = "Fnatic";
                newIconResource = teamIconResources[0];
                break;
            case 1:
                newTitle = "Worlds 2012";
                newDetail = "Taipei Assassins";
                newIconResource = teamIconResources[1];
                break;
            case 2:
                newTitle = "Worlds 2013";
                newDetail = "SK Telecom T1";
                newIconResource = teamIconResources[2];
                break;
            case 3:
                newTitle = "Worlds 2014";
                newDetail = "Samsung White";
                newIconResource = teamIconResources[3];
                break;
            case 4:
                newTitle = "Worlds 2015";
                newDetail = "SK Telecom T1 (x2)";
                newIconResource = teamIconResources[2];
                break;
            case 5:
                newTitle = "Worlds 2016";
                newDetail = "SK Telecom T1 (x3)";
                newIconResource = teamIconResources[2];
                break;
            case 6:
                newTitle = "Worlds 2017";
                newDetail = "Samsung Galaxy (x2)";
                newIconResource = teamIconResources[4];
                break;
            case 7:
                newTitle = "Worlds 2018";
                newDetail = "Invictus Gaming";
                newIconResource = teamIconResources[5];
                break;
            case 8:
                newTitle = "Worlds 2019";
                newDetail = "FunPlus Phoenix";
                newIconResource = teamIconResources[6];
                break;
            case 9:
                newTitle = "Worlds 2020";
                newDetail = "DAMWON Gaming";
                newIconResource = teamIconResources[7];
                break;
            case 10:
                newTitle = "Worlds 2021";
                newDetail = "EDward Gaming";
                newIconResource = teamIconResources[8];
                break;
            case 11:
                newTitle = "Worlds 2022";
                newDetail = "DRX";
                newIconResource = teamIconResources[9];
                break;
            default:
                newTitle = "Worlds 2023 - newest!";
                newDetail = "T1 (x4)";
                newIconResource = teamIconResources[10];
                break;
        }
        return new Song(newTitle, newDetail, newIconResource);
    }
}
