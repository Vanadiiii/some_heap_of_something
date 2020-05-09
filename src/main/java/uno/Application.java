package uno;

import uno.game.Card;
import uno.game.CardValue;
import uno.game.CardColour;
import uno.game.Player;

import java.util.Arrays;

import static uno.game.CardValue.*;
import static uno.game.CardColour.*;

public class Application {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setCardList(
                Arrays.asList(
                        new Card(EIGHT, RED, player1),
                        new Card(DRAW_TWO, BLUE, player1),
                        new Card(WILD, GRIN, player1),
                        new Card(NINE, YELLOW, player1)
                )
        );
//        player1.makeAMove();
        CardValue cardValue = EIGHT;
        CardColour cardColour = CardColour.BLUE;

    }
}
