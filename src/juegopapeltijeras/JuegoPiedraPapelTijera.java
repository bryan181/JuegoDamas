package juegopapeltijeras;
import usuario.persona;

import java.util.Scanner;


public class JuegoPiedraPapelTijera {
    
    private persona JugadorUno;
    private persona JugadorDos;
    String ganador = "";
    static Scanner sc = new Scanner(System.in);



    public JuegoPiedraPapelTijera(persona JugadorUno, persona JugadorDos){
        this.JugadorUno = JugadorUno;
        this.JugadorDos = JugadorDos;
    }

    public String JuegoPiedraPapelTijeras(){
        int opcionJ1, opcionJ2;

        do {
            System.out.println("jugadores " + JugadorUno.getnickname() +  " y  "
                    + JugadorDos.getnickname() );

            mostrarMensaje("\n Jugador 1: \n"+ JugadorUno.getnickname() );
            opcionJ1 = opcionMensaje("1. Piedra\t2. Papel\t3.Tijeras - Opcion: ");
            mostrarMensaje("\n Jugador 2\n"+ JugadorDos.getnickname() );

            opcionJ2 = opcionMensaje("1. Piedra\t2. Papel\t3.Tijeras - Opcion: ");

            if(opcionJ1 == 1 && opcionJ2 == 1 || opcionJ1 == 2 && opcionJ2 == 2 || opcionJ1 == 3 && opcionJ2 == 3){
                mostrarMensaje("\n\n***empate***");
                ganador = "Empate";
            } else if(opcionJ1 == 2 && opcionJ2 == 1 || opcionJ1 == 3 && opcionJ2 == 2 || opcionJ1 == 1 && opcionJ2 == 3){
                mostrarMensaje("\n\n***Jugador 2 Perdió***");
                ganador = "Gano Jugador 1";
            } else if(opcionJ1 == 1 && opcionJ2 == 2 || opcionJ1 == 2 && opcionJ2 == 3 || opcionJ1 == 3 && opcionJ2 == 1){
                mostrarMensaje("\n\n***Jugador 1 Perdió***");
                ganador = "Gano Jugador 2";
            }

        }while (ganador.equals("Empate"));

        return ganador;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.print(mensaje+" ");
    }

 public static int opcionMensaje(String mensaje){
    mostrarMensaje(mensaje);
    return sc.nextInt();
}


public static String obtenerLinea(String mensaje){
    mostrarMensaje(mensaje);
    sc.nextLine();
    return sc.nextLine();
}

    public JuegoPiedraPapelTijera(String ganador) {
        this.ganador = ganador;
    }
}