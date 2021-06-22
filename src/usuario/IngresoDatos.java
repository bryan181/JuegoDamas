package usuario;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IngresoDatos {
    private static int numero;
    public static String getTexto(String mensaje) {
        System.out.print("\n "+mensaje+" : ");
        return ((java.util.Scanner) Scanner(System.in)).nextLine();
    }
    private static Object Scanner(InputStream in) {
        return null;
    }
    public static int getInt(String mensaje) {
        do {
            String verificar = getTexto(mensaje);
            if (verficarTextoNumero(verificar)) {
                return Integer.parseInt(verificar);
            }
            System.out.print(setTexto( "\n Ingrese un numero: "));

        } while (true);
    }

    public static boolean verficarTextoNumero(String verificar) {
        Pattern patron = Pattern.compile("[0-9]+");
        Matcher matcher = patron.matcher(verificar);
        return matcher.matches();
    }
    public static String setTexto( String texto) {
        switch (numero) {
            case 0:
                return "" + texto + "";
            case 1:
            return "" + texto + "";
                
            case 2:
            return "" + texto + "";
                 
            case 3:
            return "" + texto + "";
                  
            case 4:

             return "" + texto + "";
            default:
                return texto;
        }
    }
    public static int getidficha(String string) {
        return 0;
    }


}
