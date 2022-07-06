package pokemons;

import physicalM.Headbutt;
import specM.Psychic;
import statM.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slowpoke extends Pokemon {
    public Slowpoke(String name, int level){
        super(name,level);
        setStats(90,65,65,40,40,15);
        setType(Type.WATER,Type.PSYCHIC);
        setMove(new Headbutt(),new Psychic(),new Swagger());
    }
}
