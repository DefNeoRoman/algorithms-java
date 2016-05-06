package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

public class Card {

    public enum Symbol {
        CLUB, SPADE, HEART, DIAMOND
    }

    public enum Letter {
        N2("2"), N3("3"), N4("4"), N5("5"), N6("6"), N7("7"), N8("8"), N9("9"), N10("10"), J("J"), Q("Q"), K("K"), A("A");

        String displayName;

        Letter(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    private Letter letter;
    private Symbol symbol;

    public Card(Letter letter, Symbol symbol) {
        this.letter = letter;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol + "-" + letter.getDisplayName();
    }
}
