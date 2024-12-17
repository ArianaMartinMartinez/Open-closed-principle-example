class CalculationService {
    public void getArea(Polygon p) {
        return p.area();
    }
}
 
class Polygon {
    abstract void area();
}
 
class Square extends Polygon {
    int side;
    
    public Square(int side) {
        this.side = side;
    }
    
    public void area() {
        return Math.pow(side,2);
    }
}
 
class Circle extends Polygon {
    int radius;
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    public void area() {
        return Math.PI * Math.pow(radius,2);
    }
}


class Triangle extends Polygon {
    int base;
    int height;
    
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    public void area() {
        return base*height/2;
    }
}