public class Calculadora {
    public static void main(String [] args){
       
        Operaciones Operacion1 = new Operaciones();
        
        System.out.println("El resultado de la primer suma es " +  Operacion1.suma(2,3));
        System.out.println("El resultado de la segunda suma es " + Operacion1.suma(4,6));
        System.out.println("El resultado de la primer resta es " + Operacion1.resta(8,3));
        System.out.println("El resultado de la segunda resta es "+ Operacion1.resta(8,4));
        System.out.println("El resultado de la primer multiplicacion es " + Operacion1.multiplicacion(2,5));
        System.out.println("El resultado de la segunda multiplicacion es "+ Operacion1.multiplicacion(2,3));
        System.out.println("El resultado del primer division es " + Operacion1.division(20,2));
        System.out.println("El resultado de la segunda division es " + Operacion1.division(20,5));
        System.out.println("El resultado del primer exponente es " + Operacion1.exponenciacion(2,2));
        System.out.println("El resultado del segundo exponente es " + Operacion1.exponenciacion(4,2));
        
    }
}