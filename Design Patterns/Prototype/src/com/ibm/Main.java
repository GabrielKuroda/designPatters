package com.ibm;

class Point
{
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

}

class Line
{
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy()
    {
        Point startCopy = new Point(start.x,start.y);
        Point endCopy = new Point(end.x,end.y);
        return new Line(startCopy,endCopy);
    }
}

class Main
{
    public static void main(String[] args) {
        Line line1 = new Line(new Point(0,0),new Point(1,1));
        Line line2 = line1.deepCopy();
        System.out.println(line1);
        System.out.println(line2);
    }
}


