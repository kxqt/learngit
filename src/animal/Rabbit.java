package animal;

import java.awt.Color;
import java.awt.Graphics;

import cell.Cell;

public class Rabbit extends Animal implements Cell {

	public Rabbit() {
		super(15);
	}

	public Rabbit(int ageLimit) {
		super(ageLimit);
	}

	@Override
	public boolean isBreedable() {
		return super.getAgePercent() > 0.2 && super.getAgePercent() < 0.8;
	}

	@Override
	public void draw(Graphics g, int row, int col, int size) {
		g.setColor(new Color(0, 0, 0, (int)((1 - super.getAgePercent()) * 255)));
		g.fillRect(row, col, size, size);
	}

	@Override
	public Animal breed() {
		return new Rabbit();
	}
	

}
