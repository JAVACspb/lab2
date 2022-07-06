package pokemons;

import statM.Charm;
import statM.DoubleTeam;
import specM.IceBeam;
import specM.Swift;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mesprit extends Pokemon {
    public Mesprit(String name, int level){
        super(name,level);
        setStats(80,105,105,105,105,80);
        setType(Type.PSYCHIC);
        setMove(new Charm(),new IceBeam(),new DoubleTeam(),new Swift());
    }
}
