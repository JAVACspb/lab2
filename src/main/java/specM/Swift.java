package specM;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Swift extends SpecialMove {
    public Swift(){
        super(Type.NORMAL,60,100);
    }

    @Override
    public String describe(){
        return "Использует атаку Swift";
    }
}
