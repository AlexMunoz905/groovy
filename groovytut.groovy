/*
Multi line
Comment
*/
// Regulur Comment

class Main{
  static void main(String[] args){

    // Print out text
    println("Hello World");

    // Variables
    def name = "Alexander"
    def age = "Dog";
     age = 40;

    // Math Functions
    println("  ")
    println("Got to have pi! 3.1415926535897932384626433832795028841")
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
    println("  ")
    println("age++ = " + (age++));
    println("++age = " + (++age));
    println("age-- = " + (age--));
    println("--age = " + (--age));

    println("  ")
    // Smallest and biggest int, float, doubles
    println("Biggest Int: " + Integer.MAX_VALUE)
    println("Smallest Int: " + Integer.MIN_VALUE)

    println("Biggest Float: " + Float.MAX_VALUE)
    println("Smallest Float: " + Float.MIN_VALUE)

    println("Biggest Double: " + Double.MAX_VALUE)
    println("Smallest Double: " + Double.MIN_VALUE)
    println("  ")

    // Decimal Accuracy
println("1.1000000000000001 + 1.1000000000000001 "
+ (1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111));

  println("  ")
  // DOnt use single quotes
  println("I am ${name}\n")
  println("  ")
  // Prints out to the next line
  def multiString = '''I am
  a string that goes on
  for many lines'''

  println(multiString)
  println("  ")
  // Get the certain letter of a string
  println("3rd Index of Name " + name[3])
  println("Index of A " + name.indexOf('A'))
  println("  ")

  // Returns 1st three chars
  println("1st 3 Chars " + name[0..2])
  println("Every Other Character " + name[0,2,4,6,8])

  println("  ")
  println("Substring at 1 " + name.substring(1,4));
  println("  ")
  println("My Name is " + name)
  println("  ")
  println("My Name is".concat(name))
  println("  ")

  // Multiply strings
  println("My name is " + name*8)
  println("What i said is "*2)
  println("  ")

  // True and False
  println("Alex == Alex " + ('Alex'.equals('Alex')));
  println("Alex == Awesome " + ('Alex'.equals('Awesome')));

  // Length of string
  println("  ")
  println("Length of " + name + " = " + name.length())

  println("  ")
  def repeatStr = "What I said is " * 2
  println("  ")

  // Removed the word "what"
  println(repeatStr - "What")

  println("  ")
  println(repeatStr.split(' '))
  println(repeatStr.toList())

  println("  ")
  println(repeatStr.replaceAll('I', 'she'))
  println("  ")

  println("Uppercase " + name.toUpperCase())
  println("Lowercase " + name.toLowerCase())
  println("Normal " + name)
  println("  ")

  println("Ant <=> Banana" + ('Ant' <=> 'Bannana'))
  println("Banana <=> Ant" + ('Ant' <=> 'Bannana'))
  println("Ant <=> Ant" + ('Ant' <=> 'Bannana'))
  println("  ")

  def randString = "Random"

  // Show variable strings
  println("A $randString string")
  println("  ")

  printf("A %s string \n", randString)
  println("  ")
  printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random'])
  println("  ")

  // Inputs

  // Gets user name
  print("Whats your name: ")
  def fName = System.console().readLine()
  println("Hello " + fName)
  println("  ")

  // Get first addition problem
  print("Enter a number: ")
  def num1 = System.console().readLine().toDouble()

// Get first seccond problem
  print("Enter a number: ")
  def num2 = System.console().readLine().toDouble()

  // Add the two numbers
  println("  ")
  printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)])

  println("  ")
  def primes = [2,3,5,7,11,13]

  println("  ")
  // Print out the seccond & third number in the var primes
  println("2nd Prime: " + primes[1])
  println("3rd Prime: " + primes.get(2))
  println("  ")

  def employee = ['Alex', 40, 6.25, [1,2,3]]

  println("2nd Number " + employee[3][1])
  println("  ")

  println("Length " + primes.size())
  println("  ")

  // Adds numbers to the var primes
  primes.add(17)

  primes<<19
  primes.add(23)

  primes + [29, 31]

  primes - [31]

  println("Is Empty " + primes.isEmpty())
  println("  ")

  println("1st 3 " + primes[0..2])

  println("  ")
  println(primes)

  println("  ")
  println("Matches " + primes.intersect([2,3,7]))

  println("  ")
  println("Reverse " + primes.reverse())

  println("  ")
  println("Sort " + primes.sort())

  println("  ")
  println("Last " + primes.pop())

  // Maps

  // A map on Alex
  def alexMap = [
    'name' : 'Alex',
    'age' : 12,
    'address' : 'North America',
    'list' : [1,2,3]
  ]

  println("  ")
  // Prints out the name
  println("Name " + alexMap['name'])
  println("  ")
  // Prints out the age using get
  println("Age " + alexMap.get('age'))
  println("  ")
  // Prints out the list
  println("List Item " + alexMap['list'][1])
  println("  ")

  // Adds to the Maps
  alexMap.put('company', 'Napend')

  // Sees if the map has the list company
  println("Has company " + alexMap.containsKey('company'))
  // Prints out map size
  println("Size " + alexMap.size())
  }
}
