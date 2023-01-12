



// Q9.Write a Java program to calculate the area and volume of a room
//using method overloading; where length width and height are 50, 7
//and 15 meter respectively.


 
class Rectangle {
 
    void Area( int l , int w)
    {
        System.out.println("Area of the Room: "
                           + l * w);
    }
 
    
    void Area(int l, int w,int h)
    {
        System.out.println("Volume of the Room: "
                           + l*w*h);
    }
}
 
class Q9 {
 
    // Driver code
    public static void main(String[] args)
    {
 
        // Creating object of Rectangle class
        Rectangle obj = new Rectangle();
 
        // Calling function
        obj.Area(50, 7);
        obj.Area(50, 7,14);
    }
}
