package cloud.itsu.collections;

import java.util.Arrays;
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

        System.out.println("  Moving onto the most important Collection ArrayList");

//        arrayListObjectPractise();

//        arrayListStringPractice();

//        stackAsListStringPractice();

//        stackStandaloneStringPractice();

//        dequeStringPractice();
    }

    private static void streamVsArraysStreamNonPrimitive() {
        RonniesItems[] arrayRonniesItems = new RonniesItems[3];
        arrayRonniesItems[0] = new RonniesItems("phone",'p' ,2);
        arrayRonniesItems[1] = new RonniesItems("laptop",'l' ,3);
        arrayRonniesItems[2] = new RonniesItems("mouse",'m' ,1);

        System.out.println("         Testing array.stream() is equivalent of stream.of() . This also uses stream.map() to invoke the object's toString() method");
        System.out.println("         The toList() method has been used here to output a list ");
        System.out.println("         " + Arrays.stream(arrayRonniesItems).map(ronniesItem -> ronniesItem.toString()).collect(Collectors.toList()));
        System.out.println("         " + Stream.of(arrayRonniesItems).map(ronniesItem -> ronniesItem.toString()).collect(Collectors.toList()));
    }

    private static void streamVsArraysStreamPrimitive() {
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

    private static void orderStreamPrimitive() {
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

        System.out.print("        Sorting the array 7,2,3...   -   ");
        Arrays.sort(arrayOfPrimitiveInts);
        System.out.println(Arrays.toString(arrayOfPrimitiveInts));

    }

}
