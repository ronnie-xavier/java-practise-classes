package cloud.itsu;

import cloud.itsu.enums.EnumService;
import cloud.itsu.strings.StringEquality;

public class SimpleApp {
    public static void main(String[] args) {
        System.out.println("Hello guys - starting the examples " );
        System.out.println("");

        System.out.println("Calling String Equality " );
        StringEquality.stringEqualityExamples();
        System.out.println("");


        System.out.println("Calling Enum Examples " );
        EnumService enumService = new EnumService();
        enumService.printEnumExamples();
    }
}
