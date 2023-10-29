package strategy.RPGGame.Entities.Concrete;

import strategy.RPGGame.Behaviours.Concrete.KnifeBehavior;
import strategy.RPGGame.Entities.Abstract.GameCharacter;

public class Troll extends GameCharacter {
    public Troll() {
        this.setWeaponBehavior(new KnifeBehavior());
    }
}
