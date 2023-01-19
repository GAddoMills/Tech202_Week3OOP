package com.sparta.gam.SafariPark;

public class LaserGun extends Weapon{
    public LaserGun(String brand){
        super(brand);
    };

    @Override
    public String shoot() {
        return "Zing!! Shooting a LaserGun -" + super.shoot();
    }


}
