package com.ghedu.prototype.shallow;

public class Song {
    private String title;
    private String author;

    public Song(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
