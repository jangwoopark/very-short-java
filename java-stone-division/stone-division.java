import static java.util.stream.LongStream.generate;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4_Stone_Division {

    static long N;
    static long[] S;
    static Map<Long, Boolean> M = new HashMap<>();
    
    static boolean count(boolean isFirst, long n) {
        long key = pack(isFirst, n);
        if (M.containsKey(key))
            return M.get(key);
        boolean res = false;
        for (int i = 0; i < S.length; i++) {
            if ((n % S[i]) != 0)
                continue;
            if (S[i] == n) {
                res = true;
                break;
            }
            boolean isWin = !count(!isFirst, n / S[i]);
            if (isWin && ((n / S[i]) & 1) == 1) {
                res = true;
                break;
            }
            if (!isWin && ((n / S[i]) & 1) == 0) {
                res = true;
                break;
            }
        }
        M.put(pack(isFirst, n), res);
        return res;
    }

    private static Long pack(boolean isFirst, long n) {
        return n | ((isFirst? 1: 0) << Long.BYTES);
    }

    static boolean isFirstWins() {
        M.clear();
        return count(true, N);
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = Task4_Stone_Division.class.getSimpleName() + ".in";
        Scanner scanner = System.getProperty("local") == null?
            new Scanner(System.in): new Scanner(Task4_Stone_Division.class.getResourceAsStream(inputFile));
        while (scanner.hasNext()) {
            N = scanner.nextLong();
            int s = scanner.nextInt();
            S = generate(scanner::nextLong).limit(s).toArray();
            System.out.println(isFirstWins()? "First": "Second");
        }
        scanner.close();
    }

}
