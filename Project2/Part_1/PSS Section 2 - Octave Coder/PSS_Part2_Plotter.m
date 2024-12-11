function retval = PSS_Part2_Plotter(in1, in2)

  %Generate the Salt Data

  x = -50:1:50; %Generate the X Values from -50 to 50 with a scale of 1
  y = 7 * x + 4; %New Function for PSS Part 2

  rng(50); %Random Generation
  salter = rand(size(y))*2 - 1; %Generate Random Points between -1 and 1
  ySalt = y+salter; %Combine the Salted Data with the Normal Data

  %Plot the Combined Data

  figure; %Start a Figure
  plot(x, y, 'b-', 'LineWidth', 1); %Make the Line Width of the Axes 1
  hold on;
  plot(x, ySalt, 'r.', 'MarkerSize', 10); %Make the Point Size 10
  title('Combined Data'); %Change the Title
  xlabel('X'); %Change the Label of the X axis
  ylabel('Y'); %Change the Label of the Y axis
  legend('Equation Data', 'Salt Data'); %Change the Legend tokens
  grid on; %Turn on the Grid of the background

  %Window Size Edits

  if nargin<2
    windowSize = 5; %Make this the Default Window Size
  else
    windowSize = in2; %Use the Inputs for the Window Size
  end
  ySmooth = movmean(ySalt, windowSize); %This is the Smoothed Data.

  %Plotting the Smoothed Data.

  figure; %Start a Figure
  grid on; %Turn on the Grid
  plot(x, ySalt, 'r.', 'MarkerSize', 10); %Make the Point Size 10
  hold on;
  plot(x, ySmooth, 'g-', 'LineWidth', 1); %Make the LineWidth of the Axes 1
  title('Salted & Smoothed Data'); %Change the Title
  xlabel('X'); %Label X Axis
  ylabel('Y'); %Label Y Axis
  legend('Salted Data', 'Smoothed Data'); %Change the Legend

  %Data to CSV
  out = [x', ySalt', ySmooth']; %Make the Data into Columns
  csvwrite('smoothdata.csv', out); %Write it into a CSV file with this name
  display('CSV Exported.'); %Show an Output on Octave

  %Output the Data.
  retval = out;
endfunction
