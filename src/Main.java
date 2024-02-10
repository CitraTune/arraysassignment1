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
        for(int i = 0; i < weekdays.length; i++){
            //randomNum is a number
            int randomNum = (int)(Math.random()* weekdaysTemp.length);
            String randomDay = weekdaysTemp[randomNum];
            while (randomDay == null){
                randomNum = (int)(Math.random()* weekdaysTemp.length);
                randomDay = weekdaysTemp[randomNum];
                System.out.println("got null");
            }
            //remove randomDay from the temporary weekdays cache
            weekdaysTemp[randomNum] = null;
            //set the weekday of the current iteration to the randomly selected day
            weekdays[i] = randomDay;
        }

        for (String weekday : weekdays) {
            System.out.println(weekday);
        }

    }
}