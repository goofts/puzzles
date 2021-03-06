import java.io.*;
import java.util.*;

public class Tribonacci {
	public int findValue(int a, int b, int c, int d, int e, int f, long n, long m, int[] mat) {
		return 0;
	}

// CUT begin
	public static void main(String[] args){
		System.err.println("Tribonacci (800 Points)");
		System.err.println();
		HashSet<Integer> cases = new HashSet<Integer>();
        for (int i = 0; i < args.length; ++i) cases.add(Integer.parseInt(args[i]));
        runTest(cases);
	}

	static void runTest(HashSet<Integer> caseSet) {
	    int cases = 0, passed = 0;
	    while (true) {
	    	String label = Reader.nextLine();
	    	if (label == null || !label.startsWith("--"))
	    		break;

            int a = Integer.parseInt(Reader.nextLine());
            int b = Integer.parseInt(Reader.nextLine());
            int c = Integer.parseInt(Reader.nextLine());
            int d = Integer.parseInt(Reader.nextLine());
            int e = Integer.parseInt(Reader.nextLine());
            int f = Integer.parseInt(Reader.nextLine());
            long n = Long.parseLong(Reader.nextLine());
            long m = Long.parseLong(Reader.nextLine());
            int[] mat = new int[Integer.parseInt(Reader.nextLine())];
            for (int i = 0; i < mat.length; ++i)
                mat[i] = Integer.parseInt(Reader.nextLine());
            Reader.nextLine();
            int __answer = Integer.parseInt(Reader.nextLine());

            cases++;
            if (caseSet.size() > 0 && !caseSet.contains(cases - 1))
                continue;
    		System.err.print(String.format("  Testcase #%d ... ", cases - 1));

            if (doTest(a, b, c, d, e, f, n, m, mat, __answer))
                passed++;
	    }
	    if (caseSet.size() > 0) cases = caseSet.size();
        System.err.println(String.format("%nPassed : %d/%d cases", passed, cases));

        int T = (int)(System.currentTimeMillis() / 1000) - 1576917453;
        double PT = T / 60.0, TT = 75.0;
        System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 800 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}

	static boolean doTest(int a, int b, int c, int d, int e, int f, long n, long m, int[] mat, int __expected) {
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		Tribonacci instance = new Tribonacci();
		int __result = 0;
		try {
			__result = instance.findValue(a, b, c, d, e, f, n, m, mat);
		}
		catch (Throwable e) { exception = e; }
		double elapsed = (System.currentTimeMillis() - startTime) / 1000.0;

		if (exception != null) {
			System.err.println("RUNTIME ERROR!");
			exception.printStackTrace();
			return false;
		}
		else if (__result == __expected) {
			System.err.println("PASSED! " + String.format("(%.2f seconds)", elapsed));
			return true;
		}
		else {
			System.err.println("FAILED! " + String.format("(%.2f seconds)", elapsed));
			System.err.println("           Expected: " + __expected);
			System.err.println("           Received: " + __result);
			return false;
		}
	}

	static class Reader {
        private static final String dataFileName = "Tribonacci.sample";
	    private static BufferedReader reader;

	    public static String nextLine() {
	        try {
                if (reader == null) {
                    reader = new BufferedReader(new InputStreamReader(new FileInputStream(dataFileName)));
                }
                return reader.readLine();
	        }
	        catch (IOException e) {
	            System.err.println("FATAL!! IOException");
	            e.printStackTrace();
	            System.exit(1);
	        }
	        return "";
	    }
	}
// CUT end
}
