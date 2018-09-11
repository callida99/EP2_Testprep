/*
    Aufgabe 3)
*/
public class Aufgabe3 {

    public static void main(String[] args) {
   /*  Song good = new Song("Awful things","Lilpeep",190);
        Song good1 = new Song("Brightside","LilPEEP",180);
        Song good2 = new Song("turnmaswagon","soujaboy",120);


        Playlist rap = new Playlist(3);
        rap.add(good);
        rap.add(good1);
        rap.add(good2);
        rap.print();
        System.out.println(rap.getLaenge());

        //*********** Ad-hoc***************
        Song song = new Song("Awful things","Lilpeep",190, 1777,"Beethoven");
        Song song2 = new Song("Awful things","Lilpeep",190, 0,"Beethoven");

        song.print();
        song2.print();
*/
        //************Aufgabe2****************
        /*
        Playlist1 metal = new Playlist1(); //create new Playlist1
        Song black = new Song("Rest in peace", "Bones", 217);
        Song black2 = new Song("it never ends", "Bmth", 222);
        Song black3 = new Song("Nothing else matters", "Metallica", 150);
        Song black4 = new Song("Swaag", "While she sleeps", 120);

        metal.add(black);  // add songs to a playlist
        metal.add(black2);
        metal.add(black3);
        metal.add(black4);

        System.out.println("________Show the Playlist1__________");
        metal.print();
        System.out.println();

        System.out.println("________Show the lehgth of a Playlist__________");
        System.out.println(metal.playlistLänge());
        System.out.println();

        System.out.println("________Show the song with a title___________");
        System.out.println(metal.lookupTitle("Swaag"));
        System.out.println();

        System.out.println("________Test the constructor___________");
        Playlist1 swag = new Playlist1(metal, 100, 200);  //create a new playlist for the other constructor
        swag.print();
        System.out.println();

        Song black5 = new Song("houdini", "Nothing nowhere", 210);  //create a new song

        System.out.println("_________________________ADD AFTER____________________________");
        System.out.println();

        System.out.println("_________Add after the  choosen Song_____________");
        metal.addAfter("it never ends", black5);
        metal.print();
        System.out.println();

        System.out.println("_________Add after when the song is not found _____________");
        metal.addAfter("it neddver ends", black3);
        metal.print();
        System.out.println();

        System.out.println("_________Add after to the empty List _____________");
        Playlist1 yo1 = new Playlist1();
        yo1.addAfter("", black5);
        yo1.print();
        System.out.println();


        System.out.println("_________________________ADD BEFORE____________________________");
        System.out.println();

        System.out.println("__________Add before the first Song_______________");
        metal.addBefore("Rest in peace", black5);
        metal.print();
        System.out.println();


        System.out.println("_________Add before to the empty List______________");
        Playlist1 yo = new Playlist1();
        yo.addBefore("", black5);
        yo.print();
        System.out.println();

        System.out.println("_________Add before when title is not found__________");
        Song black6 = new Song("Igor", "mimimi", 210);
        metal.addBefore("hahahahaloooolnooob", black6);
        metal.print();
        */

        //********************************************Aufgabenblatt3**********************************************
        SongTree st = new SongTree();

        Song black = new Song("IDONTCARE", "E", 217);
        Song black2 = new Song("Arctic Monkeys", "B", 222);
        Song black3 = new Song("Nofx", "G", 150);
        Song black4 = new Song("Cro", "F", 120);
        Song black5 = new Song("Goth", "A", 120);
        Song black6 = new Song("Goo Goo", "D", 120);
        Song black7 = new Song("AE", "Z", 120);


        st.add(black);
        st.add(black2);
        st.add(black3);
        st.add(black4);
        st.add(black5);
        st.add(black6);
        st.add(black7);

        System.out.println("***************** Nodes of a Tree in an alphabetical order ******************");
        st.print(); // give out the list of songs in alphabetical order
        System.out.println();

        System.out.println("******************************* Lookup Title **********************************");
        System.out.println(st.lookupTitle("IDONTCARE"));

        System.out.println("*******************************Getlänge**********************************");
        System.out.println(st.getLaenge());

        System.out.println("*******************************Playlist 2***************************************** ");

        Playlist2 spotify = new Playlist2();
        spotify.add(black);
        spotify.add(black2);
        spotify.add(black3);
        spotify.print();
        System.out.println();
        spotify.addBefore("IDONTCARE",black4);
        spotify.print();


        System.out.println("*******************************SongTree***************************************** ");




        System.out.println();
        //System.out.println(tree.toString());

        SongTree1 tree2 = new SongTree1();
        tree2.add(black);
        tree2.add(black2);
        tree2.add(black3);

        SongTree1 tree = new SongTree1();

        tree.add(black2);
        tree.add(black3);
        tree.add(black);



        System.out.println(tree.equals(tree2));

        System.out.println(tree.hashCode());
        System.out.println(tree2.hashCode());



    }
}