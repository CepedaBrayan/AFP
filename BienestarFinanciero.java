import java.util.HashMap;
import java.util.Scanner;
/**
 *Clase para hallar el estad financiero del cliente
 * 
 * @author Brayan Orlando Rivera Cepeda
 * @version (14/06/2017)
 */
public class BienestarFinanciero
{
    Scanner Teclado=new Scanner(System.in);
    private double capital, servicios, extras, deudas, prestamos, sueldo, ahorros;
    private String estado;
    
   /**
* Inicializar el estado financiero a analizar
*@param se ingresan todos los datos del cliente para que sea estudiado
*/
  public void Bienestar(Cliente Usuario)
  {
      servicios=Usuario.getServicios();
      extras=Usuario.getIngresosExtras();
      deudas=Usuario.getDeudas();
      prestamos=Usuario.getIngresosPrestamos();
      sueldo=Usuario.getSueldo();
      ahorros=Usuario.getAhorros();
      
      
    System.out.println("\fSu gasto total de servicios es: "+servicios);
    System.out.println("Su total de ingresos extras es de: "+extras);
    System.out.println("Su total de deudas es de: "+deudas);
    System.out.println("Su total de dinero prestado es de "+prestamos);
    System.out.println("Su total de dinero en ahorros es de "+ahorros);
    
    capital=ahorros+sueldo+prestamos-deudas+extras-servicios;
    System.out.println("Su capital es de "+capital);
    estadoFinanciero();
  }
    
/**
* Calcular estado financiero
*/
public void estadoFinanciero()
{
  if(capital<0)
  {
       System.out.println("Su estado financiero es malo");
      estado="Malo";
   }
  if(capital==0)
  {
      System.out.println("Su estado financiero es limitado, es neutro");
      estado="Neutro";
  }
  if(capital>0&&capital<sueldo*0.5)
  {
       System.out.println("Su estado financiero es bueno");
      estado="Bueno";
  }
  if(capital>sueldo*0.5)
  {
       System.out.println("Su estado financiero es excelente");
      estado="Excelente";
  }
  
  System.out.println("\nPulse una tecla para continuar");
  Teclado.nextLine();
    
}

    
/**
* Retorna estado financiero previamente hallado
*/
public String getEstado()
{
    return estado;
}

}




