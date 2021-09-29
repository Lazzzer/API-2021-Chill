package ch.heigvd.res.chill.domain.justinrausis;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Blonde25Test {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Blonde25 beer = new Blonde25();
    assertEquals(beer.getName(), Blonde25.NAME);
    assertEquals(beer.getPrice(), Blonde25.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.justinrausis.Blonde25";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Blonde25.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}