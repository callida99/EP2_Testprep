/*
    Aufgabe 1)
*/
public class Song{
    private String titel;    //Objektvariablen deklariation
    private String band;
    private long laenge;
    private int jahr;
    private String komponist;


    public Song(String titel, String band, int laenge){
        this.titel = titel;  //Конструктор для инициализвации объектов
        this.band = band;
        this.laenge = laenge;
    }

    public String getTitel() {   //getter
        return titel;
    }

    public Song(String titel, String band, long laenge, int jahr, String komponist) {
        this.titel = titel;
        this.band = band;
        this.laenge = laenge;
        this.jahr = jahr;
        this.komponist = komponist;
    }

    public String getBand() { //getter
        return band;
    }

    public long getLaenge() { //getter
        return laenge;
    }


    public int getJahr() {
        return jahr;
    }

    public String getKomponist() {
        return komponist;
    }

    @Override

    public String toString() { // toString используем для напечатывание
        return ""+band +": " + titel + " (" + laenge + "s"+")";
    }

    public void printSong(){  //принимаем объект класса Song
        System.out.println(toString());
    }

    public void print(){
        if (komponist == null|| jahr == 0){
            printSong();
        }
        else{
            System.out.println("<"+band +">: " + "<" +titel + "> (<" + laenge + ">s"+"); <"+ jahr +">; <"+ komponist+">");
        }
    }






    public static void main(String[] args) {

    }
}

