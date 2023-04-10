package Ejercicio;
import java.util.Scanner;
public class CalculoDeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		int A,B,H;
		
		System.out.println("Ingrese la Altura del rectangulo");
		H = tc.nextInt();
		
		System.out.println("Ingrese la Base del rectangulo");
		B = tc.nextInt();
		
		A = B*H;
		
		System.out.println("Altura:"+H);
		System.out.println("Base:"+B);
		System.out.println("El Area del rectangulo es:"+A);
	}

}
