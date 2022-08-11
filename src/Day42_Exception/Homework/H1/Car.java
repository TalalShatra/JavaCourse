package Day42_Exception.Homework.H1;
/*
create method 'buy' with enum parameter as conditions of car,
and throws checked/expected exception if its too old or waste

create method 'drive' with String parameter as weather,
and throws unchecked/runtime exception if weather is not equal to "normal"
 */
public class Car {

        public void buy(CarCondition carCondition) throws Exception{
            if(carCondition.equals(CarCondition.OLD) || carCondition.equals(CarCondition.WASTE)){
             throw new Exception("you can't buy this car it's waste!");
        }}

        public void drive(String weather) {
            if (weather.equalsIgnoreCase("normal")) {
                System.out.println("you can drive the car");
            } else{
                throw new RuntimeException("you can't drive the car in this weather!");
            }
        };





       }
