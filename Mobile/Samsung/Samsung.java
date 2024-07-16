package Mobile.Samsung;

import Mobile.Mobile;

public class Samsung extends Mobile {
  private String processorType;

  public String getProcessorType() {
    return processorType;
  }

  public void setProcessorType(String processorType) {
    this.processorType = processorType;
  }

  @Override
  public String toString() {
    return "Samsung [processorType=" + processorType + ", getMobileId=" + getMobileId() + "]";
  }

  public void foldable(){
    System.out.println("now you can fold your phone");
  }
}
