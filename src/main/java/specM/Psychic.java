package specM;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC,90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() < 0.1){
            pokemon.setMod(Stat.SPECIAL_DEFENSE,0);
        }
    }

    @Override
    public String describe(){
        return "Использует атаку Psychic";
    }
}
