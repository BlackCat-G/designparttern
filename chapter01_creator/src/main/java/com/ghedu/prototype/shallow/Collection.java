package com.ghedu.prototype.shallow;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Collection implements Serializable, Cloneable {
    private String name;
    private List<Song> songList;

    public Collection() {
    }
    public Collection(Collection collection) {
        this.name = collection.getName();
        this.songList = collection.getSongList();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
