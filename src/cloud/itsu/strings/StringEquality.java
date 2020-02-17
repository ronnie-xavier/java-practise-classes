package cloud.itsu.strings;

public class StringEquality {

    String tiClassVariable = new String("Ti");

    public static void stringEqualityExamples () {

        String tiMethodVariable = "Ti";
        String tiMethodVariableCopy = tiMethodVariable;

        StringEquality m = new StringEquality();

        System.out.println("  Hash code for 'ti' class variable is " + m.tiClassVariable.hashCode());
        System.out.println("  Hash code for 'ti' method variable is " + tiMethodVariable.hashCode());
        System.out.println("  Result of a direct comparison using '==' between class and method variables with same value is "
                + (tiMethodVariable==m.tiClassVariable) );
        System.out.println("  Result of using 'equals method' comparison between class and method variables with same value is "
                + tiMethodVariable.equals(m.tiClassVariable));
        System.out.println("  Result of a direct comparison using '==' between copies is " + (tiMethodVariable==tiMethodVariableCopy) );

        System.out.println("  Result of \"Ti\" == \"T\" + \"i\" is "
                + ("Ti" == "T" + "i"));

    }

}
