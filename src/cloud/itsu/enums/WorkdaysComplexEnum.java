package cloud.itsu.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum WorkdaysComplexEnum {
    MON("Monday"),
    TUE("Tuesday"),
    WED("Wednesday"),
    THU("Thursday"),
    FRI("Friday");

    private String dayDisplayName;

    //the getter - notice the naming which is exactly same as variable-  is required only if the attribute is private!
    public String dayDisplayName() {
        return dayDisplayName;
    }

    WorkdaysComplexEnum (String day) {
        this.dayDisplayName = day;
    }

    public static Map<String ,String> getAllWorkDays() {
        return Arrays.stream(WorkdaysComplexEnum.values()).collect(Collectors.toMap(WorkdaysComplexEnum::name, WorkdaysComplexEnum::dayDisplayName));

    }

}
