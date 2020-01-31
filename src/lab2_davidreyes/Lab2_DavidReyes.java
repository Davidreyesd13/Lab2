package lab2_davidreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DavidReyes {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Personajes> personajes = new ArrayList();
        personajes.add(new Personajes("Clerigo", "David", "Elfo", 1.68, 135, 120, "fuerte estratega", "Zebes"));
        personajes.add(new Personajes("Picaro", "Fernando", "Humano", 1.80, 240, 50, "Un gordo mas", "Norfair"));
        personajes.add(new Personajes("Mago", "Jose", "Mediano", 2.13, 180, 300, "el mago mas loco", "Crateria"));
        personajes.add(new Personajes("Barbaro", "Rony", "Mediano", 1.90, 135, 90, "Maestro de las peleas", "Zebes"));
        int i = 4;
        while (true) {

            System.out.println("Que desea hacer?\n1.Crear personaje\n2.Modificar personaje\n3.Ver atributos\n4.Eliminar personaje\n0.Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1.Clerigo\n2.Barbaro\n3.Mago\n4.Picaro");
                    int personaje = leer.nextInt();
                    String tipo = "";
                    switch (personaje) {
                        case 1:
                            tipo = "Clerigo";

                            break;
                        case 2:
                            tipo = "Barbaro";
                            break;
                        case 3:
                            tipo = "Mago";
                            break;
                        case 4:
                            tipo = "Picaro";
                            break;
                        default:
                            System.out.println("Personaje no existe");
                    }
                    System.out.println("Ingrese nombre: ");
                    leer.nextLine();
                    String nombre = leer.nextLine();
                    System.out.println("Raza\n1.Mediano\n2.Elfo\n3.Enano\n4.Humano");
                    int Razi = leer.nextInt();
                    String raza = "";
                    int Hp;
                    switch (Razi) {
                        case 1:
                            raza = "Mediano";

                            break;
                        case 2:
                            raza = "Elfo";
                            break;
                        case 3:
                            raza = "Enano";
                            break;
                        case 4:
                            raza = "Humano";
                            break;
                        default:
                            System.out.println("Raza no valida");
                    }
                    System.out.println("Ingrese la estatura");
                    double estatura = leer.nextDouble();
                    System.out.println("Ingrese peso");
                    double peso = leer.nextDouble();
                    System.out.println("Ingrese edad");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese descripcion");
                    leer.nextLine();
                    String descrip = leer.nextLine();
                    System.out.println("Ingrese nacionalidad\n1.Norfair"
                            + "\n2Brinstar\n3.Maridia"
                            + "\n4.Zebes"
                            + "\n5Crateri");
                    int nacion = leer.nextInt();
                    String nacionalidad = "";
                    switch (nacion) {
                        case 1:
                            nacionalidad = "Norfair";
                            break;
                        case 2:
                            nacionalidad = "Brinstar";
                            break;
                        case 3:
                            nacionalidad = "Maridia";
                            break;
                        case 4:
                            nacionalidad = "Zebes";
                            break;
                        case 5:
                            nacionalidad = "Crateri";
                        default:
                            System.out.println("Opcion no valida");
                    }
                    personajes.add(new Personajes(tipo, nombre, raza, estatura, peso, edad, descrip, nacionalidad));
                    System.out.println(personajes.get(i));
                    i++;
                    break;
                case 2:
                    int lugar=1;
                    for (Personajes o: personajes) {
                        System.out.println(lugar+""+o);
                    lugar++;
                    }
                    System.out.println("");
                    System.out.println("que desea modificar\n1.\n2.\n3.\n4.\n5.\n6.\n7.\n8.");
                    break;
                case 3:
                     lugar = 1;
                    for (Personajes personaje1 : personajes) {
                        System.out.println(lugar + " " + personaje1);
                        lugar++;
                    }
                    break;
                case 4:
                    int pos;
                    lugar=1;
                    for (Personajes o: personajes) {
                        System.out.println(lugar+""+o);
                    lugar++;
                    }
                    System.out.println("Que opcion desea eliminar?");
                    pos = leer.nextInt();
                    personajes.remove(pos-1);
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
