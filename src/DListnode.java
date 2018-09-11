public class DListnode {
    private Song song;
    private DListnode nextSong;
    private DListnode previousSong;

    public DListnode(Song song, DListnode nextSong) {
        this.song = song;
        this.nextSong = nextSong;

    }

    public DListnode(Song song, DListnode nextSong, DListnode previousSong) {
        this.song = song;
        this.nextSong = nextSong;
        this.previousSong = previousSong;

    }

    public Song getSong() {
        return song;
    }

    public DListnode getNextSong() {
        return nextSong;
    }

    public DListnode getPreviousSong() {
        return previousSong;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public void setNextSong(DListnode nextSong) {
        this.nextSong = nextSong;
    }

    public void setPreviousSong(DListnode previous) {
        this.previousSong = previousSong;
    }
}
