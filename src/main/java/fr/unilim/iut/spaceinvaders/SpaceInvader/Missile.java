package fr.unilim.iut.spaceinvaders.SpaceInvader;

public class Missile extends Sprite {



    public Missile(Dimension dimensionMissile, Position positionOrigineMissile, int vitesseMissile) {

        this.dimension = dimensionMissile;
        this.origine= positionOrigineMissile;
        this.vitesse = vitesseMissile;

    }
}