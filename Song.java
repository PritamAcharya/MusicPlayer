package com.example.my.musicplayer;

/**
 * Created by my on 6/30/2016.
 */
public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(){

    }

    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }
    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}

}
