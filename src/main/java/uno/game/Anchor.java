package uno.game;

import java.util.*;

public class Anchor implements ICheck { //ведущий
    public int numberOfPlayers;

    public void dealCards() { //раздать карты

    }


    public static void fillHeap() { //заполнить новые карты в колоде, кроме 5и из биты
        Heap.newCardQueue = shuffleCards(Table.oldCardQueue);
        Table.oldCardQueue.clear();
    }

    private static Queue<Card> shuffleCards(Queue<Card> cards) {
        List<Card> cardList = new ArrayList<>(cards);
        Collections.shuffle(cardList);
        return new LinkedList<>(cardList);
    }

    @Override
    public void checkPreviousCard() {

    }
}
