package principal;
import java.util.Scanner;
import tablero.Coordenada;
import tablero.Ficha;
import tablero.Tablero;
import usuario.persona;
import usuario.IngresoDatos;
public class Damas {
    private persona JugadorUno;
    private persona juagdorDos;
    private int punteoJugadorUno;
    private int punteoJugadorDos;
    private int partida;

    private static Scanner scanner = new Scanner(System.in);

    private static String readString(String mensaje){
        String res = "";

        boolean lecturaCorrecta = false;

        while(!lecturaCorrecta){
            System.out.print(mensaje + " ");

            res = scanner.nextLine();
            res = res.trim();
            if (res.length()>0){
                lecturaCorrecta = true;
            }
            else{
                System.out.println("Debe ingresar al menos un caracter para continuar.");
            }

        }

        return res;
    }
    

    private static int readInt(String mensaje, boolean soloPositivo){
        int res = 0 ;
        String lectura = "";
        boolean lecturaCorrecta = false;
        while(!lecturaCorrecta){
            System.out.print(mensaje+" ");
            lectura = scanner.nextLine();

            try {
                res = Integer.valueOf(lectura);
                lecturaCorrecta = true;
                if (soloPositivo && res<0){
                    lecturaCorrecta = false;
                    System.out.println("Debe ingresar un número positivo. ");
                }
            } catch (Exception e) {
                lecturaCorrecta = false;
            }    
        }
        
        return res;
    }
    public Damas(persona jugadorUno, persona jugadorDos, int punteoJugadorUno, int punteoJugadorDos, int rondas) {
        this.JugadorUno = jugadorUno;
        this.juagdorDos = jugadorDos;
        this.punteoJugadorUno = punteoJugadorUno;
        this.punteoJugadorDos = punteoJugadorDos;

    }
    public void Iniciar() {
        do {
            System.out.println(
                    "partida : " + (partida + 1));
            System.out.println("Jugador Uno es :" + JugadorUno.getnickname() + " punteo es : " + punteoJugadorUno);
            System.out.println("Jugador Dos es :" + juagdorDos.getnickname() + " punteo es : " + punteoJugadorDos);
            jugar();
        } while (!finalizo());
        persona gandor = (punteoJugadorUno > punteoJugadorDos) ? JugadorUno : juagdorDos;
        persona perdedor = (punteoJugadorUno < punteoJugadorDos) ? JugadorUno : juagdorDos;
        gandor.setvictorias(gandor.getvictortias() + 1);
        gandor.setContadorJuegos(gandor.getcontadorJuegos() + 1);
        perdedor.setContadorJuegos(perdedor.getcontadorJuegos() + 1);
        System.out.println(IngresoDatos.setTexto( "Gano el jugador"));
        System.out.println(IngresoDatos.setTexto(gandor.getnickname()));
    }
    private boolean finalizo() {
        return ((punteoJugadorUno == tablero.getAncho()) || (punteoJugadorDos == tablero.getAncho())) ? true : false;
    }

    Tablero tablero ;

    public Damas(){
        tablero = new Tablero(8, 8,true);

    }


    public void jugar(){


        turno(true);
        turno(false);
        turno(true);
        turno(false);
        turno(true);
        turno(false);
        turno(true);
        turno(false);
        turno(true);
        turno(false);
        turno(true);
        turno(false);
        turno(true);
        turno(false);
        turno(true);
        turno(false);
        
    }

    private void turno(boolean esBlanca){
        
        Ficha fichaAMover = null;
        Coordenada[] coordenadasPosibles = null;
        String advertencia = "";

        while (fichaAMover== null) {
            tablero.pintarTablero();
            System.out.println(advertencia);
            advertencia = "";
            System.out.println("TURNO DE LAS "+((esBlanca)?"BLANCAS":"NEGRAS"));
            fichaAMover = tablero.getFicha(Damas.readString("Seleccione la ficha que desea mover "), esBlanca);
            if (fichaAMover == null){
                advertencia +="Debe seleccionar una ficha valida";
            }
            else{
                coordenadasPosibles = fichaAMover.getMovimientosPosibles();

                if (coordenadasPosibles!=null){
                    String mensaje = "\nCoordenadas posibles para la ficha seleccionada: \n";
                    int cantidadPosibilidades = 0;
                    int i = 0;
                    while (coordenadasPosibles[i]!=null) {
                        if (coordenadasPosibles[i] != null) {
                            mensaje+= i+") "+coordenadasPosibles[i].toString()+"\n";
                            cantidadPosibilidades++;
                        }
                        i++;
                    }
                    mensaje += "\nSeleccione la coordenada a la que desea moverse: ";
                    int seleccion = -1;
                    while ((seleccion < 0)||(seleccion >= cantidadPosibilidades)){
                        seleccion = Damas.readInt(mensaje, true);
                    }

                    tablero.moverFicha(fichaAMover, coordenadasPosibles[seleccion]);

                }
                else{
                    
                    advertencia += "La ficha "+fichaAMover.getId()+" que selecciono no tiene movimientos posibles";
                    fichaAMover = null;
                }
            }
            

            
        }


    }


    
}