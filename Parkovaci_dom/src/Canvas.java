import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {

	private ParkingHouse parkingHouse;
	int offsetX = 100;
	int offsetY = 450;
	int boxWidth = 200;
	int boxHeight = 140;
	
	public Canvas(ParkingHouse parkingHouse) {
		this.parkingHouse = parkingHouse;
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.clearRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setStroke(new BasicStroke(10));
		g2d.setFont(new Font("default", Font.BOLD, 16));
		this.paintHouse(g2d);
		this.drawCountOfFreePlaces(g2d, this.parkingHouse.getCountOfFreeBoxes());
		this.drawCars(g2d);
	}	
	
	public void drawCars(Graphics g) {
		String[] places = this.parkingHouse.getPlaces();
		
		for (int i = 0; i < places.length; i++) {
			if (places[i] != null) {
				this.paintCarIntoBox(g, i);
			}
		}
	}
	
	private void paintHouse(Graphics g) {		
		for (int i = 0; i < 4; i++) {
			g.drawRect(this.offsetX + (i * this.boxWidth), this.offsetY, this.boxWidth, this.boxHeight);
		}
	}
	
	private void paintCarIntoBox(Graphics g, int index) {
		int carWidth = this.boxWidth - (this.boxWidth / 8);
		int carHeight = this.boxHeight - (this.boxHeight / 8);		
		int offsetBoxX = (this.boxWidth - carWidth) / 2;
		int offsetBoxY = (this.boxHeight - carHeight) / 2;
		
		int posX = offsetX + (this.boxWidth * index) + offsetBoxX;
		int posY = offsetY + offsetBoxY;
		
		this.drawCar(g, posX, posY, offsetBoxX, offsetBoxY);
	}
	
	private void drawCountOfFreePlaces(Graphics g, int count) {
		int posX = this.offsetX + (4 * this.boxWidth) - 200;
		int posY = this.offsetY - 50;
		
		int carWidth = 200;
		int carHeight = 50;
		
		g.drawRect(posX, posY, carWidth, carHeight);
		g.drawString("Volne miesta: " + count, posX + 26, posY + 30);
	}
	
	private void drawCar(Graphics g, int posX, int posY, int offsetBoxX, int offsetBoxY) {
		try {
			BufferedImage image = ImageIO.read(new File("src/car.png"));
			int carWidth = this.boxWidth - (2 * offsetBoxX);
			int carHeight = this.boxHeight - (2 * offsetBoxY);
			
			g.drawImage(image, posX, posY, carWidth, carHeight, null);
		} catch (Exception e) {
			System.out.println("Image not found");
		}
	}
}
