package boletinSalidaPantalla;

public class Ejercicio2 {

	public static void main(String[] args) {
		int x=10;
		int y=-10;
		float n=13.269834f;
		String cad="Ana";
		
		System.out.printf("%d\n%1$+d\n%d\n%.2f\n"
				+ "%3$+10.4f\n%3$10.5f\n"
				+ "%3$0+10.3f\n"
				+ "n=%3$.2f%5s%1$d\n"
				+ "%8s%5$s%5$5s",x,y,n,"x=",cad);
	}

}
