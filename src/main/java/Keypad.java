public class Keypad {
    public static int presses(String phrase) {
        for(int i = 0; i < phrase.length(); i++){
            System.out.println("Char: " + phrase.charAt(i) + " Num: " + charToInt(phrase.charAt(i)));
        }
       return phrase.chars().map(c -> charToInt((char)c)).sum();

    }

    private static int charToInt(char c){
        c = Character.toLowerCase(c);
        if(c == ' ') return 1;
        if(c == '0') return 2;
        if(c == '1') return 1;
        if(c == 's') return 4;
        if(c == '7') return 5;
        if(c == 'z') return 4;
        if(c == '9') return 5;
        if(Character.isDigit(c)) return 4;
        if(Character.getNumericValue(c)-10 < 0) return 0;

        if(Character.getNumericValue(c)-10 < 19){
            return (Character.getNumericValue(c)-10)%3 + 1;
        }else if(Character.getNumericValue(c)-10 < 26){
            return (Character.getNumericValue(c)-20)%3 + 1;
        }

        return 0;

    }
}

