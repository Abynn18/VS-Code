import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
class BookStore  {
public static void main(String[] args) {
        String data="Book order placed at [your preferred time]";
        File file = new File("log.txt");
         try {
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
            System.out.println("File written successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred during file writing: " + e.getMessage());
        }
        try {
            FileReader reader = new FileReader(file);
            System.out.println("File content: "+data);
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred during file reading: " + e.getMessage());
            
        }
         
        boolean value = file.delete();
        if(value) {
            System.out.println("The File is deleted.");
        }
        else {
            System.out.println("The File is not deleted.");
        }

    
}
}
