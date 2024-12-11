import javax.swing.*;
import java.awt.*;

public class Plotter extends JPanel {

    @Override //Taking over the Painting component for the Plotter.
    public void paintComponent(Graphics graph) {

        super.paintComponent(graph);
        Graphics2D plot = (Graphics2D) graph;


        /*
         * Set up the graph by getting the Width and Height.
         */
        int width = getWidth(); //Get the Width of the Graph.
        int height = getHeight(); //Get the Height of the Graph.


        //Draw X and Y axes
        plot.drawLine(50, height/2, width-50, height/2); //X-axis
        plot.drawLine(width/2, 50, width/2, height-50); //Y-axis


        /*
         * Plot the Equation.
         */
        plot.setColor(Color.green); //Setting the Graph Points to be Green.


        for (int x = -350; x <= 350; x++) {
            int scale = 1; //Scaling factor
            int xScreen = width / 2 + x * scale; //Convert graph to screen for X
            int y = x * x * x; //The Equation that is to be Graphed
            int yScreen = height / 2 - y * scale; //Convert graph to screen for Y


            /*
             * Check and Plot the Points.
             */
            if (xScreen >= 50 && xScreen < width - 50 && yScreen >= 50 && yScreen < height - 50) { //Make sure the Points are only drawn and plotted in the visible bounds of the area.
                plot.fillOval(xScreen-3, yScreen-3, 6, 6); //Put the Points on Screen
            }
        }
    }
}
