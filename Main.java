import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*Crea un programa en Java que permita gestionar empleados. Debes tener una clase Empleado con atributos como nombre, salario y fecha de contratación.
    Luego, crea una clase Empresa que permita agregar empleados, calcular la nómina total y mostrar todos los empleados
    * */
    public static void main(String[] args) {
       menu();
    }

    public static void menu(){
        int opcion,continuar=-1;
        Empresa registro=new Empresa();//objeto de la clase empresa para acceder a su contenido;
        Scanner scan=new Scanner(System.in);
        ArrayList<Empleado> informacionEmpleado=new ArrayList<>();


      do{
          try{

              System.out.println("Bienvenido al registro de empleados, Seleccione una opcion del menu");
              System.out.println("1=agregar empleado 2=nomina total 3=mostrar todos los empleados");
              opcion= scan.nextInt();//elegir una opcion del menu

              switch (opcion){
                  case 1:
                      registro.informacionEmpleado(informacionEmpleado);
                      break;
                  case 2:
                      registro.calculoDeNomina(informacionEmpleado);
                      break;
                  case 3:
                      registro.mostrarEmpleados(informacionEmpleado);
                      break;
              }

              System.out.println("desea realizar otra accion 1=si 2=no");
              continuar=scan.nextInt();

              if(continuar==2){
                  System.out.println("programa finalizado");
              }

          }catch (InputMismatchException error){
              continuar=0;
              System.out.println("a ocurrido un error vuelva a ingresar una opcion del menu");
              scan.nextLine();

          }

      }while(continuar>-1 && continuar<2);


    }
}