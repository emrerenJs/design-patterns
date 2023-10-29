package strategy.RPGGame;

import strategy.RPGGame.Entities.Abstract.GameCharacter;
import strategy.RPGGame.Entities.Concrete.King;
import strategy.RPGGame.Entities.Concrete.Knight;
import strategy.RPGGame.Entities.Concrete.Queen;
import strategy.RPGGame.Entities.Concrete.Troll;

public class Main {

    private static void fight() {
        GameCharacter[] gameCharacters = new GameCharacter[4];
        gameCharacters[0] = new King();
        gameCharacters[1] = new Queen();
        gameCharacters[2] = new Knight();
        gameCharacters[3] = new Troll();
        
        for(GameCharacter gameCharacter : gameCharacters) {
            gameCharacter.fight();
        }
    }

    private static void runApp() {
        fight();
    }

    public static void main() {
        runApp();
    }
}
