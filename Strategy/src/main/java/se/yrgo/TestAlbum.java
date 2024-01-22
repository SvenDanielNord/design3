package se.yrgo;

public class TestAlbum {

    public static void main(String[] args) {

        Album[] albums = {
                new Album("Hotel California", "Eagles", Album.Genre.ROCK),
                new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
                new Album("Arrival", "ABBA", Album.Genre.POP),
                new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
                new Album("White album", "Beatles", Album.Genre.POP),
                new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
                new Album("Thank you for the music", "ABBA", Album.Genre.POP)
        };
        FilterAlbum filter = new FilterPop();
        System.out.println("Print Pop-Albums:\n");
        printAlbums(albums, filter);
        System.out.println("------------------------");
        System.out.println("Do not print Pop-Albums:\n");
        filter = new FilterOutPop();
        printAlbums(albums, filter);


    }

    static void printAlbums(Album[] albums, FilterAlbum filter) {
        for(Album a : albums) {
            if (filter.permit(a)){
                System.out.println(a);
            }

        }
    }


}