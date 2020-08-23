package S9ClaseSystem;

import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
//Para mostrar el nombre de usuario
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

//mostrar la ruta del usuario o el home
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

//mostrar el directorio del proyecto o espacio de trabajo
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

//version de java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

//separador de lineas
        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator:" + lineSeparator2 + "Una línea nueva ...");

//listar todas las propiedades del sistema
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
