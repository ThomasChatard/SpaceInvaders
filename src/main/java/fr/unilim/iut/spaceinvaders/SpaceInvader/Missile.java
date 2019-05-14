package fr.unilim.iut.spaceinvaders.SpaceInvader;

public class Missile extends Sprite {
    
	public Missile(Dimension dimensionMissile, Position positionOrigineMissile, int vitesseMissile) {
		// TODO Auto-generated constructor stub
	}

	public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}

	private Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		// TODO Auto-generated method stub
		return null;
	}
}
