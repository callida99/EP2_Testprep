public class SongTree1Binary implements SongTreeNodable {

    private SongTreeNodable left = new SongTree1Null();
    private SongTreeNodable right = new SongTree1Null();
    private Song song;

    public SongTree1Binary(Song newSong) {
        song = newSong;
    }

    public SongTreeNodable add(Song newSong) {

        if (newSong.getTitel().compareTo(song.getTitel()) < 0) {
            left = left.add(newSong);
            return this;
        } else {
            right = right.add(newSong);
            return this;
        }
    }

    public void print() {
        System.out.println(this.toString());
    }

    public String toString() {
        String s = left.toString() + " " + song.getTitel() + " " + right.toString();
        return s;
    }


    public int hashCodeSum() {


        int i = song.hashCode();


        return i;
    }
}
