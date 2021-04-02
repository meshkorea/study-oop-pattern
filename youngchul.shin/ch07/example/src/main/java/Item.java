import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Item {
  long price;

  LocalDateTime createdAt;


  public Item(long price) {
    this.price = price;
    this.createdAt = LocalDateTime.now();
  }
  public long getPrice() {
    return price;
  }

  public boolean isFresh() {
    return ChronoUnit.SECONDS.between(createdAt, LocalDateTime.now()) < 1000 * 60 * 9;
  }
}
