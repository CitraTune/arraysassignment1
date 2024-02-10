public class Main {
    public static void main(String[] args) {
        String[] weekdays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("All the days of the week:");
        for(int i = 0; i < weekdays.length; i++){
            System.out.println(weekdays[i]);
        }
        System.out.println(" \nBusiness days:");
        weekdays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for(int i = 0; i < weekdays.length; i++){
            System.out.println(weekdays[i]);
        }
        System.out.println(" \nBusiness days shuffled");

        String[] weekdaysTemp = weekdays;
        //problem lies in assigning new values to it every single time. need to prevent repeats. how to..? maybe make the array already full of numbers and take away them after setting one to it
        for(int i = 0; i < weekdaysTemp.length; i++){
            //randomNum is a number that is within weekdaysTemp's length
            int randomNum = (int)(Math.random()* weekdaysTemp.length);
            //randomDay is picked from weekdaysTemp
            String randomDay = weekdaysTemp[randomNum];
            //if randomDay exists skip this step
            while (randomDay == null){
                //if randomDay is null and doesnt exist then follow this step
                //randomNum is repicked from the same pool
                randomNum = (int)(Math.random()* weekdaysTemp.length);
                //Therefore repicking randomday
                randomDay = weekdaysTemp[randomNum];
                //Reports what number is null
                System.out.println("got null at "+ randomNum);
                //loops and compares randomDay again
            }
            //removes location of randomDay from the temporary weekdays cache if we make it to this point, whiuch should mean that weekdaysTemp at this number does exist.
            weekdaysTemp[randomNum] = null;
            System.out.println("Set "+ randomDay+ + randomNum+ " in weekdaysTemp to null");
            //set the weekday of the current iteration to the randomly selected day
            weekdays[i] = randomDay;
        }

        for (String weekday : weekdays) {
            System.out.println(weekday);
        }

    }
}