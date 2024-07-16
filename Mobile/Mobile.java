package Mobile;

public class Mobile {

  private String mobileId;

  public String getMobileId() {
    return mobileId;
  }

  public void setMobileId(String mobileId) {
    this.mobileId = mobileId;
  } 

  public final void call(String num) {
    System.out.println("Calling To "+num);
  }
  
  public void takePicture(){
    System.out.println("Taking photoes");
  }
}
