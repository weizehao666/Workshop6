public class Exercise2 {
    public static void main(String[] args) {
        String[] songs = {"Song5", "Song2", "Song8", "Song1", "Song3",
                "Song10", "Song4", "Song7", "Song6", "Song9"};
        String[] artists = {"A5", "A2", "A8", "A1", "A3",
                "A10", "A4", "A7", "A6", "A9"};

        // bubble sort
        for (int i = 0; i < songs.length -1; i++){
            for(int j = 0; j < songs.length - 1 - i; j++){
                if(songs[j].compareToIgnoreCase(songs[j+1]) > 0){
                    String tempSong = songs[j];
                    songs[j] = songs[j+1];
                    songs[j+1] = tempSong;

                    String tempArtist = artists[j];
                    artists[j] = artists[j+1];
                    artists[j+1] = tempArtist;
                }
            }
        }
        for(int i=0;i<songs.length;i++){
            System.out.println("Song: "+songs[i]+" | Artist: "+artists[i]);
        }
    }
}
