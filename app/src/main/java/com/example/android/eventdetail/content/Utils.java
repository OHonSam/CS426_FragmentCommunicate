package com.example.android.eventdetail.content;


import com.example.android.eventdetail.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample song content.
 */
public class Utils {

    // An ArrayList of Songs
    public static final List<WorldsEvent> ITEMS = new ArrayList<>();

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
    public static class WorldsEvent {
        public final String song_title;
        public final String details;
        public final int iconResource;


        private WorldsEvent(String content, String details, int iconResource) {
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
    private static void addItem(WorldsEvent item) {
        ITEMS.add(item);
    }

    static {
        // Fill the array with songs.
        for (int i = 0; i < COUNT; i++) {
            addItem(createWorldsEventAtPosition(i));
        }
    }

    private static WorldsEvent createWorldsEventAtPosition(int position) {
        String newTitle;
        String newDetail;
        int newIconResource;

        switch (position) {
            case 0:
                newTitle = "Worlds 2011 - First competitive season";
                newDetail = "Fnatic";
                newIconResource = teamIconResources[0];
                break;
            case 1:
                newTitle = "Worlds 2012  - Expansion of participating teams";
                newDetail = "Taipei Assassins";
                newIconResource = teamIconResources[1];
                break;
            case 2:
                newTitle = "Worlds 2013 - The beginning of Korean domination";
                newDetail = "SK Telecom T1";
                newIconResource = teamIconResources[2];
                break;
            case 3:
                newTitle = "Worlds 2014 - Warriors";
                newDetail = "Samsung White";
                newIconResource = teamIconResources[3];
                break;
            case 4:
                newTitle = "Worlds 2015 - Worlds Collide";
                newDetail = "SK Telecom T1 (x2)";
                newIconResource = teamIconResources[2];
                break;
            case 5:
                newTitle = "Worlds 2016 - Ignite";
                newDetail = "SK Telecom T1 (x3)";
                newIconResource = teamIconResources[2];
                break;
            case 6:
                newTitle = "Worlds 2017 - Legends Never Die";
                newDetail = "Samsung Galaxy (x2)";
                newIconResource = teamIconResources[4];
                break;
            case 7:
                newTitle = "Worlds 2018 - Rise";
                newDetail = "Invictus Gaming";
                newIconResource = teamIconResources[5];
                break;
            case 8:
                newTitle = "Worlds 2019 - Phoenix";
                newDetail = "FunPlus Phoenix";
                newIconResource = teamIconResources[6];
                break;
            case 9:
                newTitle = "Worlds 2020 - Take Over";
                newDetail = "DAMWON Gaming";
                newIconResource = teamIconResources[7];
                break;
            case 10:
                newTitle = "Worlds 2021 - Burn It All Down";
                newDetail = "EDward Gaming";
                newIconResource = teamIconResources[8];
                break;
            case 11:
                newTitle = "Worlds 2022 - Stars Walkin'";
                newDetail = "DRX";
                newIconResource = teamIconResources[9];
                break;
            default:
                newTitle = "Worlds 2023 - GODS";
                newDetail = "T1 (x4)";
                newIconResource = teamIconResources[10];
                break;
        }
        return new WorldsEvent(newTitle, newDetail, newIconResource);
    }
}
