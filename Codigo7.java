import java.util.HashMap; // importar HashMap
import java.util.Scanner; // importar Scanner

public class Codigo7 { 

    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); // crear para entrada

        HashMap<String, String> capitales = new HashMap<>(); // definir que son strings (corregir tipo de dato)

        // corregir ortografía general de las capitales
        capitales.put("Canadá", "Ottawa"); // corregir "Ottawa"
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México"); // corregir "Ciudad de México"
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José"); // corregir "Costa Rica"
        capitales.put("El Salvador", "San Salvador"); // agregar "San Salvador"
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        String c = ""; // corregir ortografia

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: "); // corregir sysout
            c = s.nextLine(); // cambiarlo para poder leer el input string

            if (!c.equals("salir")) {  // corregir otrografia equals
                if (capitales.containsKey(c)) { // corregir key en lugar de values
                    System.out.println("La capital de " + c + " es " + capitales.get(c)); // utilizar get
                } else {
                    System.out.print("No conozco la respuesta."); // salida correcta
                    System.out.print("¿cuál es la capital de " + c + "?: ");
                    String nuevaCapital = s.nextLine(); // definir que es una nueva capital
                    capitales.put(c, nuevaCapital); // utilizar put
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!c.equals("salir")); // corregir estructura de while

        s.close(); // cerrar el scanner al final
    } // main
} // class Codigo7
