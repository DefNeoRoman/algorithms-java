package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

public class Card {

    public enum Symbol {
        CLUB, SPADE, HEART, DIAMOND
    }

    public enum Letter {
        N2("2", 2), N3("3", 3), N4("4", 4), N5("5", 5), N6("6", 6), N7("7", 7), N8("8", 8), N9("9", 9), N10("10", 10), J("J", 10), Q("Q", 10), K("K", 10), A("A", 11);

        String displayName;
        int value;

        Letter(String displayName, int value) {
            this.displayName = displayName;
            this.value = value;
        }

        public String getDisplayName() {
            return displayName;
        }

        public int getValue() {
            return value;
        }

    }

    private Letter letter;
    private Symbol symbol;

    public Card(Letter letter, Symbol symbol) {
        this.letter = letter;
        this.symbol = symbol;
    }

    public Letter getLetter() {
        return letter;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public int getValue() {
        return letter.getValue();
    }

    @Override
    public String toString() {
        return symbol + "-" + letter.getDisplayName();
    }
}
