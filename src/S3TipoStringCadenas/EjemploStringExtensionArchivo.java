package S3TipoStringCadenas;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna.imagen.pdf";
        int i = archivo.lastIndexOf("."); //La ultima ocurrencia del . y se obtiene la extensión
        System.out.println("archivo.length() = " + archivo.length()); //Total de caracteres
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
    }
}
