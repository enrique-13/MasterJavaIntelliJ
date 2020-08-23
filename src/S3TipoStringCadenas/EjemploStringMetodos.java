package S3TipoStringCadenas;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Enrique";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Enrique\") = " + nombre.equals("Enrique"));
        System.out.println("nombre.equals(\"enrique\") = " + nombre.equals("enrique"));
        System.out.println("nombre.equalsIgnoreCase(\"enrique\") = " + nombre.equalsIgnoreCase("enrique"));
        System.out.println("nombre.compareTo(\"Enrique\") = " + nombre.compareTo("Enrique"));
        System.out.println("nombre.compareTo(\"Fabian\") = " + nombre.compareTo("Fabian"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //encuentra un caracter y retorna la posicion
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //la ultima ocurrencua y retorna la posición
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));//si se encuentra o no
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr")); //Comiensa con
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s")); //termina con
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim()); //quitar espacios en blanco en ambos lados
        
    }
}
