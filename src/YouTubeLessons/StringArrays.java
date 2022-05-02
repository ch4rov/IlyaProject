package YouTubeLessons;

public class StringArrays {
    public static void main (String [] args){
        int [] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        String[] strings = new String[3];
        strings[0] = "String one";
        strings[1] = "String two";
        strings[2] = "String three";
        System.out.println(strings[0] + " & " + strings[1] + " & " + strings[2]);
        System.out.println();
        for(String string:strings){
            System.out.println(string);
        }
        System.out.println();
        int numbersPlus[] = {2,4,6};
        int sum = 0;
        for (int example:numbersPlus){
            sum = sum*example;
            // 0 * 2 = 0; 0 * 4 = 0; 0 * 6 = 0; == 0;
        }
        System.out.println(sum); // out: 0
        System.out.println();
        int sum1 = 0;
        for (int example:numbersPlus){
            sum1 = sum1 + example;
            // 0 + 2 = 2; 2 + 4 = 6; 6 + 6 = 12
        }
        System.out.println(sum1); // out: 12
    }
}
