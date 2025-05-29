import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        String [] arr = new String [] {"abc", "def", "ijk"};
        for (String s : arr) {
            System.out.println(s);
        }

        //disadvantages of array:
        //1, fixed length (ArrayList fixed this issue)
        //2. Same type of value (Java won't solve this issue)


        // Java allow Object[] to store any typeof objects.....
        // but Java follow Polymorphism, the allowed methods refers to the type of object reference.
        Object [] arr2 = new Object[] {"abc", 10, 9.99}; // can be infinite possibilities
        for (Object s : arr2) {
            if (s instanceof String) {
                String str = (String) s;
                System.out.println(str.charAt(0));
            }
        }


        //ArrayList: variable length
        //The underlying the data structure of ArrayList --> Array.
        ArrayList<String> names = new ArrayList<String>(); // RHS equals to LHS
        names.add("John");
        names.add("Peter");
        System.out.println(names.size()); //2

        names.remove("Peter");
        System.out.println(names.size()); // 1 // as removed Peter from above, become 1

        names.add("Jennie");
        //author of ArrayList override toString()
        System.out.println(names); // [John, Jennie]

        StringArrayList sal = new StringArrayList();
        sal.add("abc");
        sal.add("def");
        sal.add("Vincent");
        System.out.println(sal.size()); //3
        sal.remove("def");
        System.out.println(sal.size()); //2

        // ! contains() --> loop & equals()
        if (names.contains("Jennie")) {

        }

        if (!names.contains("Peter")) { // "!" is unequal

        }
        System.out.println(names.indexOf("John")); //0
        System.out.println(names.indexOf("Jennie")); //1
        System.out.println(names.indexOf("Peter")); //-1 (not found)

        // ! always isEmpty, contains, removes, add ** 

        if (!names.isEmpty()) {

        }

        //! because ArrayLsit is with ordering
        System.out.println(names.getFirst());//John, because ArrayList is with ordering
        System.out.println(names.get(1)); //jennie
        //System.out.println(names.get(2)); //java.lang.IndexOutOfBoundsException

        List<String> reversed = names.reversed(); // no need to knwo 
        System.out.println(reversed);// (jennie, john)

       reversed.set(1, "Steve");
       System.out.println(reversed); //[jennie, Steve]

        names.clear(); 
        System.out.println(names.isEmpty()); //true
        System.out.println(names.size()); //0
        names = null; // wt is the difference betweem names.clear() & names = null ?
        System.out.println(names.size()); // error

        // remove Dog (equals)
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("John"));
        dogs.add(new Dog("Peter"));
        dogs.remove(new Dog("Peter"));  
        System.out.println(dogs);

        //remove ("Peter"), remove the first "Peter"





        } 
    }

