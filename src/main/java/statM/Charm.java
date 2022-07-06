package statM;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm(){
        super(Type.FAIRY,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -2);
    }

    @Override
    public String describe(){
        return "Использует атаку Charm";
    }
}
