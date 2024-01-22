package se.yrgo;

public class FilterPop implements FilterAlbum{
    @Override
    public boolean permit(Album album) {
        return album.genre().equals("Pop");
    }
}
