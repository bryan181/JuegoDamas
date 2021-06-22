package usuario;

public class persona {
    private String nombre;
    private String nickname;
    private int punteo;
    private int victorias;
    private int contadorJuegos;


    public persona( String nombre,String nickname,int punteo,int victorias,int contadorJuegos) {
    this.nombre = nombre;
    this.nickname = nickname;
    this.punteo = punteo;
    this.victorias = victorias;
    this.contadorJuegos = contadorJuegos;
    }
     public persona(String nombre,String nickname){
         this(nombre,nickname,0,0,0);
     }
     public persona (){
         this("Bryan Alexis Queme Nimatuj","ritz181");
     }
      
     public String informacion(){
        return "Nombre: "+nombre+", NickName: "+nickname+", victorias: "+victorias+", derrotas: "+(contadorJuegos - victorias)+", cantidad de juegos: " +contadorJuegos;
     }
     public String gernombre(){
         return nombre;
     }
     public String getnickname(){
         return nickname;

     }
     public int getpunteo(){
         return punteo;
     }
     public int getvictortias(){
         return victorias;
     }
     public int getcontadorJuegos(){
         return contadorJuegos;
     }
     public void setNombre(String nombre){
         this.nombre = nombre;
     }
     public void setnickname(String nickname){
         this.nickname = nickname;
     }
     public void setPunteo(int punteo){
         this.punteo = punteo;
     }
     public void setvictorias(int victorias){
         this.victorias = victorias;

     }
     public void setContadorJuegos(int contadorJuegos){
         this.contadorJuegos = contadorJuegos;
     }
}
