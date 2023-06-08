import java.util.ArrayList;

import java.util.Collections;

public class deck {
    static ArrayList<Carta> Baraja = new ArrayList<Carta>();
    static int sizem = 52;
    static int sizec = 52;

        public static void main(String[] args) {
            String valor = "";
            String palo = "";
            String color = "";
            for (int j = 1; j < 5; j++) {
                for (int i = 1; i < 14; i++) {

                    if (i > 1 && i < 11) {
                        valor = Integer.toString(i);
                    } else if (i == 1) {
                        valor = "A";
                    } else if (i == 11) {
                        valor = "J";
                    } else if (i == 12) {
                        valor = "Q";
                    } else if (i == 13) {
                        valor = "K";
                    }
                    if (j ==1) { palo = "Trebol"; color = "Negro"; }
                    if (j ==2) { palo = "Espada"; color = "Negro";}
                    if (j ==3) { palo = "Diamante"; color = "Rojo";}
                    if (j ==4) { palo = "Corazon"; color = "Rojo";}
                    Carta temp = new Carta(valor, palo, color);
                    Baraja.add(temp);
                }
            }


            }



        public static void Shuffle(){
            Collections.shuffle(Baraja);
            System.out.println("Se mezcló el Deck.");

        }
        public static void head(){
            Baraja.get(0).MostrarCarta();
            Baraja.remove(0);
            sizec = sizec -1;
            System.out.println("Quedan" + sizec);

        }
    public static void pick(){
         int rand = (int) ((Math.random()*sizec)+1);
        Baraja.get(rand).MostrarCarta();
        Baraja.remove(rand);
        sizec = sizec -1;
        System.out.println("Quedan" + sizec);

    }
    public static ArrayList<Carta> hand (){
         ArrayList<Carta> Mano = new ArrayList<Carta>();
            for (int i = 0; i <5;i++){
              Mano.add(Baraja.get(0));
              Baraja.remove(0);
                sizec = sizec -1;

            }
            for (int i = 0; i <5;i++){
                Mano.get(i).MostrarCarta();
            }
            System.out.println("Quedan" + sizec);

            return Mano;
    }

}