import java.util.Scanner;
import Class.Tablero;
public class Main {    

   public static void main(String[] args){  
    Scanner entrada = new Scanner(System.in);
    int opcion=0,x=1,y=1;
    boolean salida=false;    
    System.out.println("Tienes una ficha en la posicion (1,1) en un tablero de 5X5,decide a donde ir");
    do{     
      System.out.println("1-Arriba");
      System.out.println("2-Abajo");
      System.out.println("3-Izquierda");
      System.out.println("4-Derecha");
      System.out.println("5-Salida");
      opcion= entrada.nextInt();
      if(opcion==1){         
         Tablero tab= new Tablero(x,y);
         tab.Arriba();
         x=tab.GetX();
         y=tab.GetY();
         System.out.println("Tu ficha ahora esta en la posicion ("+tab.GetX()+","+tab.GetY()+")");
      }else if(opcion==2){
         Tablero tab= new Tablero(x,y);
         tab.Abajo();
         x=tab.GetX();
         y=tab.GetY();
         System.out.println("Tu ficha ahora esta en la posicion ("+tab.GetX()+","+tab.GetY()+")");
      }else if(opcion==3){
         Tablero tab= new Tablero(x,y);
         tab.Izquierda();
         x=tab.GetX();
         y=tab.GetY();
         System.out.println("Tu ficha ahora esta en la posicion ("+tab.GetX()+","+tab.GetY()+")");
      }else if(opcion==4){
         Tablero tab= new Tablero(x,y);
         tab.Derecha();
         x=tab.GetX();
         y=tab.GetY();
         System.out.println("Tu ficha ahora esta en la posicion ("+tab.GetX()+","+tab.GetY()+")");
      }else if(opcion==5){
         salida = true;
      }
    }while(salida != true);            
   } 
          
}