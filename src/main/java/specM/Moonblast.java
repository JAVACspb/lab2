package specM;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Moonblast extends SpecialMove {
    public Moonblast(){
        super(Type.FAIRY,95,100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.DEFENSE,1);
    }

    @Override
    public String describe(){
        return "Использует атаку Moonblast";
    }
}
