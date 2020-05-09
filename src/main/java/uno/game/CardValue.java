package uno.game;

import lombok.Getter;

@Getter
public enum CardValue {
    ONE(0),
    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),

    SKIP(9),
    REVERSE(10),
    DRAW_TWO(11),
    WILD(12);
//    WILD_DRAW_FOUR(13);

    private final int value;

    CardValue(int value) {
        this.value = value;
    }
}
