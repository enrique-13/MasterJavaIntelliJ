package S4Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {


        String username = "enrique";
        String password = "12345";

        String user2 = "admin";
        String pass2 = "123";


        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese el usuario: ");
        String u = scanner.next();

        System.out.print("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        if( (username.equals(u) && password.equals(p)) || (user2.equals(u) && pass2.equals(p)) ){
            esAutenticado = true;
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            main(args);
        }


    }
}
