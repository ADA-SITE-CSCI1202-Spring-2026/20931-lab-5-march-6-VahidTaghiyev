class Point implements Movable {
    int x, y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp(){y++;};

    @Override
    public void moveDown(){y--;};

    @Override
    public void moveRight(){x++;};

    @Override
    public void moveLeft(){x--;};


    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
