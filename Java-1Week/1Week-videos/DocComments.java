public class DocComments {
    public static void main(String[] args){



    }

    /**
     * Function name: greet
     * Inside the function:
     * 1. prints "Hi"
     */
    public static void greet(){
        System.out.println("Hi");
    }

    /**
     * Function Name: printText
     *
     * @param name (String)
     * @param age (String)
     *
     *            Inside Function:
     *            1. prints name and age concatenated in text.
     */
    public static void printText (String name, String age){
        System.out.println("Hi I'm " + name + " and I'm " + age + " years old");
    }

    /**
     * Function Name: calculateArea
     * @param length (double)
     * @param width (double)
     * @return
     * Inside Function:
     * 1. calcluates the area of length * width
     * 2. returns the area
     */
    public static double calculateArea (double length, double width){
        double area = length * width;
        return area;
    }
}