package pokemons;

import physicalM.Headbutt;
import specM.PowerGem;
import specM.Psychic;
import statM.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Slowking extends Slowpoke{
    public Slowking(String name, int level){
        super(name,level);
        setStats(95,75,80,100,110,30);
        setType(Type.WATER,Type.PSYCHIC);
        setMove(new Headbutt(),new Psychic(),new Swagger(),new PowerGem());
    }
}
