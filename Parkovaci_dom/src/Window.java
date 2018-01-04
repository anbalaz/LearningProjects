import javax.swing.JFrame;

public class Window {
	private ParkingHouse parkingHouse;
	private JFrame jFrame;
	private Canvas canvas;
	
	public Window(ParkingHouse parkingHouse) {
		this.parkingHouse = parkingHouse;
		this.canvas = new Canvas(this.parkingHouse);
		
		this.jFrame = new JFrame("Parking house");
		this.jFrame.setSize(1000, 700);
		this.jFrame.add(canvas);
		this.jFrame.setVisible(true);
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		this.canvas.repaint();
	}
	
	public void repaintCanvas() {
		this.canvas.repaint();
	}
}
