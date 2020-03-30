import java.util.HashMap;
import java.util.Map;

public class RomanCalculator {

    private static final Map<Integer, Integer> romanCodes = new HashMap<Integer, Integer>() {
        {
            put((int) 'I', 1);
            put((int) 'V', 5);
            put((int) 'X', 10);
            put((int) 'L', 50);
            put((int) 'C', 100);
            put((int) 'D', 500);
            put((int) 'M', 1000);
        }
    };

    int roman2Arabic(String roman) {
        int arabic = 0;
        int previosChar = 0;

        int[] romanInInt = roman.toUpperCase()
            .codePoints()
            .map(romanCodes::get)
            .toArray();

        for (int i = romanInInt.length - 1; i >= 0; i--) {
            if (previosChar > romanInInt[i]) {
                arabic -= romanInInt[i];
                previosChar = 0;    // fixme: delete this line after check input syntax
            } else {
                arabic += romanInInt[i];
                previosChar = romanInInt[i];
            }
        }
        return arabic;
    }


//    todo in future: convert to roman
//    String arabic2Roman(int arabic) {
//        return "";
//    }
//    todo in future: standard calculator
//    String add(String ingredientI, String ingredientII) {
//        return "";
//    }
}
