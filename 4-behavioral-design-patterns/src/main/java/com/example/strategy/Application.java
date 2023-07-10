package com.example.strategy;

public class Application {
    public static void main(String[] args) {

        MusicPlayList musicPlayList = new MusicPlayList();
        musicPlayList.addTrack(new Track("track-1", 3));
        musicPlayList.addTrack(new Track("track-2", 4));
        musicPlayList.addTrack(new Track("track-3", 2));

        //-------------------------------------------------------------
//        musicPlayList.setScheduleStrategy(new SDPF());
        musicPlayList.setScheduleStrategy(new LDPF());
        //-------------------------------------------------------------

        System.out.println(musicPlayList.getNextTrack());
        System.out.println(musicPlayList.getNextTrack());
        System.out.println(musicPlayList.getNextTrack());


    }
}
