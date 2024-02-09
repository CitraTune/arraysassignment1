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
        int[] randomizer = new int[weekdays.length];
        int[] count = {1,2,3,4,5};
        //problem lies in assigning new values to it every single time. need to prevent repeats. how to..? maybe make the array already full of numbers and take away them after setting one to it
        for(int i = 0; i < randomizer.length; i++){
            int swap = (int)(Math.random() * randomizer.length);
            //goal: prevent repeats in count
            randomizer[i] = (int)(Math.random() * randomizer.length);
        }
        for(int i = 0; i < randomizer.length; i++){
            System.out.println(randomizer[i]);
        }


//        for(int i = 0; i < weekdays.length; i++){
//            int swap = (int)(Math.random() * weekdays.length);
//            while(i == swap) {
//                swap = (int)(Math.random() * weekdays.length);
//            }
//            System.out.println("Swapped " + weekdays[swap] + " and " + weekdays[i]);
//            weekdays[i] = weekdays[swap];
//            weekdays[swap] = weekdays[i];
//
//        }
        for(int i = 0; i < weekdays.length; i++){
            System.out.println(weekdays[i]);
        }

    }
}