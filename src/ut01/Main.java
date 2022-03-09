package ut01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static helpers.saveInFile.saveInFile;
import static db.CursosList.getList;
import static helpers.Headers.*;
import helpers.studentHelper;

public class Main {
    public static void main(String[] args) {
        //variables to make file course.dat
        ArrayList<Curso> cursos = getList();

        //varaibles to make file alomnos.dat
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        Alumno alumno=null;

        //saving a file of cursos
        cursos.forEach(curso -> {
            saveInFile("cursos", curso.getValuesToSave(), headerCourse);
        });

        //saving a file of alumnos

        try {
            do{
                System.out.println("""
                    Bienvenid@ que deseas hacer
                    1. introucir los datos manualmente
                    2. generar un archivo por defecto
                    3. Guardar alumno
                    0. salir de la aplicacion
                    """);
                option = Integer.parseInt(in.readLine());

                if( option == 1 ) alumno = studentHelper.makeStudentManually();

                if( option == 2 ) alumno = studentHelper.getStudentByDefault();

                if( option == 3 ) {
                    if(alumno!=null) saveInFile("alumnos", alumno.getValuesToSave(), headerAlumns);
                    else System.out.println("Primero debe crear un alumno");
                }

            }while(option != 0);
        } catch (Exception e) {
            System.out.println("Por favor el manu solo acepta valores numericos\n");
        }


    }
}
