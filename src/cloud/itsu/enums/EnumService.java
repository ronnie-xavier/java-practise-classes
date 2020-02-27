package cloud.itsu.enums;

public class EnumService {

    public void printEnumExamples() {

        System.out.println("  starting with simple enum");
        GymWorkoutSimpleEnum firstGymDay = GymWorkoutSimpleEnum.SQUATS;
        System.out.println("    first gym workout is " + firstGymDay);
        System.out.println("    first gym workout's name is " + firstGymDay.name());

        System.out.println("    now printing all the gym workouts using .values()");
        for(GymWorkoutSimpleEnum gymWorkout : GymWorkoutSimpleEnum.values())
            System.out.println( "      " + gymWorkout );

        System.out.println("  moving onto the more complex enum");

        WorkdaysComplexEnum bestWorkDay = WorkdaysComplexEnum.FRI;
        System.out.println("    best work day enum is (called without any method) " + bestWorkDay
                + " with a name of (using .name() method) " + bestWorkDay.name()
                + " with a display name of " + bestWorkDay.dayDisplayName());

        System.out.println("    finding an enum from String using .valueOf('MON') " + WorkdaysComplexEnum.valueOf("MON"));

        System.out.println("    looping through enum using .values()");
        for(WorkdaysComplexEnum workDay : WorkdaysComplexEnum.values())
            System.out.println( "      " + workDay );

        System.out.println("    MAP of WorkdaysComplexEnum using stream of values and collect with .name() and .dayDisplayName() "
                + WorkdaysComplexEnum.getAllWorkDays());
    }
}
