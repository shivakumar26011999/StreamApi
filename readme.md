Functional Programming
   Programming which deals with creation of functions with lambda expressions.

Functional Interfaces
   Interfaces which contains one abstract method and zero or any number of default methods.
   Below were few functional interfaces.

     1) Function
        This interface takes two arguments value. First argument denotes type of input. Second argument denotes type of response. This is mostly used with map() method.
        Ex: Function<Integer, Integer> function = x -> x * x;
            Here input is integer and output is integer.

     2) Predicate
        This interface takes one argument value and returns true or false. This is mostly used with filter() method in StreamAPI. This is mostly used in filter method.
        Ex: Predicate<Integer> predicate = x -> x%10 == 0;
   
     3) Consumer
        This interface takes one argument and returns no output.
        Ex: Consumer consumer = x -> System.out.println(x);
 

     4) Supplier
        This interface doesn't take any argument and returns a value.
        Ex: Supplier<Double> supplier = () -> Math.random();
       
Stream API
   Three types of operations.
      1.Initial Operations.
      2.Intermediate Operations.
      3.Terminal Operations.

Intermediate Operations

    1. map()
     This method returns a stream of elements by applying function we pass as an argument. We use Function functional interface as an argument in this method.

    2. filter()
     This method filters collection based on condition we pass in Predicate functional interface. We use Predicate functional as an argument in this method.

    3. sorted()
     This method sorts collection. No argument is passed to sorted method. 



Terminal Operations
   
    1. collect()
     This method is used to collect response from intermediate operations.

    2. forEach()
     This method is to iterate over the collection. Consumer is passed as an argument.

    3. reduce()
     This method is to reduce collection of objects to single value.


                       
EOF