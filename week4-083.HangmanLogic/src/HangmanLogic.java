
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!guessedLetters.contains(letter)){
            guessedLetters += letter;
            if(!word.contains(letter))
                numberOfFaults++;
        }
    }

    private char getChar(String text, int index){
        return text.charAt(index);
    }

    public String hiddenWord() {
        String hidden = "";
        for(int i = 0; i < word.length(); i++){
            String aLetter = "" + getChar(word,i);
            if(guessedLetters.contains(aLetter)){
                hidden += aLetter;
            }
            else{
                hidden += "_";
            }
        }

        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        return hidden;
    }
}
