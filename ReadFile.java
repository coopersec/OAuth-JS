import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    private String gcValue;
    private int gcCount;
    private boolean firstTime;

    public ReadFile(String gcValue) {
        this.gcValue = gcValue;
        this.firstTime = true;
    }
  public void readFile(String fileName, int linesToRead) {
    try {
        // For more security.
        // try catch
        String secureFilename;
        try {
          secureFilename = fileName.split(".")[0];
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Error: Filename must have an extension.");
          secureFilename = fileName;
        }
        
        File myObj = new File(secureFilename);
        Scanner myReader = new Scanner(myObj);
        // this secures aginst overflow, by limiting the number of lines to read
        while (myReader.hasNextLine() || gcCount < linesToRead) {


          String data = myReader.nextLine();
          //System.out.println(data);
          if (firstTime == true){
            InputData inputData = new InputData();
            String[] test = data.replace(">", "").split("\n");
            test = test[0].split("_");
            inputData.setName(test[0]);
            inputData.setId(Long.parseLong(test[1]));
            System.out.println(inputData.getId());
            firstTime = false;
          }
          // Append data
          if (!data.startsWith(">")){
              System.out.println("Found a new starting line");
              this.gcValue += data;
              this.gcCount++;
          }
          }
          

          // Break down every character from gcValue into an array
          String[] gcArray = this.gcValue.split("");
          System.out.println(gcArray.length);
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
  }

    public static void main(String[] args) {
    ReadFile rf = new ReadFile("");
    
    rf.readFile("test.txt", 5);
  }
}


