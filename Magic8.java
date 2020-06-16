import java.lang.Math;

public class Magic8 {
  static int randomNumber = (int)(Math.random() * 8);

  public static void main (String[] args) {

    switch(randomNumber) {
     case 0:
       System.out.println("It is certain.\n");
       break;
     case 1:
        System.out.println("Yes - definitely.\n");
        break;
     case 2:
        System.out.println("As I see it, yes.");
        break;
    case 3:
        System.out.println("Signs point to yes.");
        break;
    case 4:
        System.out.println("Better not tell you now.");
        break;
    case 5:
        System.out.println("Concentrate and ask again.");
        break;
    case 6:
        System.out.println("My sources say no.");
        break;
    case 7:
        System.out.println("Very doubtful.");
        break;
    }
  }
}
