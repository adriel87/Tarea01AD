package ut01;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("3678", "Iniciación a la red internet", 60, new Date(100,9,1), new Date(100,10,1)));
        cursos.add(new Curso("3609","Informática de usuario", 200, new Date(118,9,20), new Date(118,11,4)));
        cursos.add(new Curso("2758", "Informática de usuario", 200, new Date(118,11,9), new Date(119,1,4)));
        cursos.add(new Curso("3689", "Gobernanta/e de hotel", 615, new Date(118,9,18), new Date(119,2,18)));
        cursos.add(new Curso("3668","Empleado/a de oficina", 790, new Date(118,9,18), new Date(119, 4,14)));

        cursos.forEach(curso ->{
            System.out.println(curso.getCodigo());
        });

    }
}
