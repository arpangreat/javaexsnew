public class newn {
  public static void main(String[] args) {
    if (args.length > 0 && args[0] != null) {
      int num = Integer.parseInt(args[0]);
      System.out.println(num + "\n");
    } else {
      System.out.println(0);
    }

  }
}
