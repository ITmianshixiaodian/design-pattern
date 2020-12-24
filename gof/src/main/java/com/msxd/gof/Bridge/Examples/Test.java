package com.msxd.gof.Bridge.Examples;

/**
 * @author wjhk
 * @date 2020/12/24 11:27
 */
public class Test {
    public static void main(String[] args) {
        //白色
        Color white =new White();
        Color gray = new Gray();

        //正方形
        Shape square =new Square();
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();

        //圆形
        Shape circle = new Circle();
        circle.setColor(gray);
        circle.draw();


    }

}
