package Day42_Exception.Homework.H1;

/*
create an enum CarCondition (NEW, MEDIUM, OLD, WASTE)
---------------------------------------------------------
Create a class called Car:

create method 'buy' with enum parameter as conditions of car,
and throws checked/expected exception if its too old or waste

create method 'drive' with String parameter as weather,
and throws unchecked/runtime exception if weather is not equal to "normal"
----------------------------------------------------------
create demo application that helps you to buy a car & drive it:
 */
public enum CarCondition {
    NEW,
    MEDIUM,
    OLD,
    WASTE
}
