package strategy.RPGGame.Entities.Concrete;

import strategy.RPGGame.Behaviours.Abstract.IWeaponBehavior;
import strategy.RPGGame.Behaviours.Concrete.BowAndArrowBehavior;
import strategy.RPGGame.Entities.Abstract.GameCharacter;

public class Queen extends GameCharacter {
    public Queen() {
        this.setWeaponBehavior(new BowAndArrowBehavior());
    }

    public Queen(IWeaponBehavior weaponBehavior) {
        this.setWeaponBehavior(weaponBehavior);
    }
}
