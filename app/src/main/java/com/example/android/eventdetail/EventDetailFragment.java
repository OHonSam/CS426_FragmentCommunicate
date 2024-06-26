package com.example.android.eventdetail;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.eventdetail.content.Utils;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EventDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventDetailFragment extends Fragment {
    public Utils.WorldsEvent mWorldsEvent;

    public EventDetailFragment() {
        // Required empty public constructor
    }

    public static EventDetailFragment newInstance (int selectedSong) {
        EventDetailFragment fragment = new EventDetailFragment();
        // Set the bundle arguments for the fragment.
        Bundle arguments = new Bundle();
        arguments.putInt(Utils.ID_KEY, selectedSong);
        fragment.setArguments(arguments);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(Utils.ID_KEY)) {
            // Load the content specified by the fragment arguments.
            mWorldsEvent = Utils.ITEMS.get(getArguments()
                    .getInt(Utils.ID_KEY));
        }
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(R.layout.event_detail, container, false);
        // TODO: Show the detail information in a TextView.
        if (mWorldsEvent != null) {
            ((TextView) rootView.findViewById(R.id.event_detail))
                    .setText(mWorldsEvent.details);
            ((ImageView) rootView.findViewById(R.id.team_icon_image)).setImageResource(mWorldsEvent.iconResource);
        }
        return rootView;
    }
}