public class Carta {
    String Numero;
    String palo;
    String color;

    public  Carta(String num, String pal, String col){
        this.Numero=num;
        this.palo = pal;
        this.color = col;


    }
    public void MostrarCarta(){

        System.out.print(palo+" ");
        System.out.print(color+" ");
        System.out.println(Numero);
    }


}
