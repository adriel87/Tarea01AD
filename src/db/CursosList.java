package db;

import ut01.Curso;

import java.util.ArrayList;
import java.util.Date;

public class CursosList {

    public static ArrayList<Curso> getList(){
        ArrayList<Curso> courseList = new ArrayList<>();

        courseList.add(new Curso("3678", "Iniciación a la red internet", 60, new Date(118,9,1), new Date(118,10,15)));
        courseList.add(new Curso("3609","Informática de usuario", 200, new Date(118,9,20), new Date(118,11,4)));
        courseList.add(new Curso("2758", "Informática de usuario", 200, new Date(118,11,9), new Date(119,1,4)));
        courseList.add(new Curso("3689", "Gobernanta/e de hotel", 615, new Date(118,9,18), new Date(119,2,18)));
        courseList.add(new Curso("3668","Empleado/a de oficina", 790, new Date(118,9,18), new Date(119, 4,14)));

        return courseList;
    }


}
