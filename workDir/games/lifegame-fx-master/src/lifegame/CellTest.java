package lifegame;


import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class CellTest {

	@Test
	public void 死んでいるセルに隣接する生きたセルがちょうど3つあれば次の世代が誕生する() {
		Cell cell = new Cell(false);
		List<Cell> neighbourCells = new ArrayList<>();
		neighbourCells.add(new Cell(true));
		neighbourCells.add(new Cell(true));
		neighbourCells.add(new Cell(true));
		neighbourCells.add(new Cell(false));
		neighbourCells.add(new Cell(false));
		neighbourCells.add(new Cell(false));
		neighbourCells.add(new Cell(false));
	}

	@Test
	public void 生きているセルに隣接する生きたセルが2つか3つならば次の世代でも生存する() {
		{
			Cell cell = new Cell(true);
			List<Cell> neighbourCells = new ArrayList<>();
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
		}
		{
			Cell cell = new Cell(true);
			List<Cell> neighbourCells = new ArrayList<>();
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
		}
	}

	@Test public void 生きているセルに隣接する生きたセルが1つ以下ならば過疎により死滅する() {
		{
			Cell cell = new Cell(true);
			List<Cell> neighbourCells = new ArrayList<>();
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
		}
		{
			Cell cell = new Cell(true);
			List<Cell> neighbourCells = new ArrayList<>();
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
		}
	}

	@Test
	public void 生きているセルに隣接する生きたセルが4つ以上ならば過密により死滅する() {
		{
			Cell cell = new Cell(true);
			List<Cell> neighbourCells = new ArrayList<>();
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
			neighbourCells.add(new Cell(false));
		}
		{
			Cell cell = new Cell(true);
			List<Cell> neighbourCells = new ArrayList<>();
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
			neighbourCells.add(new Cell(true));
		}
	}
}
