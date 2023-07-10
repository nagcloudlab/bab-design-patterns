package com.example.strategy;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayList {

    private List<Track> tracks = new ArrayList<>();

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void setScheduleStrategy(ScheduleStrategy strategy) {
        this.tracks = strategy.schedule(this.tracks);
    }

    public Track getNextTrack() {
        if (!tracks.isEmpty()) {
            Track track = tracks.get(0);
            tracks.remove(0);
            return track;
        } else {
            return null;
        }
    }

}
