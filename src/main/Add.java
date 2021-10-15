package main;

public class Add {
    public static int add(String input){
        if(input.equals("")){
            return 0;
        }

        else {

            String[] numList;
            numList = input.split(",|\n");
            return sum(numList);
        }
    }

    public static int convert(String input){
        return Integer.parseInt(input);
    }

    public static int sum(String[] numbers){
        int total = 0;
        for(String number : numbers){
            total += convert(number);
        }
        return total;
    }
}
