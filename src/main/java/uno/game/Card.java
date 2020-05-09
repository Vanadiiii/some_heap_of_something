package uno.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Card {
    CardValue value;
    CardColour colour;
    @Setter
    Player owner;
}
