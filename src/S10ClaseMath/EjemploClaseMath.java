package S10ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3); //Valor absoluto
        System.out.println("absoluto = " + absoluto);
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5); //redondear hacia arriba
        System.out.println("techo = " + techo);
        double piso = Math.floor(3.5); //redondea hacia abajo
        System.out.println("piso = " + piso);
        
        long entero = Math.round(Math.PI); //redondear automático, retorna un entero
        System.out.println("entero = " + entero);

    //Clase Math parte2
        double exp = Math.exp(1); //exponente
        System.out.println("exp = " + exp);
        
        double log = Math.log(10); //Logaritmo natural
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3); //potencia
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5); //raíz cuadrada
        System.out.println("raiz = " + raiz);
//Métodos para trigonometría
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes)); //seno
        System.out.println("cos(90): " + Math.cos(radianes)); //coseno

        radianes = Math.toRadians(180.00); //radianes
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));

    }
}
