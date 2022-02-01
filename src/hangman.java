import javax.swing.*;

public class hangman {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter word:");
        word = word.toUpperCase();
        String blank = "";

        int p = 0;
        int attempt = 0;
        int totA = 11;

        for(int i = 0; i < word.length(); i++){
            blank += "_";
        }
        System.out.println(blank);
        char[] blankC = blank.toCharArray();

        while(!blank.equals(word)){

            String guess = JOptionPane.showInputDialog("Enter letter:");
            guess = guess.toUpperCase();

            for(int o = 0; o < word.length(); o++){
                char letter = word.charAt(o);
                String letterS = String.valueOf(letter);
                if (guess.equals(letterS)){
                    blankC[o] = letter;
                    System.out.println(blankC);
                    blank = String.valueOf(blankC);
                    p += 1;
                    }
                if (p < 1 && o >= word.length()) {
                    attempt += 1;
                    System.out.println("Nope");
                    break;
                }
                if (attempt >= totA) {
                    System.out.println("BIG LOSE!!!");
                    System.exit(0);
                }
            }
        }
        System.out.println("BIG WIN!!!");
    }
}