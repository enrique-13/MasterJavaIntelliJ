package S4Operadores;

import java.util.Scanner;

public class OperadoresLogicosArregloLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "enrique";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"enrique", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){

        //UTILIZANDO OPERADOR TERNARIO
        esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: esAutenticado;

            /*if( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                esAutenticado = true;
                break;
            }*/
        }

        //OPERADOR TERNARIO
        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o contraseña incorrecto!\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);

            /*if(esAutenticado){
                System.out.println("Bienvenido usuario ".concat(u).concat("!"));
            } else {
                System.out.println("Username o contraseña incorrecto!");
                System.out.println("Los siento, requiere autenticación");
            }*/
    }
}
