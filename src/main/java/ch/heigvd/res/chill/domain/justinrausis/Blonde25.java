package ch.heigvd.res.chill.domain.justinrausis;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Blonde25 implements IProduct {

  public final static String NAME = "Blonde25";
  public final static BigDecimal PRICE = new BigDecimal(2.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
