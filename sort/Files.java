import java.io.*;
import java.util.*;


public class Files extends Inputa{
	
    

public String get_text(File file){

    
           Scanner inputStream = null;
           String fileString = "";
           
   try{
       inputStream = new Scanner(new FileInputStream(file));
   }
   catch(FileNotFoundException E){
       System.out.println("File was not found or could not be opened.");
       System.exit(0);
   }
   
   while(inputStream.hasNextLine()) {
       fileString += inputStream.nextLine();
       fileString +=" ";
   } 
   return fileString;
}


}	