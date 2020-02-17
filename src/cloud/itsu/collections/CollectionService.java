package cloud.itsu.collections;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public void printCollectionExamples() {

        System.out.println("  Starting with concepts: ");

        System.out.println("    Comparing Array.stream() and Stream.of()");
        streamVsArraysStream();

        System.out.println("    Moving onto the most important Collection ArrayList");

//        arrayListObjectPractise();

//        arrayListStringPractice();

//        stackAsListStringPractice();

//        stackStandaloneStringPractice();

//        dequeStringPractice();
    }

    private static void streamVsArraysStream() {
        RonniesItems[] arrayRonniesItems = new RonniesItems[3];
        arrayRonniesItems[0] = new RonniesItems("phone",'p' ,2);
        arrayRonniesItems[1] = new RonniesItems("laptop",'l' ,3);
        arrayRonniesItems[2] = new RonniesItems("mouse",'m' ,1);

        System.out.println("      Testing array.stream() is equivalent of stream.of() . This also uses stream.map() to invoke the object's toString() method");
        System.out.println("      The toList() method has been used here to output a list ");
        System.out.println("         " + Arrays.stream(arrayRonniesItems).map(ronniesItem -> ronniesItem.toString()).collect(Collectors.toList()));
        System.out.println("         " + Stream.of(arrayRonniesItems).map(ronniesItem -> ronniesItem.toString()).collect(Collectors.toList()));
    }

}
