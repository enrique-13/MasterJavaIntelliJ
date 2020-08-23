public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1); // salir cuando ocurre un error
//            System.exit(0); // salir cuando todo sale bien
//            System.exit(1); // salir cuando se lanza una excepción
        }
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos nº " + i + ": " + args[i]);
        }
    }
}
