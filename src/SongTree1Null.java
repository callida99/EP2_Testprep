public class SongTree1Null  implements  SongTreeNodable {



     public SongTree1Null(){

     }

    public SongTreeNodable add(Song newSong){
        return new SongTree1Binary(newSong); //создаем элемент дерева динамически и рекурсивно
    }
    public void print(){

   }

    @Override
    public String toString() {
        return "";
    }
    public int hashCodeSum(){
        return 0;
    }
}
