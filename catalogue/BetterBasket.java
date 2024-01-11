package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable {

  @Override
  public boolean add(Product p1) {

    for (Product p2 : this) {
      if (p1.getProductNum().equals(p2.getProductNum())) {
        p2.setQuantity(p2.getQuantity() + p1.getQuantity());
        return (true);
      }
    }

    super.add(p1);
    return (true);
  }


}


