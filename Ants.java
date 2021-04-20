import java.util.Random;

public class Ants extends Organism {

    public Ants(int x, int y) {
        super("o", x, y);
    }

    /*
    Move. Every time step, randomly try to move up, down, left, or right. If the cell in the selected direction
    is occupied or would move the ant off the grid, then the ant stays in the current cell.
     */
    public void move() {
        {
            Random rdm = new Random();
            int x = rdm.nextInt(4);

            switch (x) {
                case 0:
                    System.out.println("MOVE UP");
                    this.decrementY();
                    break;
                case 1:
                    System.out.println("MOVE RIGHT");
                    this.incrementX();
                    break;
                case 2:
                    System.out.println("MOVE DOWN");
                    this.incrementY();
                    break;
                case 3:
                    System.out.println("MOVE LEFT");
                    this.decrementX();
                    break;
            }
        }
    }

    /*
    Breed. If an ant survives for three time steps, then at the end of the third time step, the ant will breed.
    This is simulated by creating a new ant in an adjacent cell that is empty. If there is no empty cell available,
    no breeding occurs. Once an offspring is produced, the ant cannot produce an offspring until three more time steps
    have elapsed.
     */
    public void breed()
    {

    }

    public static void main(String[] args) {

    }
}
