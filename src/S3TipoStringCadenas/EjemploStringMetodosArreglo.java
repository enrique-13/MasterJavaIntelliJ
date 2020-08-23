package S3TipoStringCadenas;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //Convierte en arreglo

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){ //Mostar caracteres del arreglo
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a")); //Arreglo Separado por "a"

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for(int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.jsf";
        String[] archivoArr = archivo.split("\\."); // [.]
        l = archivoArr.length;
        System.out.println("l = " + l);
        for(int j=0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
