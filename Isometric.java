class Isometric
{
private final int width, height;
    private final int tileWidth, length;
    private int[] tiles;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new int[width * height];
        tileWidth = 68;
        length = 48;
    }
    }
