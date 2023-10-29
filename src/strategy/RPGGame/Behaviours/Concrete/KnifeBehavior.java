package strategy.RPGGame.Behaviours.Concrete;

import strategy.RPGGame.Behaviours.Abstract.IWeaponBehavior;

public class KnifeBehavior implements  IWeaponBehavior{
    public void useWeapon() {
        System.out.println("*Cutting with a knife*");
    }
}
