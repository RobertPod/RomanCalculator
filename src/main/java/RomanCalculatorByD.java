import java.util.HashMap;

public class RomanCalculatorByD {

    private static HashMap<String, Integer> map = new HashMap<>();

    int roman2Arabic(String roman) {
        setMap(map);
        int arabic = 0;
        int previous = 0;
        char[] romanChars = roman.toUpperCase().toCharArray();

        for (int i = romanChars.length - 1; i >= 0; i--) {
            int actual = map.get(String.valueOf(romanChars[i]));
            if (previous > actual) {
                arabic -= actual;
            } else {
                arabic += actual;
            }
            previous = actual;
        }
        return arabic;
    }

    private void setMap(HashMap<String, Integer> map) {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }
}