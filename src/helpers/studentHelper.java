package helpers;

import ut01.Alumno;
import ut01.Vivienda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class studentHelper {

    public static Alumno makeStudentManually() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Alumno      alumno;
        Vivienda    vivienda;
        String      dni,
                nombre,
                primerApellido,
                segundoApellido,
                telefono,
                provincia,
                codigoPostal,
                direccion;
        Date        fechaNacimiento;
        int         day=0,
                month=0,
                year=0;
        boolean     dateFlag=false;
        //name
        System.out.print("Nombre: ");
        nombre= in.readLine();
        System.out.println();
        //lastnames
        System.out.print("primer apellido: ");
        primerApellido= in.readLine();
        System.out.println();
        System.out.print("segundo apellido: ");
        segundoApellido= in.readLine();
        System.out.println();
        //dni
        System.out.print("DNI: ");
        dni= in.readLine();
        System.out.println();
        //birthdate
        System.out.print("Fecha de nacimiento solo valores numericos ");
        do{
            try {
                System.out.println("dia: ");
                day = Integer.parseInt(in.readLine());
                System.out.println();
                System.out.println("mes: ");
                month = Integer.parseInt(in.readLine())-1;
                System.out.println();
                System.out.println("año: ");
                year = Integer.parseInt(in.readLine())-1900;
                System.out.println();
                dateFlag=true;
            }catch (NumberFormatException e){
                e.printStackTrace();
                day= 0;
                month = 0;
                year = 0;
                dateFlag=false;
            }
        }while(!dateFlag);
        fechaNacimiento = new Date(year,month,day);
        //phone
        System.out.print("Telefono: ");
        telefono= in.readLine();
        System.out.println();
        //vivienda
        System.out.print("Direccion: ");
        direccion= in.readLine();
        System.out.println();
        System.out.print("Codigo Postal: ");
        codigoPostal= in.readLine();
        System.out.println();
        System.out.print("Provincia: ");
        provincia= in.readLine();
        System.out.println();

        vivienda = new Vivienda(direccion,codigoPostal,provincia);
        alumno= new Alumno(dni,nombre,primerApellido,segundoApellido,telefono,vivienda,fechaNacimiento);

        return alumno;
    }

    public static Alumno getStudentByDefault(){
        return new Alumno(
                "12345678",
                "juanito",
                "de la cruz",
                "de la santa devocion",
                "928617380",
                new Vivienda(
                        "caverna 2",
                        "234456",
                        "Necrolimbo"
                ),
                new Date(100,4,15));
    }





}
