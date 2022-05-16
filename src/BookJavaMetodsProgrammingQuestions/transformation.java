package BookJavaMetodsProgrammingQuestions;

public class transformation {
    public static void main(String[] args) {
        String arg = "8";
        try {
            int value1 = Integer.parseInt(arg);
            int value2 = Integer.valueOf(arg);
            int value3 = Integer.decode(arg);
            int value4 = new Integer(arg);
            System.out.println(value1);
            System.out.println(value2);
            System.out.println(value3);
            System.out.println(value4);
            System.out.println();
        } catch (NumberFormatException e){
            System.err.println("Неверный формат числа" + e);
        }
    }
}
