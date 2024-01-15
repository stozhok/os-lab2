public class Common {

  public static long s2l(String s) {
    try {
      return Long.parseLong(s.trim());
    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage());
      return 0;
    }
  }

  public static int s2i(String s) {
    try {
      return Integer.parseInt(s.trim());
    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage());
      return 0;
    }
  }

  static public byte s2b ( String s ) 
  {
    int i = 0;
    byte b = 0;

    try {
      i = Integer.parseInt(s.trim());
    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }
    b = (byte) i;
    return b;
  }

  public static long randomLong( long MAX ) 
  {
    long i = -1;

    java.util.Random generator = new
    java.util.Random(System.currentTimeMillis());
    while (i > MAX || i < 0)
    {
      int intOne = generator.nextInt();
      int intTwo = generator.nextInt();
      i = (long) intOne + intTwo;
    }
    return i;
  }
}

