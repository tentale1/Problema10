import java.util.Scanner;

/**
 * Programa para hallar volumen tronco de cono
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class cono
{
    public static void main(String[] args)
    {
        double r1,h,r2,h1,h2,vol;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Por favor ingrese el radio de la base del tronco del cono");
        r1 = Teclado.nextDouble();
        
        System.out.println("Por favor ingrese el radio superior del tronco del cono");
        r2 = Teclado.nextDouble();
        
        System.out.println("Por favor ingrese la altura del cono completo");
        h1 = Teclado.nextDouble();
        
        System.out.println("Por favor ingrese la altura del cono superior");
        h2 = Teclado.nextDouble();
        
        h = h1-h2; // h: altura tronco del cono, h2: altura cono superior y h1: altura del cono completo
        vol = ((h*Math.PI)/3)*(Math.pow(r1,2)+Math.pow(r2,2)+r1*r2); // formula volumen del tronco de cono
                
        System.out.println("el volumen del tronco del cono es " + vol);
    }
}
