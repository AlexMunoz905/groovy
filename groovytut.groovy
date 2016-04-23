/*
Multi line
Comment
*/
// Regulur Comment

class Learning{
  static void main(String[] args){

    // Print out text
    println("Hello World");

    // Variables
    def age = "Dog";
     age = 40;

    // Math Functions
    println("5 + 4 = " + (5 + 3));
    println("5 - 4 = " + (5 - 3));
    println("5 * 4 = " + (5 * 3));
    println("5 / 4 = " + (5.intdiv(4)));
    println("5 % 4 = " + (5 % 3));

    println("5.2 + 4.4 = " + (5.2.plus(4.4)));
    println("5.2 - 4.4 = " + (5.2.minus(4.4)));
    println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
    println("5.2 / 4.4 = " + (5.2 / 4.4));

    println("3 + 2 * 5 = " + (2 + 2 * 5));
    println("(3 + 2) * 5 = " + ((3 + 2) * 5));

    // Adding values to variables
    /*
    It adds one to the variable
    so age = 40
    but after age++ it = 41
    */
    println("age++ = " + (age++));
    println("++age = " + (++age));
    println("age-- = " + (age--));
    println("--age = " + (--age));


  }
}
