package cloud.itsu;

import cloud.itsu.collections.CollectionService;
import cloud.itsu.enums.EnumService;
import cloud.itsu.strings.StringEquality;


public class SimpleJavaPractiseApp {
    public static void main(String[] args) {
        System.out.println("Hello guys - starting the examples " );
        System.out.println("");

        System.out.println("Calling String Equality " );
        StringEquality.stringEqualityExamples();
        System.out.println("");

        System.out.println("Calling Enum Examples " );
        EnumService enumService = new EnumService();
        enumService.printEnumExamples();
        System.out.println("");

        System.out.println("Calling Collections Examples " );
        CollectionService collectionService  = new CollectionService();
        collectionService.printCollectionExamples() ;
        System.out.println("");

    }
}
