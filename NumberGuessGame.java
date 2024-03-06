package numberguessgame;
import javax.swing.JOptionPane;

public class NumberGuessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int integername = 0; 
    int minimum = 0; 
    int maximum = 10;
    String userInput = JOptionPane.showInputDialog("Guess a number between 0 and 10");
    
    /*System.out.println(userInput);*/
    int intNum = Integer.parseInt(userInput); 
    JOptionPane.showMessageDialog(null, intNum, "Your guess", JOptionPane.PLAIN_MESSAGE); 
    int random = minimum + (int) (Math.random() * maximum);
    /*System.out.println(random);*/ 
    JOptionPane.showMessageDialog (null, random, "The correct number", JOptionPane.PLAIN_MESSAGE);
         System.exit(0);
        int intNum = Integer.parseInt(stringVariable);
         int random = minimum + (int) (Math.random() * maximum);
        if(condition) {
               your instructions ...
     } else {
              your instructions ...
                  while (condition) {
                  your instructions ...      }
            /
                  }
    
    
    
