public class ReturnValues {
    public static void main(String[] args){






        double area = calculateArea (2.3, 4.4);

       double area2 =  calculateArea (2.4, 4.5);
        double area3 = calculateArea (2.6, 4.7);


        System.out.println(area);
        System.out.println(area2);
        System.out.println(area3);


    }

    public static double calculateArea(double length, double width){

        double area = length * width;
      return area;
    }
}