import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Injae {
    static final int baseTime = 2;
    static final int baseAddTime = 1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();

        int resultNum = 0;
        for(char c : inputStr.toCharArray())
            resultNum += charToNum(c);

        System.out.println(resultNum);
    }

    public static int charToNum(char c) {
        switch(c) {
            case 'A': case 'B': case 'C':
                return baseTime + baseAddTime;
            case 'D': case 'E': case 'F':
                return baseTime + (baseAddTime * 2);
            case 'G': case 'H': case 'I':
                return baseTime + (baseAddTime * 3);
            case 'J': case 'K': case 'L':
                return baseTime + (baseAddTime * 4);
            case 'M': case 'N': case 'O':
                return baseTime + (baseAddTime * 5);
            case 'P': case 'Q': case 'R': case 'S':
                return baseTime + (baseAddTime * 6);
            case 'T': case 'U': case 'V':
                return baseTime + (baseAddTime * 7);
            case 'W': case 'X': case 'Y': case 'Z':
                return baseTime + (baseAddTime * 8);
            default :
                return baseTime;
        }
    }
}