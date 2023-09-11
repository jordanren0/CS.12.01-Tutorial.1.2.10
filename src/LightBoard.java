public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];

    }

    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }

    public boolean evaluateLight(int row, int col)
    {
        return lights[row][col];
    }
}
