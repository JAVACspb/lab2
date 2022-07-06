package pokemons;

import statM.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int level){
        super(name,level);
        setStats(50,25,28,45,55,15);
        setType(Type.FAIRY);
        setMove(new WorkUp());
    }
}
