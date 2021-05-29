public abstract class Organism {
    private String bodyType;
    private int x,y;
    private int timeSteps;

    public Organism () {
        bodyType = "a";
        timeSteps = 0;
    }

    public Organism (String bodyType, int x, int y) {
        this.bodyType = bodyType;
        this.x = x;
        this.y = y;
        timeSteps = 0;
    }
    public Organism (int x , int y) {
        bodyType = "a";
        this.x = x;
        this.y = y;
        timeSteps = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) { this.y = y; }

    public void incrementX() {
        x++;
    }

    public void decrementX() {
        x--;
    }

    public void incrementY() {
        y++;
    }

    public void decrementY() {
        y--;
    }

    public String getBodyType() {
        return bodyType;
    }

    public abstract void move();

    public abstract void breed();
}
