package animal;

import field.Location;

public class Animal {
	private boolean 	alive = true;
	private int 		age = 0;
	private int 		ageLimit = 4;
	
	public Animal(int ageLimit) {
		super();
		this.ageLimit = ageLimit;
	}

	public Animal() {
		super();
	}
	
	public void born() { alive = true; }
	public void die() { alive = false; }
	
	public boolean isAlive(){ return alive; }
	public int getAge(){ return age; }
	public double getAgePercent(){
		return (double)age / ageLimit;
	}
	
	public void grow(){
		age++;
		if(age > ageLimit){
			die();
		}
	}
	
	public Location move(Location[] freeNeighbours){
		if(freeNeighbours == null){
			return null;
		}else{
			return freeNeighbours[(int)(Math.random() * freeNeighbours.length)];
		}
	}
	
	public Animal breed(){
		return new Animal();
	};
	
	public void longerLive(int time){
		ageLimit += time;
	}
	
	public void eat(){}
	public boolean isBreedable(){
		return getAgePercent() > 0.2 && getAgePercent() < 0.8;
	}
}
