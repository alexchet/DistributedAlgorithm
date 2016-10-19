import java.io.IOException;

/**
 * This program creates a series of trees in a particular order and/or
 * randomly to test and analyse two different algorithms in particular
 * the Tree Wave Algorithm and the Tree Election Algorithm. The testing
 * is done by creating three separate trees with different properties 
 * and processing them with the above mentioned Algorithms.
 * 
 * @author Alexander Chetcuti 
 * @version 1.0.14 (12/10/2106)
 *
 */
public class Main {
	
	/**
	 * Constructor of class Main.
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException {
		try {
			Interface.MainMenu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
