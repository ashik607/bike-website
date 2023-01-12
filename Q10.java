//Q10.Write a Java program to display the value of any two integer
//numbers using method overriding.



  
// Base Class
class Parent {
  int age;
  int roll;
  void show()
  {
      System.out.println("Age displayed in superclass :"+age);
  }
}

// Inherited class
class Child extends Parent {
  // This method overrides show() of Parent
  @Override
  void show()
  {
      System.out.println("Roll displayed in subclass:"+roll);
  }
}

// Driver class
class Q10 {
  public static void main(String[] args)
  {
      Parent obj1 = new Parent();
      obj1.age= 21;
      obj1.show();

      Parent obj2 = new Child();
      obj2.roll=200607;
      obj2.show();
  }
}