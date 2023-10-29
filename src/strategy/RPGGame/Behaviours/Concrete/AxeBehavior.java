package strategy.RPGGame.Behaviours.Concrete;

import strategy.RPGGame.Behaviours.Abstract.IWeaponBehavior;

public class AxeBehavior implements IWeaponBehavior {
    public void useWeapon() {
        System.out.println("*Chopping with an axe*");
    }
}
