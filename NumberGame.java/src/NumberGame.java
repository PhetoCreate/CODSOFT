import javax.swing.JOptionPane;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) throws Exception {
        // generate the number to be guesses
        Random randomNmr = new Random();
        int guessNmr = randomNmr.nextInt(100);
        // stopper 
        Boolean stopLoop = false;
        // loop
        while (stopLoop == false) {
            int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number"));
            CompareGuess(guessNmr, guess,stopLoop); 
        }
    }

    public static void CompareGuess(int numberToGuess, int guess, boolean stoploop){
        if (numberToGuess == guess){
            JOptionPane.showMessageDialog(null,"Congrats!!! You guessed the number correctly");
            //String playAgain = JOptionPane.showInputDialog("Would you like to play again?");
            // if (playAgain.toLowerCase() == "yes"){ // convert to lowercase
            //     stoploop = false;
            // }
            
        }else if(guess > numberToGuess){
            JOptionPane.showMessageDialog(null, guess+" is to high, try again.");
        }else if (guess < numberToGuess){
            JOptionPane.showMessageDialog(null, guess+" is to low, try again.");
        }
    }

    public static void UserScore(){
        
    }
}
