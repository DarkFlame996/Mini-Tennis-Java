package main;

import javax.swing.JFrame;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Mini Tennis By Sebastiano D'Angelo");
		Game game = new Game();
		window.add(game);
		window.setSize(300, 400);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			game.move();
			game.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
