package uno.game;

import lombok.Getter;

import java.util.Queue;

public class Heap { //куча новых, неоткрытых карт
    public static Queue<Card> newCardQueue;
    @Getter
    private static int capacity;
}
