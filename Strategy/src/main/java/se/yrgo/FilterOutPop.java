package se.yrgo;

public class FilterOutPop implements FilterAlbum{
    @Override
    public boolean permit(Album album) {
        return !album.genre().equals("Pop");
    }


}
