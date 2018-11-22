public class Aufgabe5_1710653657 {

    public static void main (String[]args){

        int zahl1 = 78;
        int zahl2 = 111;

        System.out.println(zahl1++);

        System.out.println(zahl2++);

        System.out.println(zahl1);

        System.out.println(zahl2);

        System.out.println(++zahl1);

        System.out.println(++zahl2);

        System.out.println(zahl1);

        System.out.println(zahl2);

        /*Bei der Ausgabe von zahl++ wird die Zahl ausgegeben und der Zähler zählt eins hoch, gibt man die Zahl dann erneut aus
          erscheint zahl+1 auf dem Monitor.
          Bei ++zahl wird bereits vor der ersten Ausgabe +1 addiert, somit erschein direkt zahl+1 auf dem Monitor.*/
    }
}
