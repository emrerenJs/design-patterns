package strategy.RPGGame.Entities.Concrete;

import strategy.RPGGame.Behaviours.Concrete.AxeBehavior;
import strategy.RPGGame.Entities.Abstract.GameCharacter;

public class King extends GameCharacter {
    public King() {
        this.setWeaponBehavior(new AxeBehavior());
    }
}
