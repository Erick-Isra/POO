package Class;

public class Tablero {   
   private int x,y;
   //Metodo contructor
   public Tablero(int x,int y){
      this.x=x;
      this.y=y;
   }
   //Metodos
   //Arriba
   public void Arriba(){
      if(y==5){
         System.out.println("Ya no se puede mover mas arriba");
      }else{
         y++;
      }      
   }
   //Aabajo
   public void Abajo(){
      if(y==1){
         System.out.println("Ya no se puede mover mas abajo");
      }else{
         y--;
      }      
   }
   //Izquierda
   public void Izquierda(){
      if(x==5){
         System.out.println("Ya no se puede mover mas");
      }else{
         x++;
      }      
   }
   //Derecha
   public void Derecha(){
      if(x==1){
         System.out.println("Ya no se puede mover mas");
      }else{
         x--;
      }      
   }
   //Getter valor de X
   public int GetX(){
      return x;         
     
   }
   //Getter valor de y
   public int GetY(){
      return y;         
     
   }
             
}