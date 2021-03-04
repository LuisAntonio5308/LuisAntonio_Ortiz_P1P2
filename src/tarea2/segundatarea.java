package tarea2;
import java.util.Scanner;

public class segundatarea {
    
    public void impr(){
    Scanner sc = new Scanner(System.in);
    int n;
    
        System.out.print("Cuantas filas quieres ingresar: ");
        n = sc.nextInt();
        
        System.out.println();
        for(int i=1; i<=n; i++){
            //Espacios
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int a=1; a<=(i*2)-1; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    
}
