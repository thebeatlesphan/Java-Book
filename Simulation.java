import java.util.Scanner;
import java.util.Random;

/*
The goal for this  programming project is to create a simple 2D predator-prey simulation. In this simulation, the prey
is ants, and the predators are doodlebugs. These critters live in a world composed of a 20 X 20 grid of cells. Only
one critter may occupy a cell at a time. The grid is enclosed, so a critter is not allowed to move off the edges of the
grid. Time is simulated in time steps. Each critter performs some action every time step.
 */

public class Simulation {
    private final int MAX_HEIGHT = 20;
    private final int MAX_WIDTH = 20;
    private final String[][] grid = new String[MAX_HEIGHT][MAX_WIDTH];
    private final Organism[][] finalGRID = new Organism[MAX_HEIGHT][MAX_WIDTH];
    private int timeSteps = 0;

    public Simulation() {
    }

    public void getCellClass(Organism a) {
        System.out.println(a.getClass());
    }

    public int addToTimeSteps() {
        return timeSteps++;
    }

    public int getTimeSteps() {
        return timeSteps;
    }

    //Press ENTER to time step
    public void pressEnter() {
        Scanner keyboard = new Scanner(System.in);

        boolean stopExit = true;
        while (stopExit) {
            System.out.println("Press ENTER to move a time step...");
            System.out.println("type 'exit' to exit...");
            String a = keyboard.nextLine();

            if (a.equals("exit")) stopExit = false;
            else if (a.length() >= 1) {
                System.out.println("PLEASE ONLY PRESS ENTER");
            } else {
                this.addToTimeSteps();
                System.out.println(this.getTimeSteps());
            }
        }
        System.out.println("BYE BYE");
    }

    //draw the 20 x 20 grid
    public void drawGrid() {
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                System.out.print(i + " ");
            } else
                System.out.print(i);
            for (int ii = 1; ii < 20; ii++) {
                System.out.print(" " + ii);
            }
            System.out.println();
        }
    }

    //draw finalGrid
    public void drawFinalGrid() {
        for (int i = 0; i < finalGRID.length; i++) {
            for (int ii = 0; ii < finalGRID[i].length; ii++) {
                if (finalGRID[i][ii] == null)
                    System.out.print(" ");
                else
                    System.out.print(finalGRID[i][ii].getBodyType());
            }
            System.out.println();
        }
    }

    //draw by Ants coordinates
    public void addAnts(int x, int y) {
        finalGRID[y][x] = new Ants(x,y);
    }

    public static void main(String[] args) {
        Simulation test = new Simulation();
        test.addAnts(1,1);
        test.drawFinalGrid();

        Ants ant = new Ants(1,2);

    }
}