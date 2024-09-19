import java.util.Scanner;

public class Main{
    public static void main (String[] args){
/*
Paciente
Hospital
medicos
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Sea usted BIENVENIDO, a continuacion presentamos nuestro menu: ");

 int opcion = 0;
 while(opcion != 2) {
     System.out.println("\n*** Bienvenido ***");
     System.out.println("Elija una opcion segun corresponda: \n 1.Paciente \n 2.Medico");
     System.out.println("Opcion: ");
     opcion = sc.nextInt();

     switch (opcion) {
         case 1: int opcion1=1;
         System.out.println("Ha accedido como paciente");
         System.out.println("Que desea consultar? ");
         System.out.println("1.Solicitar cita ");
         System.out.println("2.Agendar una cita ");
         System.out.println("3.Registrar cita " );
         System.out.println("4.Consultar medicos disponibles");
         System.out.println("5.Colsultar consultorios disponibles");
         System.out.println("6.Salir");
         break;

         case 2: int opcion2=2;
         System.out.println("Ha accedido como Medico ");
         System.out.println("Que desea consultar?");
         System.out.println("1.Consultar proximas citas");
         System.out.println("2.Agendar citas ");
         System.out.println("3.Registrar citas ");
         System.out.println("4.Consultar consultorios disponibles");
         System.out.println("5.Consultar historial de pacientes ");
         System.out.println("6.Salir");
         break;


     }
 }

    }
}