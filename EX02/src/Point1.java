class Point1 {
    private int x, y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3d extends Point1 {
    private int z;

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }

    public void moveUp() {
        this.z = z + 1;
    }

    public void moveDown() {
        this.z = z - 1;
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")의 점";
    }
}

class Main {
    public static void main(String[] args) {
        Point3d p = new Point3d(1, 2, 3);
        System.out.println(p.toString() + "입니다.");
        p.moveUp();
        System.out.println(p.toString() + "입니다.");
        p.moveDown();
        p.move(10, 10, 3);
        System.out.println(p.toString() + "입니다.");
        p.move(100, 200, 300);
        System.out.println(p.toString() + "입니다.");
    }
}