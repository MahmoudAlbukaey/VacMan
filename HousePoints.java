package HousePoints;

import javax.swing.JPanel;

import acm.program.GraphicsProgram;

public class HousePoints extends GraphicsProgram {
// Constants that define the size of the views
	private double GRAPHWIDTH = 400;
	private double GRAPHHEIGHT = 400;

	public void init() {
// Create a model
		HousePointsModel model = new HousePointsModel();
// Create bar graph view
		BarGraphView barview = new BarGraphView(GRAPHWIDTH, GRAPHHEIGHT);
		model.addView(barview);
		add(barview);

// The panel where the controller places its interactors
		JPanel controllerPanel = getRegionPanel(SOUTH);
// Create controller
		HousePointsController controller = new HousePointsController(model, controllerPanel);
	}

	public static void main(String[] args) {
	new HousePoints().start();
}
}