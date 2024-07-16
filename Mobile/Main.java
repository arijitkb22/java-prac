package Mobile;

import Mobile.Apple.Apple;
import Mobile.Samsung.Samsung;

public class Main {
  public static void main(String[] args) {
    Apple iphone16 = new Apple();
    iphone16.setMobileId("i1234");;
    System.out.println(iphone16.toString());


    Samsung galaxyZ7 = new Samsung();
    galaxyZ7.setMobileId("GZ1234");
    galaxyZ7.setProcessorType("Snapdragon");
    System.out.println(galaxyZ7.toString());
  }
}
