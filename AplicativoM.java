import java.util.Scanner;

public class AplicativoM{

    public static void main(String[] args){

        int n1, n2, multiplicacion;

        Scanner lee=new Scanner(System.in);

        System.out.print("Introduzca primer número: ");
        	n1=lee.nextInt();

        System.out.print("Introduzca segundo número: ");
        	n2=lee.nextInt();

        multiplicacion=n1*n2;

        System.out.println("La multiplicacion de "+ n1 +"  por  "+  n2  + "  es  : " +multiplicacion+ "." );
	
	Operacion obj1=new Operacion(n1, n2, multiplicacion);
	obj1.imprimirDatos();
	
    }
}