import java.io.*;
import java.util.Arrays;

public class Injae {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for (int i : arr)
            bw.write(i + "\n");

        bw.flush();
        bw.close();
    }
}
