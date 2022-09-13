import java.util.Scanner;
public class calculadoraCientifica {
    public static void main(String args[]){}
    public static void preguntarNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Dato A");
        double a= teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        double b= teclado.nextInt();
    }
    public static void preguntarPorcentaje(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el numero para calcular su porcentaje");
        double c=teclado.nextInt();
        System.out.println("Ingrese el porcentaje sin %");
        double p=teclado.nextInt();
    }

    public static double suma(double a,double b){
        return a+b;
    }
    public static double multiplicacion(double a, double b){
        return a*b;
    }
    public static double division(double a,double b){
        return a/b;
    }
    public static double resta(double a,double b){
        return a-b ;
    }
    public static double comparacionMayor(double a,double b){
        return Math.max(a, b);
    }
    public static double comparacionMenor(double a,double b){
        return Math.min(a,b);
    }
    public static double elevado(double a,double b){
        return Math.pow(a,b);
    }
    public static double porcentaje(double c,double p){
        double porcentaje;
        porcentaje=(c*p)/100;
        return porcentaje;
    }



}
