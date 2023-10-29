package strategy.RPGGame.Behaviours.Concrete;

import strategy.RPGGame.Behaviours.Abstract.IWeaponBehavior;

public class SwordBehavior implements IWeaponBehavior {
    public void useWeapon() {
        System.out.println("*Swinging a sword*");
    }
}
