import java.util.Scanner;
import Class.Atleta;

public class Main {  
   public static int Ganador( Atleta atletas[]){
    float tiempo;
    int indice=0;
    tiempo=atletas[0].gettiempo();
    for(int i =1;i<atletas.length;i++){
        if(atletas[i].gettiempo()<tiempo){
            tiempo=atletas[i].gettiempo();
            indice =i;
        }
    }

    return indice;

   } 

   public static void main(String[] args){ 
    Scanner entrada = new Scanner(System.in);
    String nombre;
    float tiempo;
    int numero,numAtletas,ganador;

    System.out.println("Dime de cuantos atletas fue la carrera:");
    numAtletas = entrada.nextInt();

    Atleta atletas[] = new Atleta[numAtletas];
    for(int i=0;i<atletas.length;i++){
        entrada.nextLine();
        System.out.println("Digita los datos del atleta"+(i+1)+);
        System.out.println("Nombre:");
        nombre=entrada.nextLine();
        System.out.println("Numero:");
        numero=entrada.nextInt();
        System.out.println("Tiempo:");
        tiempo=entrada.nextFloat();
        atletas[i]=new Atleta(nombre,numero,tiempo);
    }
    ganador=Ganador(atletas);
    System.out.println("El atleta ganador es:");
    System.out.println(atletas[ganador].Datos());
    

   }
}