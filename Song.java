package com.practice.Java;

public class Song implements Cloneable {
    String name;
    String lang;
    Artist artist;
    public Song(String name, String lang, Artist artist) {
        this.name = name;
        this.lang = lang;
        this.artist = artist;
    }

    public Song(Song song) {
        this.name = song.name;
        this.lang = song.lang;
        this.artist = new Artist(song.artist);
    }

    @Override
    public Song clone() throws CloneNotSupportedException {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Song) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }

    public void printAll() {
        System.out.println("name: " + this.name);
        System.out.println("lang: " + this.lang);
        System.out.println("Artist: ");
        System.out.print("    ");
        System.out.println("name: " + this.artist.name);
        System.out.print("    ");
        System.out.println("Stats: ");
        System.out.print("        ");
        System.out.println("streams: " + this.artist.stats.streams);

    }
}
