package usuario;
public class ManejoUsuario{
    private persona [] listado =new persona[1];
    private int contadorIngresados = 0;
    public ManejoUsuario(){

    }
    public persona NickName(String nickname){
        for(int i=0; i < contadorIngresados; i++){
            if (listado[i].getnickname().equals(nickname)){
                return listado[i];
            }
        }
        return null;
    }
        public persona busquedaNickName(){
            persona encontrada = NickName(IngresoDatos.getTexto("ingrese el nickname del usuario"));
            if (encontrada != null){
                System.out.print("\n"+IngresoDatos.setTexto( " fue encontrado "));
            }else{
                System.out.print("\n"+IngresoDatos.setTexto( " no fue encontrado "));

            }
            return encontrada;
        }
        public void agregarUsuario(String nombre, String nickname){
            ampliarespacio();
            listado[contadorIngresados] = new persona(nombre,nickname);
            contadorIngresados ++;
        }
        public void agregarUsuarioperdir(){
            String nombre = IngresoDatos.getTexto("Escriba su nombre:");
            String nickname = IngresoDatos.getTexto("Escriba su nombre");
            this.agregarUsuario(nombre, nickname);
        }
        private void ampliarespacio(){
            persona [] nuevo =new persona [listado.length +1];
            for(int  i = 0; i<contadorIngresados; i++){
                nuevo[i] = listado[i];
            }
            listado = null;
            listado = nuevo;
        }
        public int contadorIngresados(){
            return contadorIngresados + 1;
        }
        public void desplegarlistadoUsuarios(){
            System.out.print("\n los usuarios registrados son:\n");
            for (int i = 0; i < contadorIngresados; i++) {
            System.out.println(listado[i].informacion());
        }
    

        }


}

