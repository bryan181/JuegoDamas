package principal;
import usuario.ManejoUsuario;
import usuario.persona;
import juegopapeltijeras.JuegoPiedraPapelTijera;
import usuario.IngresoDatos;


public class Main {
    private ManejoUsuario listado = new ManejoUsuario();
    private Damas t = new Damas();
    private JuegoPiedraPapelTijera tijera = new JuegoPiedraPapelTijera();

    public static void main(String[] args){


    }
    public Main(){
    desplegarMain();
    }
    public void desplegarMain(){
        int opcion = 50;
        do{ System.out.print("__________Menu Principal__________\n");
            System.out.print("1) Registrar usuario\n");
            System.out.print("2) Mostrar usuario\n");
            System.out.print("3) jugar piedra , papel o tijeras\n");
            System.out.print("4) Jugar damas)\n");
            opcion = IngresoDatos.getInt("Escriba la opcion ");

         switch (opcion) {
            case 1:
                listado.agregarUsuarioperdir();
                break;
            case 2: 
                listado.desplegarlistadoUsuarios();
                break;
            case 3:
        
                tijera.JuegoPiedraPapelTijera();
            break;
            case 4:        
                    
                 t.jugar();
                break;
            
        }
        } while (opcion != 0);
    }public Main(ManejoUsuario listado) {
        this.listado = listado;
    }
    public void iniciarDamas() {
        persona JugadorUno = listado.busquedaNickName();
        persona JugadorDos = listado.busquedaNickName();
        if ((JugadorUno != null) && (JugadorDos != null)) {
        } else {
            System.out.println(IngresoDatos.setTexto( "No se encontro el  usuario"));
        }
    }


}
    

