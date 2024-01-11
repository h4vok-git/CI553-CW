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
  public boolean add(Product originalproduct) {

    for (Product newproduct : this) {
      if (originalproduct.getProductNum().equals(newproduct.getProductNum())) {
        newproduct.setQuantity(newproduct.getQuantity() + originalproduct.getQuantity());
        return (true);
      }
    }

    super.add(originalproduct);
    return (true);
  }


}


