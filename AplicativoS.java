import java.util.Scanner;

public class AplicativoS{

    public static void main(String[] args){

        int n1, n2, suma;

        Scanner lee=new Scanner(System.in);

        System.out.print("Introduzca primer n�mero: ");
        	n1=lee.nextInt();

        System.out.print("Introduzca segundo n�mero: ");
        	n2=lee.nextInt();

        suma=n1+n2;

        System.out.println("La suma de "+ n1 +"  m�s  "+  n2  + "  es  : " +suma+ "." );
	
	Operacion obj1=new Operacion(n1, n2, suma);
	obj1.imprimirDatos();
	
    }
}