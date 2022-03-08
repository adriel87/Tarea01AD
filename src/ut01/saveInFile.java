package ut01;

import java.io.*;

public class saveInFile {

    public static void saveInFile(String fileName, String valueToSave, String[] cabecera){
        File file = new File(fileName);
        PrintWriter out = null;



        try{

            if(file.exists()==false){
                out = new PrintWriter(new FileWriter(fileName+".dat",true));
                for(String field: cabecera ){
                    System.out.println(field);
                    String formatValue = String.format("%-30.30s\t",field);
                    out.print(formatValue);

                }
                out.println();
            }else {
                out = new PrintWriter(new FileWriter(fileName,true));
            }
            out.print(valueToSave);

        }catch (IOException e){
            System.out.println(e);
        }finally {
            if(out != null){
                out.close();
            }
        }
    }





}
