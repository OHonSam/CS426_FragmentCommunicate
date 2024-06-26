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
    private static final int EVENTS_COUNT = 13;

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

    public static final int[] themeIconResources = {
            R.drawable.season1,
            R.drawable.season2,
            R.drawable.season3,
            R.drawable.season4,
            R.drawable.season5,
            R.drawable.season6,
            R.drawable.season7,
            R.drawable.season8,
            R.drawable.season9,
            R.drawable.season10,
            R.drawable.season11,
            R.drawable.season12,
            R.drawable.season13,
    };

    /**
     * A Song item represents a song title, and song details.
     */
    public static class WorldsEvent {
        public final String theme_title;
        public final String details;
        public final int winnerIconResource;
        public final int themeIconResource;


        private WorldsEvent(String content, String details, int winnerIconResource, int themeIconResource) {
            this.theme_title = content;
            this.details = details;
            this.winnerIconResource = winnerIconResource;
            this.themeIconResource = themeIconResource;
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
        for (int i = 0; i < EVENTS_COUNT; i++) {
            addItem(createWorldsEventAtPosition(i));
        }
    }

    private static WorldsEvent createWorldsEventAtPosition(int position) {
        String newTitle;
        String newDetail;
        int newWinnerIconResource;
        int newThemeIconResource;

        switch (position) {
            case 0:
                newTitle = "Worlds 2011 - First competitive season";
                newDetail = "Fnatic";
                newWinnerIconResource = teamIconResources[0];
                newThemeIconResource = themeIconResources[0];
                break;
            case 1:
                newTitle = "Worlds 2012  - Expansion of participating teams";
                newDetail = "Taipei Assassins";
                newWinnerIconResource = teamIconResources[1];
                newThemeIconResource = themeIconResources[1];
                break;
            case 2:
                newTitle = "Worlds 2013 - The beginning of Korean domination";
                newDetail = "SK Telecom T1";
                newWinnerIconResource = teamIconResources[2];
                newThemeIconResource = themeIconResources[2];
                break;
            case 3:
                newTitle = "Worlds 2014 - Warriors";
                newDetail = "Samsung White";
                newWinnerIconResource = teamIconResources[3];
                newThemeIconResource = themeIconResources[3];
                break;
            case 4:
                newTitle = "Worlds 2015 - Worlds Collide";
                newDetail = "SK Telecom T1 (x2)";
                newWinnerIconResource = teamIconResources[2];
                newThemeIconResource = themeIconResources[4];
                break;
            case 5:
                newTitle = "Worlds 2016 - Ignite";
                newDetail = "SK Telecom T1 (x3)";
                newWinnerIconResource = teamIconResources[2];
                newThemeIconResource = themeIconResources[5];
                break;
            case 6:
                newTitle = "Worlds 2017 - Legends Never Die";
                newDetail = "Samsung Galaxy (x2)";
                newWinnerIconResource = teamIconResources[4];
                newThemeIconResource = themeIconResources[6];
                break;
            case 7:
                newTitle = "Worlds 2018 - Rise";
                newDetail = "Invictus Gaming";
                newWinnerIconResource = teamIconResources[5];
                newThemeIconResource = themeIconResources[7];
                break;
            case 8:
                newTitle = "Worlds 2019 - Phoenix";
                newDetail = "FunPlus Phoenix";
                newWinnerIconResource = teamIconResources[6];
                newThemeIconResource = themeIconResources[8];
                break;
            case 9:
                newTitle = "Worlds 2020 - Take Over";
                newDetail = "DAMWON Gaming";
                newWinnerIconResource = teamIconResources[7];
                newThemeIconResource = themeIconResources[9];
                break;
            case 10:
                newTitle = "Worlds 2021 - Burn It All Down";
                newDetail = "EDward Gaming";
                newWinnerIconResource = teamIconResources[8];
                newThemeIconResource = themeIconResources[10];
                break;
            case 11:
                newTitle = "Worlds 2022 - Stars Walkin'";
                newDetail = "DRX";
                newWinnerIconResource = teamIconResources[9];
                newThemeIconResource = themeIconResources[11];
                break;
            default:
                newTitle = "Worlds 2023 - GODS";
                newDetail = "T1 (x4)";
                newWinnerIconResource = teamIconResources[10];
                newThemeIconResource = themeIconResources[12];
                break;
        }
        return new WorldsEvent(newTitle, newDetail, newWinnerIconResource, newThemeIconResource);
    }
}
