public class Exercise1 {
    public static void main(String[] args) {
        String[] songs = {"Song1", "Song2", "Song3", "Song4", "Song5",
                "Song6", "Song7", "Song8", "Song9", "Song10"};
        String[] artists = {"Artist1", "Artist2", "Artist3", "Artist4", "Artist5",
                "Artist6", "Artist7", "Artist8", "Artist9", "Artist10"};

        for (int i = 0; i < songs.length; i++) {
            System.out.println("Song: " + songs[i] + " | Artist: " + artists[i]);
        }
    }
}
