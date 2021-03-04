package HousePoints;

/*
* File: HousePointsController.java
* ----------------------
* The controller part of the HousePoints program.
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.*;

public class HousePointsController implements ActionListener {
	/**
	 * These are ivars because they are shared between the methods.
	 *
	 */
	private JTextField intsField;
	private HousePointsModel model;

	/** Constructor */
	public HousePointsController(HousePointsModel model, JPanel panel) {
		this.model = model;
// The text field interactor where the user enters points
		panel.add(new JLabel("Points: "));
		intsField = new JTextField(20);
		panel.add(intsField);
		intsField.addActionListener(this);
// Hitting enter in the text field also triggers an update
		intsField.setActionCommand("Graph");
// The button that triggers an update of the model
		JButton graphButton = new JButton("Graph");
		panel.add(graphButton);
		graphButton.addActionListener(this);
	}

	/** The action performed when hitting enter or the button. */
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Graph")) {
			String line = intsField.getText();
			int[] housePoints = parseInts(line);
			model.setHousePoints(housePoints);
		}
	}

	/** Parse four integers. Default values are 0. */
	private int[] parseInts(String line) {
		int[] housePoints = new int[4];
		StringTokenizer tokenizer = new StringTokenizer(line, ", ");
		for (int i = 0; (i < 4) && tokenizer.hasMoreTokens(); i++) {
			housePoints[i] = Integer.parseInt(tokenizer.nextToken());
		}
		return housePoints;
	}
}