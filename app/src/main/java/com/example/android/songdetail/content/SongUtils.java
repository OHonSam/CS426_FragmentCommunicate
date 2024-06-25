/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.songdetail.content;

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

        private Song(String content, String details) {
            this.song_title = content;
            this.details = details;
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
                newDetail = "Samsung Galaxy White";
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
