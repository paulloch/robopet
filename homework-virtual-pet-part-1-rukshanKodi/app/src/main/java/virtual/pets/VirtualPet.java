package virtual.pets;
import java.util.stream.Stream;
public class VirtualPet {
  public static void tick(String msg, int len, long timeIn, int petNeed) {

    char incomplete = '░'; // U+2591 Unicode Character
    char complete = '█'; // U+2588 Unicode Character
    StringBuilder builder = new StringBuilder();
    StringBuilder builder2 = new StringBuilder();

    Stream.generate(() -> incomplete).limit(len).forEach(builder::append);
    Stream.generate(() -> incomplete).limit(len).forEach(builder2::append);
    System.out.println(msg);
    int x = (int) (Math.random() * 10) % 8;
    int y = (int) (Math.random() * 10) % 6;
    for (int i = 0; i < len; i++) {
   

      int b = y++;
      int a = x++;
      if (a == len) {
        a = len-x;
        System.out.print(" game over. I'm angry ");
        //Input.validateNumber(" press 0 to exit");
      } else if (b == len) {
        b = len-y;
        System.out.print(" game over. I'm sad ");
        //nInput.validateNumber(" press 0 to exit");
      } else {
        // block of code to be executed if the condition1 is false and condition2 is
        // false
      }
      try {
             builder.replace(a, a + 1, String.valueOf(complete));
      builder2.replace(b, b + 1, String.valueOf(complete));
      String progressBar = "\r" + "Sleepy" + " " + a + " " + builder + " " + "Hungry" + " " + b + " " + builder2 + " ";
      System.out.print(progressBar);
      } catch (StringIndexOutOfBoundsException ignored) {

      }


      try {
        Thread.sleep(timeIn);
      } catch (InterruptedException ignored) {

      }
    }
  }
}
