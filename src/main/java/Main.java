import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Clefable p1 = new Clefable("Клефербейл",3);
        Clefairy p2 = new Clefairy("Клефейри",2);
        Cleffa p3 = new Cleffa("Клеффа :)",1);
        Mesprit p4 = new Mesprit("Мисприт",3);
        Slowking p5 = new Slowking("Словкинг",2);
        Slowpoke p6 = new Slowpoke("Слоупок !",1);

        battle.addAlly(p1);
        battle.addAlly(p2);
        battle.addAlly(p3);

        battle.addFoe(p4);
        battle.addFoe(p5);
        battle.addFoe(p6);

        battle.go();




    }
}