class CalculationService {
    public void getArea(Polygon p) {
        float result = 0;

        if(p.type == 1) {
            result = areaSquare(p);
        } else if(p.type == 2) {
            result = areaCircle(p);
        }

        return result;
    }

    public void areaCircle(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius, 2);
    }

    public void areaSquare(Square square) {
        return Math.pow(square.getSide, 2);
    }
}

class Polygon {
    int type;
}

class Square extends Polygon {
    int side;
    
    public Square(int side) {
        super.type = 1;
        this.side = side;
    }
 
    public int getSide(){
        return this.side;
    }
}
 
class Circle extends Polygon {
    int radius;
    
    public Circle(int radius) {
        super.type = 2;
        this.radius = radius;
    }
    
    public int getRadius(){
        return this.radius;
    }
}