import java . util . Random ;
import java . util . Scanner ;

class Personaje {
 private String nombre ;
 private int puntosDeVida ;
}
 private final int MAX_DANO = 30;
 private final int MIN_DANO = 10;

 public Personaje ( String nombre ) {
    this . nombre = nombre ;
    this . puntosDeVida = 100 ; 
 }

    public void atacar ( Personaje oponente ) {
        Random rand = new Random () ;
        int dano = rand . nextInt (( MAX_DANO - MIN_DANO ) + 1) +
        MIN_DANO ; // Dano entre 10 y 30
        oponente . recibirDano ( dano ) ;
     System . out . println ( this . nombre + " ataca a " +
        oponente . getNombre () + " causando " + dano + "
        puntos de dano .") ;
    }
        
