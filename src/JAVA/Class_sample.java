package JAVA;

public class Class_sample {
        double a1,b1,a2,b2;
    public static void main(String[] args) {
        Class_sample object = new Class_sample();
        object.a1=100;
        object.b1=20;
        object.a2=20;
        object.b2=70;
        System.out.println("Sum is "+(object.a1+object.b2));
        System.out.println("Difference is "+(object.a1 - object.b1));
        System.out.println("Product is "+(object.a1 * object.b2));
        System.out.println("Divisoni "+(object.a1 / object.b1));

    }
}

