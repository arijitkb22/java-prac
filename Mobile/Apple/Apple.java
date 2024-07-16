package Mobile.Apple;

import Mobile.Mobile;

public class Apple extends Mobile {

  private final String PROCESSR_TYPE = "Bionic";
  private String display;

  public String getDisplay() {
    return display;
  }

  @Override
  public String toString() {
    return "Apple [PROCESSR_TYPE=" + PROCESSR_TYPE + ", display=" + display 
        + ", MobileId=" + getMobileId() + "]";
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public void magnaticCharging(){
    System.out.println("Now you can change your phone with out insertig charger :)");
  }

  public String getPROCESSR_TYPE() {
    return PROCESSR_TYPE;
  }
  
}
