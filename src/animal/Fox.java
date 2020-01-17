package animal;

import java.awt.Color;
import java.awt.Graphics;

import cell.Cell;

public class Fox extends Animal implements Cell{

	public Fox() {
		super(5);
	}

	public Fox(int ageLimit) {
		super(ageLimit);
	}

	@Override
	public void eat() {
		super.longerLive(2);
	}

	@Override
	public boolean isBreedable() {
		return super.getAgePercent() > 0.45 && super.getAgePercent() < 0.55;
	}
	
	@Override
	public void draw(Graphics g, int row, int col, int size) {
		g.setColor(new Color(255, 0, 0, (int)((1 - super.getAgePercent()) * 255)));
		g.fillRect(row, col, size, size);
	}

	@Override
	public Animal breed() {
		return new Fox();
	}
	
}
