package specM;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class PowerGem extends SpecialMove {
    public PowerGem(){
        super(Type.ROCK,80,100);
    }
    @Override
    public String describe(){
        return "Использует атаку PowerGem";
    }
}
