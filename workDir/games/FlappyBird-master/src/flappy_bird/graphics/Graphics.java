package flappy_bird.graphics;

// ---------- Imports ----------
import flappy_bird.logic.GameStats;
import flappy_bird.logic.World;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
// ---------- ------- ----------

public class Graphics
{
	
	// ---------- Constants ----------
	
	// ---------- --------- ----------
	// ---------- Variables ----------
	private Canvas canvas;
	private GraphicsContext graphicsContext;
	
	private World world;
	private boolean gameRunning;
	// ---------- --------- ----------
	
	public Graphics(final Canvas canvas)
	{
		this.canvas = canvas;
		this.graphicsContext = canvas.getGraphicsContext2D();
		
		gameRunning = false;
		world = new World(canvas.getWidth(), canvas.getHeight());
	}
	
	public void draw()
	{
		Image background = new Image("resources/background.png");
		
		graphicsContext.drawImage(background, 0, 0, canvas.getWidth(), canvas.getHeight());
		
		double offset = world.getXOffset();
		ArrayList<Double> pipeHeights = world.getPipes();
		for (int i = 0; i < pipeHeights.size(); i++)
		{
			drawPipesAtLoc(offset + i * GameStats.PIPE_INTERVAL, pipeHeights.get(i));
		}
		
		graphicsContext.drawImage(new Image("resources/bird_" + (world.isGoingDown() ? "down" : "up") + ".png"),
				GameStats.PLAYER_OFFSET, world.getPlayerHeight(), GameStats.PLAYER_WIDTH, GameStats.PLAYER_HEIGHT);
	}
	
	public World getWorld()
	{
		return world;
	}
	
	public void gameTick()
	{
		world.gameTick();
		draw();
		
		gameRunning = !world.isPlayerDead();
	}
	
	public void drawPipesAtLoc(final double xOffset, final double yOffset)
	{
		graphicsContext.drawImage(new Image("resources/pipe_up.png"), xOffset, yOffset + GameStats.PIPE_SEPARATION, GameStats.PIPE_WIDTH, canvas.getHeight());
		graphicsContext.drawImage(new Image("resources/pipe_down.png"), xOffset, yOffset - canvas.getHeight(), GameStats.PIPE_WIDTH, canvas.getHeight());
	}
	
	public void newGame()
	{
		world.restart();
		
		gameRunning = true;
	}
	public void end()
	{
		gameRunning = false;
	}
	
	public boolean isGameRunning()
	{
		return gameRunning;
	}
	
	public int getFpsDelay()
	{
		return 1000 / GameStats.FPS;
	}
	
}
