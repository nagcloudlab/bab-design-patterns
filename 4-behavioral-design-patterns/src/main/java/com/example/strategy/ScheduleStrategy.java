package com.example.strategy;

import java.util.List;

public interface ScheduleStrategy {
    List<Track> schedule(List<Track> tracks);
}
