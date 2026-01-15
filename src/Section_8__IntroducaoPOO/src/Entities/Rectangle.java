package Section_8__IntroducaoPOO.src.Entities;

public class Rectangle {
    private Double width;
    private Double height;

    public Double calcArea(){
        return this.height * this.width;
    };

    public Double calcPerimeter(){
        return (this.height *2) + (this.width*2);
    }

    public Double calcDiagonal(){
        return Math.sqrt(Math.pow(this.height,2) + Math.pow(this.width,2));
    }

    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

}
