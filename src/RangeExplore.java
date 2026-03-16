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

        // INTEGER TYPES:
        // Formatted Table Output

        System.out.println("INTEGER TYPES =======================================================");

        //  Creating Table Header , rows
        System.out.printf("%-6s | %-12s | %-21s | %-21s | %-21s%n",
                "Type", "Size (bytes)", "Min Value", "Max Value", "Overflow Result");
        System.out.println("--------------------------------------------------------------------------");

        // Rows
        System.out.printf("%-6s | %-12d | %-21d | %-21d | %-21d%n",
                "byte", Byte.BYTES, Byte.MIN_VALUE, maxByte, overflowByte);
        System.out.printf("%-6s | %-12d | %-21d | %-21d | %-21d%n",
                "short", Short.BYTES, Short.MIN_VALUE, maxShort, overflowShort);
        System.out.printf("%-6s | %-12d | %-21d | %-21d | %-21d%n",
                "int", Integer.BYTES, Integer.MIN_VALUE, maxInt, overflowInt);
        System.out.printf("%-6s | %-12d | %-21d | %-21d | %-21d%n",
                "long", Long.BYTES, Long.MIN_VALUE, maxLong, overflowLong);
        ;



        //Extremes and Special Values for floates

        System.out.println("FLOATING-POINT TYPES ======================================================");


        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("--- Extreme Bounds ---");
        System.out.printf("Float  | Smallest positive nonzero: %e | Largest: %e%n", minFloat, maxFloat);
        System.out.printf("Double | Smallest positive nonzero: %e | Largest: %e%n", minDouble, maxDouble);
        System.out.println();

        //dividing by zero
        System.out.println("--- Division by Zero Special Values ---");

        float positiveInfinity = 1.0f / 0.0f;
        double negativeInfinity = -1.0 / 0.0;
        double nanValue = 0.0 / 0.0;

        System.out.printf("1.0f / 0.0f = %s  (Positive Infinity)%n", positiveInfinity);
        System.out.printf("-1.0 / 0.0  = %s (Negative Infinity)%n", negativeInfinity);
        System.out.printf("0.0 / 0.0   = %s       (Not a Number - NaN)%n", nanValue);

//        System.out.println("===============================================================================================");
    }
}
