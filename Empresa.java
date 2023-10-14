import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Empresa {
    Scanner scan=new Scanner(System.in);

    public void informacionEmpleado(ArrayList<Empleado> informacionEmpleado){
        int cantidadDEmpleados;//ingresamos la cantidad de empleados que vamos a registrar
        String nombre,fecha;//datos del empleado
        int salario,repetir=0;
    do {
        try {
            System.out.println("ingrese la cantidad de empleados que desea registrar");
            cantidadDEmpleados = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < cantidadDEmpleados; i++) {
                System.out.println("ingrese el nombre du su empleado");
                nombre = scan.nextLine();
                System.out.println("infrese la fecha de entrada de su empleada del formato dia/mes/año");
                fecha = scan.nextLine();
                System.out.println("ingrese el salario de su trabajador");
                salario = scan.nextInt();
                scan.nextLine();
                informacionEmpleado.add(new Empleado(nombre, salario, fecha));//inicialisamos valores de la clase empleado

            }
            repetir=0;
        } catch (InputMismatchException error) {
            repetir=1;
            System.out.println("no se a ingresado corectamente un dato");
            scan.nextLine();
        }
    }while(repetir==1);



    }

    public void calculoDeNomina(ArrayList<Empleado> informacionEmpleado){
        int sumaSalarios=0;//suma total de toda la nomina de empleados
        for(Empleado i: informacionEmpleado){
            sumaSalarios+=i.salario;

        }
        System.out.println(sumaSalarios);

    }

    public void mostrarEmpleados(ArrayList<Empleado> informacionEmpleado){
        for(int i=0;i<informacionEmpleado.size();i++){
            Empleado data=informacionEmpleado.get(i);
            System.out.println("informacion de los empleados");
            System.out.println(data.nombre);
            System.out.println(data.fechaContratacion);
            System.out.println(data.salario);
        }


    }
}
