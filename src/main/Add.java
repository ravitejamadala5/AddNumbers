package main;

public class Add {
    public static int add(String input){
        if(input.equals("")){
            return 0;
        }

        else {

            String delimiter = ","; //default
            if(input.matches("//(.*)\n(.*)")){
                delimiter = Character.toString(input.charAt(2));
                input = input.substring(4);
            }

            String numList[] = delimiterSplit(input, delimiter + "|\n");
            return sum(numList);
        }
    }

    public static String[] delimiterSplit(String numbers, String delimiter){
        return numbers.split(delimiter);
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
