import java.io.*;
public class FileReaderExample {

    public static void main(String[] args) {
         System.out.println("B.PRANATHI,CSE24022");
         try {
                  BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
                  String line;
                  while((line = reader.readLine())!= null){
                       System.out.println(line);
                  }
         reader.close();
         } catch (FileNotFoundException e) {
             System.out.println("File not found: " +e.getMessage());
         } catch (IOException e) {
             System.out.println("Error reading file: "+e.getMessage());
         }
    }
}
         