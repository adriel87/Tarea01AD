package ut01;

import java.util.ArrayList;
import java.util.Date;

import static ut01.saveInFile.saveInFile;
import static ut01.CursosList.getList;
import static ut01.Headers.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = getList();

        cursos.forEach(curso ->{
            saveInFile("cursos", curso.getValuesToSave(), headerCourse);
        });


    }
}
