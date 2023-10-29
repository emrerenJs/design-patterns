package strategy.RPGGame.Behaviours.Concrete;

import strategy.RPGGame.Behaviours.Abstract.IWeaponBehavior;

public class BowAndArrowBehavior implements IWeaponBehavior {
    public void useWeapon() {
        System.out.println("*Shoot with an arrow*");
    }
}
