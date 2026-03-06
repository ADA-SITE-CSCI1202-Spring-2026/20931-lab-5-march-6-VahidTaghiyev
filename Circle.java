class Circle implements Movable {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() { center.moveUp(); }

    @Override
    public void moveDown() { center.moveDown(); }

    @Override
    public void moveLeft() { center.moveLeft(); }

    @Override
    public void moveRight() { center.moveRight(); }

    public String toString() {
        return "Circle(center=" + center + ", radius=" + radius + ")";
    }
}