package pokemons;

import statM.CalmMind;
import specM.Moonblast;
import statM.WorkUp;
import ru.ifmo.se.pokemon.Type;

public class Clefable extends Clefairy{
    public Clefable(String name, int level){
        super(name, level);
        setType(Type.FAIRY);
        setStats(95,70,73,95,90,60);
        setMove(new WorkUp(),new Moonblast(),new CalmMind());
    }
}
