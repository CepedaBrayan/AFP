import java.util.Scanner;
import java.util.ArrayList;
    /**
* Se lleva el registro de todos los proyectos hechos por el usuario, también los descartados
* @author Brayan Orlando Rivera Cepeda
* @version (14/06/2017)
*/
public class Registros
{
  
    private ArrayList<Proyecto> exproyectos= new ArrayList<Proyecto>();
    private ArrayList<Proyecto> proyectos= new ArrayList<Proyecto>();

/**
* Ver un proyecto
*/
public Proyecto VerUno(String nombre)
{
    //variable para proyecto encontrado
    Proyecto pro= new Proyecto();
    
     for(Proyecto proyect: proyectos)
    {
        if(nombre.equals(proyect.getNombre()))
        {
           pro=proyect;
           break;
        }
    }
    
    return pro;
}

/**
* Imprimir un proyecto
*/
public void imprimirUno(String nombre)
{
      for(Proyecto proyect: proyectos)
    {
        if(nombre.equals(proyect.getNombre()))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getDesarrollo()+"%\n\n");
        }
    }
    
}

/**
* Retorna todos los proyectos
*/
public ArrayList<Proyecto> VerTodos()
{
  return proyectos;
}

/**
* Ver un proyecto
*/
public ArrayList<Proyecto> VerEliminados()
{
    return exproyectos;
}

/**
* Imprimir todos los proyectos
*/
public void imprimirTodos()
{
    
        System.out.println("\n\tURGENTES");
         for(Proyecto proyect: proyectos)
    {
        if(proyect.getTipo().equals("urgente"))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDesarrollo()+"%");
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getSaldo()+"\n\n");
        }
    }
    
         System.out.println("\n\tIMPORTANTES");
               for(Proyecto proyect: proyectos)
    {
        if(proyect.getTipo().equals("importante"))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDesarrollo()+"%");
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getSaldo()+"\n\n");
        }
    }  
    
    
         System.out.println("\n\tNECESARIOS");
               for(Proyecto proyect: proyectos)
    {
        if(proyect.getTipo().equals("necesario"))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDesarrollo()+"%");
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getSaldo()+"\n\n");
        }
    }  
    
         System.out.println("\n\tOCIOS");
               for(Proyecto proyect: proyectos)
    {
        if(proyect.getTipo().equals("ocio"))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDesarrollo()+"%");
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getSaldo()+"\n\n");
        }
    }
    
}


/**
* Imprime los proyectos ya realizados
*/
public void imprimirEliminados()
{
    
        System.out.println("\n\tURGENTES");
         for(Proyecto proyect: exproyectos)
    {
        if(proyect.getTipo().equals("urgente"))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDesarrollo()+"%");
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getSaldo()+"\n\n");
        }
    }
    
         System.out.println("\n\tIMPORTANTES");
               for(Proyecto proyect: exproyectos)
    {
        if(proyect.getTipo().equals("importante"))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDesarrollo()+"%");
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getSaldo()+"\n\n");
        }
    }  
    
    
         System.out.println("\n\tNECESARIOS");
               for(Proyecto proyect: exproyectos)
    {
        if(proyect.getTipo().equals("necesario"))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDesarrollo()+"%");
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getSaldo()+"\n\n");
        }
    }  
    
         System.out.println("\n\tOCIOS");
               for(Proyecto proyect: exproyectos)
    {
        if(proyect.getTipo().equals("ocio"))
        {
        System.out.println(proyect.getNombre());
        System.out.println(proyect.getTipo());
        System.out.println(proyect.getDesarrollo()+"%");
        System.out.println(proyect.getDescripcion());
        System.out.println(proyect.getSaldo()+"\n\n");
        }
    }
    
}

/**
 * Añadir el proyecto a mi registro, cuando se pagan totalmente
 */
public void añadir(Proyecto proyect)
{
    proyectos.add(proyect);
}

public void completar(Proyecto proyect)
{
    exproyectos.add(proyect);
    proyectos.remove(proyect);
}


/**
 * Eliminar un proyecto
 */
public void eliminar(Proyecto proyect)
{
    proyectos.remove(proyect);
   
}

  
}
