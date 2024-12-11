package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.data.xy.XYSeries;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;

public class Main {
    
    public void main() {
        
        /*
         * Let the User Input Values.
         */
        Scanner scan = new Scanner(System.in); //Create the Scanner object
        System.out.print("Type in the starting x value: "); //Print a message for the User to Input a value.
        int startX = scan.nextInt(); //Read input
        System.out.print("Type in the ending x value: "); //Print a message for the User to Input a value.
        int endX = scan.nextInt(); //Read input
        System.out.print("Type in the interval you'd like: "); //Print a message for the User to Input a value.
        int interval = scan.nextInt(); //Read user input

        /*
         * Data Series for Function.
         */
        XYSeries ser = new XYSeries("Function: y = 7 * x + 4"); //Create a new Function named the Equation
        DescriptiveStatistics stats = new DescriptiveStatistics(); //Create a new Statistics object

        /*
         * StringBuilder to store Data 
         */
        StringBuilder dataCSV = new StringBuilder("X,Y\n"); //Create a StringBuilder

        for (int x = startX; x <= endX; x += interval) {
            double y = 7 * x + 4; //Calculate y value
            ser.add(x, y); //Add Data Points
            stats.addValue(y); //Add y-value to Statistics object
            dataCSV.append(x).append(",").append(y).append("\n"); //Append data to CSV string using X,Y format.
        }

        /*
         * Save Data to Directory as a CSV File
         */
        String csvFileName = "function.csv"; //Create a new String
        try (FileWriter writer = new FileWriter(csvFileName)) {
            writer.write(dataCSV.toString()); //Write data to File
            System.out.println("\nFile saved in directory as: " + csvFileName); //Print a Worked Message
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage()); //Print an Error message
        }

        // Create dataset and chart
        XYSeriesCollection data = new XYSeriesCollection(ser); // Create a new XYSeriesCollection
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Function Plot P&AS", //Title of the Chart
                "X", //X-axis label
                "Y", //Y-axis label
                data, //The Dataset
                PlotOrientation.VERTICAL, //Plot orientation
                true, //Show legend
                true, //Show tooltips for the Graph
                false); //Show URLs for the Graph

        /*
         * Save the chart as a .PNG in Directory
         */
        String chartFile = "function_plot.png"; //Create a new String for the Function Plot
        try { 
            ChartUtils.saveChartAsPNG(new File(chartFile), chart, 800, 600); //Save chart as a .PNG
            System.out.println("\nGraph saved in working directory as: " + chartFile); //Print a message for the User to know it saved.
        } catch (IOException e) { //Catch the Exception if it happens.
            System.out.println("Error saving chart as image: " + e.getMessage()); //Print an Error Message for the User.
        }

        /*
         * Display the Chart in a new Popped Out Window
         */
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Function Plot"); //Create a new JFrame for the Chart
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make it end the Operation whenever you close the chart.
            frame.add(new ChartPanel(chart)); //Add the Chart Panel to the Frame
            frame.pack(); //Put the Components into the Frame
            frame.setVisible(true); //Set the Frame Visibility so the User can see it.
        });

        scan.close(); //Close the Scanner
    }
}
