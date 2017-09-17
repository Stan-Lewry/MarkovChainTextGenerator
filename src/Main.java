import javax.swing.*;

public class Main {

    //private TextGenerator textGenerator;

    public static void main(String [] args){
      TextGenerator textGenerator = new TextGenerator();
      textGenerator.BuildCorpus("test");
      textGenerator.PrintCorpus();

      System.out.println("Attempting to Generate a string.... \n\n\n");

      textGenerator.GenerateText();


      System.out.println("Generated string:");
      System.out.println(textGenerator.getOutputString());

        ApplicationWindow applicationWindow = new ApplicationWindow();
    }
}
