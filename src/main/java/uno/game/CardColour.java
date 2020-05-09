package uno.game;

import lombok.Getter;

@Getter
public enum CardColour {
    RED(0),
    YELLOW(1),
    GRIN(2),
    BLUE(3);

    private final int value;

    CardColour(int value) {
        this.value = value;
    }
}
