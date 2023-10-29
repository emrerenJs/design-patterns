package strategy.RPGGame.Entities.Abstract;

import strategy.RPGGame.Behaviours.Abstract.IWeaponBehavior;

public abstract class GameCharacter {
    protected IWeaponBehavior weaponBehavior;

    public void setWeaponBehavior(IWeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    } 

    public void fight() {
        this.weaponBehavior.useWeapon();
    };
}
