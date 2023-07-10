package com.example.strategy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LDPF implements ScheduleStrategy {

    @Override
    public List<Track> schedule(List<Track> tracks) {
        return tracks.stream().sorted(Comparator.comparing(Track::getDuration).reversed()).collect(Collectors.toList());
    }
}
