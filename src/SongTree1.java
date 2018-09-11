public class SongTree1 {


    private SongTreeNodable root;

    public SongTree1() {
        root = new SongTree1Null();
    }

    public void add(Song song){

        root = root.add(song);

    }
    public void print(){
         root.print();
    }

    @Override
    public String toString() {
       return root.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SongTree1 songTree1 = (SongTree1) o;

        return this.toString().equals(o.toString());
    }

    @Override
    public int hashCode() {

        return root.hashCodeSum();
    }
}
