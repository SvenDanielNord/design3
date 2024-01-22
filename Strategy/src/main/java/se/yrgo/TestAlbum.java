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
        printAlbums(albums);

        System.out.println("----------------------------");

        printNotPopAlbums(albums);

        System.out.println("----------------------------");

        printPopAlbums(albums);
    }

    static void printAlbums(Album[] albums) {
        for(Album a : albums) {
            System.out.println(a);
        }
    }

    static void printNotPopAlbums(Album[] albums){
        FilterAlbum filter = new FilterOutPop();
        for (Album a : albums){
            if (filter.filterGenre(a)){
                System.out.println(a);
            }
        }
    }
    static void printPopAlbums(Album[] albums){
        FilterAlbum filter = new FilterPop();
        for (Album a : albums){
            if (filter.filterGenre(a)){
                System.out.println(a);
            }
        }
    }
}