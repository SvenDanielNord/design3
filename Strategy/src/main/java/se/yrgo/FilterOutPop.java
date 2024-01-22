package se.yrgo;

public class FilterOutPop implements FilterAlbum{
    @Override
    public boolean filterGenre(Album album) {
        return !album.genre().equals("Pop");
    }


}
