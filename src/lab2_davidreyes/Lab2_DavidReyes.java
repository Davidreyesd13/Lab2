package lab2_davidreyes;
import java.util.Scanner;
public class Lab2_DavidReyes {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while (true) {
            System.out.println("Que desea hacer?1.\nCrear personaje\n2.Modificar personaje\n3.Ver atributos\n4.Eliminar personaje\n0.Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

}
