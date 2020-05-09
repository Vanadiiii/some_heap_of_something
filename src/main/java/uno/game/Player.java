package uno.game;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Player extends Thread implements IMove, ISkip, ICheck {
    List<Card> cardList;
    boolean isMyTurn;

    @Override
    public void checkPreviousCard() {
        Card previousCard = Table.oldCardQueue.peek();
//        if(previousCard!= null) this.makeAMove(); //делает первый ход
        assert previousCard != null;
        if (previousCard.value == CardValue.SKIP || previousCard.value == CardValue.REVERSE) {
            this.skip();
        }
        if (previousCard.value == CardValue.DRAW_TWO) {
            this.cardList.add(Heap.newCardQueue.poll());
            this.cardList.add(Heap.newCardQueue.poll());
        }
    }

    @Override
    public void makeAMove(Card card) {
        cardList.remove(card);
        Table.oldCardQueue.add(card);
    }

    @Override
    public void skip() {
        this.isMyTurn = false;
    }
}
