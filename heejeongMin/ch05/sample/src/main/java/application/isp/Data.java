package application.isp;

public class Data {

  private String data;

  public String getData(){
    return this.data;
  }

  public Data convertAndSetData(Object o) {
    if(o.getClass() == String.class) {
      this.data = String.valueOf(o);
    } else if (o.getClass() == byte[].class) {
      data = new String(((byte[]) o));
    }
    return this;
  }

}
