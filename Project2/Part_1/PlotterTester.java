import javax.swing.JFrame;



public class PlotterTester {
    

    public static void main(String[] args) {

        /*
         * Create the Frame using JFrame.
         */
        JFrame frame = new JFrame("Plot y = x*x*x"); //Name the Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the Graph when Closed
        frame.setSize(800, 600); //Setting the size of the Graph

        /*
         * Add the Panel.
         */
        Plotter plot = new Plotter(); //Make a new Plotter
        frame.add(plot); //Plot the Points

        /*
         * Set the Frame to be Visible for us to View it.
         */
        frame.setVisible(true);
    }

}
