package statM;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL,0,0);
    }


    @Override
    public String describe(){
        return "Использует атаку DoubleTeam";
    }
}
