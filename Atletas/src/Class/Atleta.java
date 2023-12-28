package Class;

public class Atleta{
    private String nombre;
    private int numero;
    private float tiempo;
    //Construxtor
    public Atleta(String nombre,int numero, float tiempo){
        this.nombre=nombre;
        this.numero=numero;
        this.tiempo=tiempo;
    }
    //Metodos
    //Getter tiempo
    public float gettiempo(){
        return tiempo;
    }
    //Geter numero
    public int getnumero(){
        return numero;
    }
    //Geter nombre
    public String getnombre(){
        return nombre;
    }
    //impresion de resultados
    public String Datos(){
        return "Nombre: "+nombre+"\nNumero: "+numero+"\nTiempo: "+tiempo+"\n";
    }
    
}