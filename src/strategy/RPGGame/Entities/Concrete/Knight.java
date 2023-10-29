package strategy.RPGGame.Entities.Concrete;

import strategy.RPGGame.Behaviours.Concrete.SwordBehavior;
import strategy.RPGGame.Entities.Abstract.GameCharacter;

public class Knight extends GameCharacter {
    public Knight() {
        this.setWeaponBehavior(new SwordBehavior());
    }
}
