package se.yrgo;

public class FilterPop implements FilterAlbum{
    @Override
    public boolean filterGenre(Album album) {
        return album.genre().equals("Pop");
    }
}
