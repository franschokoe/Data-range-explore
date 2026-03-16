public class RangeExplore {
    public static void main(String[] args) {
        //declaring the variables

        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        byte overflowByte = (byte) (maxByte + 1);
        short overflowShort = (short) (maxShort + 1);
        int overflowInt = maxInt + 1;
        long overflowLong = maxLong + 1L;

        // ---------------------------------------------------------
        // 2. INTEGER TYPES: Formatted Table Output
        // ---------------------------------------------------------
        System.out.println("======================================== INTEGER TYPES ========================================");

        // Table Header
        System.out.printf("%-6s | %-12s | %-21s | %-21s | %-21s%n",
                "Type", "Size (bytes)", "Min Value", "Max Value", "Overflow Result");
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Table Rows
        System.out.printf("%-6s | %-12d | %-21d | %-21d | %-21d%n",
                "byte", Byte.BYTES, Byte.MIN_VALUE, maxByte, overflowByte);
        System.out.printf("%-6s | %-12d | %-21d | %-21d | %-21d%n",
                "short", Short.BYTES, Short.MIN_VALUE, maxShort, overflowShort);
        System.out.printf("%-6s | %-12d | %-21d | %-21d | %-21d%n",
                "int", Integer.BYTES, Integer.MIN_VALUE, maxInt, overflowInt);
        System.out.printf("%-6s | %-12d | %-21d | %-21d | %-21d%n",
                "long", Long.BYTES, Long.MIN_VALUE, maxLong, overflowLong);

        System.out.println("\n[Explanation of Integer Overflow]");
        System.out.println("When an integer type exceeds its maximum value by adding 1, it \"wraps around\"");
        System.out.println("to its minimum negative value. This occurs because Java uses a binary system ");
        System.out.println("called Two's Complement to represent signed integers.\n");


        // ---------------------------------------------------------
        // 3. FLOATING-POINT TYPES: Extremes and Special Values
        // ---------------------------------------------------------
        System.out.println("==================================== FLOATING-POINT TYPES =====================================");

        // Very small (closest to zero) and very large values
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("--- Extreme Bounds ---");
        System.out.printf("Float  | Smallest positive nonzero: %e | Largest: %e%n", minFloat, maxFloat);
        System.out.printf("Double | Smallest positive nonzero: %e | Largest: %e%n", minDouble, maxDouble);
        System.out.println();

        // Division by Zero Demonstrations
        System.out.println("--- Division by Zero Special Values ---");

        float positiveInfinity = 1.0f / 0.0f;
        double negativeInfinity = -1.0 / 0.0;
        double nanValue = 0.0 / 0.0;

        System.out.printf("1.0f / 0.0f = %s  (Positive Infinity)%n", positiveInfinity);
        System.out.printf("-1.0 / 0.0  = %s (Negative Infinity)%n", negativeInfinity);
        System.out.printf("0.0 / 0.0   = %s       (Not a Number - NaN)%n", nanValue);

        System.out.println("\n[Explanation of Floating-Point Results]");
        System.out.println("Unlike integer division (which throws an ArithmeticException for dividing by 0),");
        System.out.println("floating-point math follows the IEEE 754 standard. Dividing a non-zero number by");
        System.out.println("zero yields 'Infinity'. Dividing zero by zero has no mathematical definition,");
        System.out.println("resulting in 'NaN' (Not a Number).");
        System.out.println("===============================================================================================");
    }
}
