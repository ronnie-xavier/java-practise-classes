package cloud.itsu.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public void printCollectionExamples() {

        System.out.println("  Starting with concepts: ");

        System.out.println("    Comparing Array.stream() and Stream.of() for non primitive type");
        streamVsArraysStreamNonPrimitive();
        System.out.println("    Comparing Array.stream() and Stream.of() for non primitive type");
        streamVsArraysStreamPrimitive();
        System.out.println("    Seeing if a Stream maintains order");
        orderStreamPrimitive();
        orderStreamNonPrimitive();

        System.out.println("  Moving onto the Collection objects");
        System.out.println("    Starting with the most important ArrayList");
        arrayListPractise();
        System.out.println("    Now covering stacks");
        //stacksPractice();
        System.out.println("    Now covering deque");
        //dequePractice();

//        arrayListObjectPractise();

//        arrayListStringPractice();

//        stackAsListStringPractice();

//        stackStandaloneStringPractice();

//        dequeStringPractice();
    }

    private void streamVsArraysStreamNonPrimitive() {
        RonniesItem[] arrayRonniesItems = new RonniesItem[3];
        arrayRonniesItems[0] = new RonniesItem("phone",'p' ,2);
        arrayRonniesItems[1] = new RonniesItem("laptop",'l' ,3);
        arrayRonniesItems[2] = new RonniesItem("mouse",'m' ,1);

        System.out.println("         Testing array.stream() is equivalent of stream.of() . This also uses stream.map() to invoke the object's toString() method");
        System.out.println("         The toList() method has been used here to output a list ");
        System.out.println("         " + Arrays.stream(arrayRonniesItems).map(ronniesItem -> ronniesItem.toString()).collect(Collectors.toList()));
        System.out.println("         " + Stream.of(arrayRonniesItems).map(ronniesItem -> ronniesItem.toString()).collect(Collectors.toList()));
    }

    private void streamVsArraysStreamPrimitive() {
        int[] arrayOfPrimitiveInts = new int [7];
        arrayOfPrimitiveInts[0] = 7;
        arrayOfPrimitiveInts[1] = 2;
        arrayOfPrimitiveInts[2] = 3;
        arrayOfPrimitiveInts[3] = 8;
        arrayOfPrimitiveInts[4] = 1;
        arrayOfPrimitiveInts[5] = 4;
        arrayOfPrimitiveInts[6] = 2;

        System.out.println("         Testing difference of array.stream() is equivalent of stream.of() in case of primitives. This also uses stream.forEach() to invoke the println function");
        System.out.print("           array.stream()   ");
        Arrays.stream(arrayOfPrimitiveInts).forEach(System.out::print);
        System.out.print("         stream.of   ");
        Stream.of(arrayOfPrimitiveInts).forEach(System.out::print);
        System.out.print("         stream.of converted to instream using flatmaptoint   ");
        Stream.of(arrayOfPrimitiveInts).flatMapToInt(Arrays::stream).forEach(System.out::print);
        System.out.println("         ");
    }

    private void orderStreamPrimitive() {
        int[] arrayOfPrimitiveInts = new int [7];
        arrayOfPrimitiveInts[0] = 7;
        arrayOfPrimitiveInts[1] = 2;
        arrayOfPrimitiveInts[2] = 3;
        arrayOfPrimitiveInts[3] = 8;
        arrayOfPrimitiveInts[4] = 1;
        arrayOfPrimitiveInts[5] = 4;
        arrayOfPrimitiveInts[6] = 2;

        System.out.print("        Does a stream maintain order? Yes if the source is ordered 7,2,3...  -- ");
        int[] tripleArrayOfPrimitiveInts = Arrays.stream(arrayOfPrimitiveInts).unordered().parallel().map(i -> i*3).toArray();
        System.out.println(Arrays.toString(tripleArrayOfPrimitiveInts));

        System.out.print("        Sorting the primitive array 7,2,3...   -   ");
        Arrays.sort(arrayOfPrimitiveInts);
        System.out.println(Arrays.toString(arrayOfPrimitiveInts));
    }

    private void orderStreamNonPrimitive() {
        RonniesItem[] arrayOfNonPrimitives = getSampleArrayofRonniesItems();

        System.out.print("        Sorting the non primitive array 7,2,3...   -   ");
        Arrays.sort(arrayOfNonPrimitives);
        System.out.println(Arrays.toString(arrayOfNonPrimitives));

        System.out.print("        The type of arrayofNonPrimitives is -   ");
        System.out.println(arrayOfNonPrimitives.getClass());
    }

    private RonniesItem[] getSampleArrayofRonniesItems() {
        RonniesItem[] ronniesItems = new RonniesItem[7];
        ronniesItems[0] = new RonniesItem("Ron777777", '7', 7);
        ronniesItems[1] = new RonniesItem("Ron22", '2', 2);
        ronniesItems[2] = new RonniesItem("Ron33", '3', 3);
        ronniesItems[3] = new RonniesItem("Ron8888", '8', 8);
        ronniesItems[4] = new RonniesItem("Ron111", '1', 1);
        ronniesItems[5] = new RonniesItem("Ron4", '4', 4);
        ronniesItems[6] = new RonniesItem("Ron2", '2', 2);
        return ronniesItems;
    }

    private void arrayListPractise() {
        RonniesItem[] arrayOfNonPrimitives = getSampleArrayofRonniesItems();
        System.out.println("        The base array is - " + Arrays.toString(arrayOfNonPrimitives));

        ArrayList<RonniesItem> ronniesItemArrayList = new ArrayList<>();
        ronniesItemArrayList.add(arrayOfNonPrimitives[0]);
        ronniesItemArrayList.add(arrayOfNonPrimitives[2]);
        ronniesItemArrayList.add(arrayOfNonPrimitives[3]);
        ronniesItemArrayList.add(arrayOfNonPrimitives[4]);

        System.out.println("        The arraylist is - " + ronniesItemArrayList.toString());
        System.out.println("            Whether arraylist contains its 3 item  - " + ronniesItemArrayList.contains(arrayOfNonPrimitives[3]));
        System.out.println("            The index of its 3rd item is (obviously)  " + ronniesItemArrayList.lastIndexOf(arrayOfNonPrimitives[3]));

        ronniesItemArrayList.get(3).setAge(1111);
        System.out.println("            Modifying an arraylist element modfies the original object (obviously ! duh )  " + arrayOfNonPrimitives[4]);

        Collections.sort(ronniesItemArrayList);
        System.out.println("            Sorted array list (based on age as its Comparable field) is                                         " + ronniesItemArrayList.toString());

        Collections.sort(ronniesItemArrayList, Collections.reverseOrder());
        System.out.println("            Sorted array list using comparator reverseOrder() which reverses the age compare() method           " + ronniesItemArrayList.toString());

        Collections.sort(ronniesItemArrayList, RonniesItem.descriptionLengthComparator);
        System.out.println("            Sorted array list using custom anonymous comparator on length of description length is              " + ronniesItemArrayList.toString());

        Collections.sort(ronniesItemArrayList, new RonniesItem.descriptionLengthComparatorReversed());
        System.out.println("            Sorted array list using custom named class comparator on length of description reversed is          " + ronniesItemArrayList.toString());

        ronniesItemArrayList.stream().map((item) -> item.getAge()+5);

        System.out.println("        Converting the array to arraylist by passing asList() outputted List to ArrayList constructor " );
        ArrayList<RonniesItem> ronniesItemArrayListTemp = new ArrayList<>(Arrays.asList(arrayOfNonPrimitives));
        System.out.println("            The arraylist is - " + ronniesItemArrayListTemp.toString());
        System.out.println("            The arraylist type is - " + ronniesItemArrayListTemp.getClass());
        arrayOfNonPrimitives[0] = new RonniesItem("Ron00", '0', 0);
        System.out.println("            Modifying the underlying array will modify the derived arraylist - " + ronniesItemArrayListTemp.get(0).toString());


        System.out.println("        A List initialised as an ArrayList has type / getclass of ArrayList " );
        List<RonniesItem> tempList = new ArrayList<>();
        System.out.println("            The type, as it is initialised as ArrayList, is - " + tempList.getClass());

        // use looping
        //convert from array to Hashmap and hashset
        // see if generics class can be created
        //use lambda functions

    }


}
