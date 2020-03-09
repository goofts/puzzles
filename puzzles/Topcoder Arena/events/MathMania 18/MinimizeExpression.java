import java.io.*;
import java.util.*;

public class MinimizeExpression {
	public double findMinimum(int n1, int m1, int n2, int m2, int n3, int m3, int a, int b, int c, long s) {
		return 0.0;
	}

// CUT begin
	public static void main(String[] args){
		System.err.println("MinimizeExpression (500 Points)");
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

            int n1 = Integer.parseInt(Reader.nextLine());
            int m1 = Integer.parseInt(Reader.nextLine());
            int n2 = Integer.parseInt(Reader.nextLine());
            int m2 = Integer.parseInt(Reader.nextLine());
            int n3 = Integer.parseInt(Reader.nextLine());
            int m3 = Integer.parseInt(Reader.nextLine());
            int a = Integer.parseInt(Reader.nextLine());
            int b = Integer.parseInt(Reader.nextLine());
            int c = Integer.parseInt(Reader.nextLine());
            long s = Long.parseLong(Reader.nextLine());
            Reader.nextLine();
            double __answer = Double.parseDouble(Reader.nextLine());

            cases++;
            if (caseSet.size() > 0 && !caseSet.contains(cases - 1))
                continue;
    		System.err.print(String.format("  Testcase #%d ... ", cases - 1));

            if (doTest(n1, m1, n2, m2, n3, m3, a, b, c, s, __answer))
                passed++;
	    }
	    if (caseSet.size() > 0) cases = caseSet.size();
        System.err.println(String.format("%nPassed : %d/%d cases", passed, cases));

        int T = (int)(System.currentTimeMillis() / 1000) - 1576917438;
        double PT = T / 60.0, TT = 75.0;
        System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 500 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}

	static boolean doTest(int n1, int m1, int n2, int m2, int n3, int m3, int a, int b, int c, long s, double __expected) {
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		MinimizeExpression instance = new MinimizeExpression();
		double __result = 0.0;
		try {
			__result = instance.findMinimum(n1, m1, n2, m2, n3, m3, a, b, c, s);
		}
		catch (Throwable e) { exception = e; }
		double elapsed = (System.currentTimeMillis() - startTime) / 1000.0;

		if (exception != null) {
			System.err.println("RUNTIME ERROR!");
			exception.printStackTrace();
			return false;
		}
		else if (doubleEquals(__expected, __result)) {
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

	static boolean doubleEquals(double a, double b) {
	    return !Double.isNaN(a) && !Double.isNaN(b) && Math.abs(b - a) <= 1e-9 * Math.max(1.0, Math.abs(a) );
	}

	static class Reader {
        private static final String dataFileName = "MinimizeExpression.sample";
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
