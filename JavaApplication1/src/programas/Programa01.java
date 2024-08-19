
package programas;
//paquete de datos e/s por consola
import java.util.Scanner;
public class Programa01 {
    //Método principal
    public static void main(String args[]){
    //Declaración de variables
    String empleado,cargo;
    double ingreso,gasto,ahorrom,ahorroa;
    //Creando el objeto de lectura
    Scanner lectura= new Scanner(System.in);
    //Entrada de datos
    System.out.print("Nombre de empleado: ");
    empleado=lectura.next();
    System.out.print("Ingrese el cargo: ");
    cargo=lectura.next();
    System.out.print("Ingresos del empleado: ");
    ingreso=lectura.nextDouble();
    System.out.print("Gastos del empleado: ");
    gasto=lectura.nextDouble();
    //Proceso de datos
    ahorrom=ingreso-gasto;
    ahorroa=ahorrom*12;
    //Salida de datos
    System.out.println("Ahorro Mensual: "+ahorrom);
    System.out.println("Ahorro Anual: "+ahorroa);
    }//Fin del método
}//Fin del programa
//version 2 push
//From GitHub to Apache NetBeans (Pull)
//Jenkins testing