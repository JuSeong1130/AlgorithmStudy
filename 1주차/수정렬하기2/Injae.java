import java.io.*;
import java.util.Arrays;

public class Injae {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int maxSize = Integer.parseInt(br.readLine());
        int[] ret = new int[maxSize];
        for (int i = 0; i < maxSize; i++)
            ret[i] = Integer.parseInt(br.readLine());
        Arrays.sort(ret);
        for (int i : ret)
            bw.write(Integer.toString(i) + "\n");
        bw.flush();
        bw.close();
    }
}