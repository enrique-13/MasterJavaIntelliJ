package S9ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/S9ClaseSystem/config.properties");

            Properties p = new Properties(System.getProperties()); //Agrega todas las configuraciones de nuestro sistema
            p.load(archivo); //cargamos las configuraciones del archivo /config.properties
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties"); //agregamos propiedad
            System.setProperties(p); //asignamos nuestras propiedades con el obj (p)

            Properties ps = System.getProperties(); //actualizamos el properties en el sistema
//obtenemos nuestros properties personalizados
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out); //lista todas las propiedades del sistema
        } catch(Exception e){
            System.err.println("no existe el archivo = " + e);
            System.exit(1); //Salir del error
        }
    }
}
