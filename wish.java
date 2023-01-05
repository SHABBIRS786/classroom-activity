class Wish
{
     static
     {
        System.out.println("static block");
     }
      Wish()
      {
         System.out.println("constructor");
      }
     public static void display()
      {
       System.out.println("method/non-static/instance");
      }
     public static void main(String[] args)
   {
     System.out.println("Static method");
     new Wish();
     Wish.display();

   }
}