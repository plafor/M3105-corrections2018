import dicegame.DiceGame;
import dicegame.Display;
import dicegame.IDiceGame;
import dicegame.Input;
import display.DisplayConsole;
import input.KeyboardInput;

public class DiceGameLauncher {

	public static void main(String[] args) {
		Input input = new KeyboardInput();
		Display display = new DisplayConsole();
		IDiceGame game = new DiceGame(input, display); 
		game.start();
	}

}
