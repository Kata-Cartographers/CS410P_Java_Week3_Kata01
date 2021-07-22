package edu.pdx.cs410J.Kata_Cartographers;

import org.junit.jupiter.api.Test;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }


  @Test
  void sampleOne() {
      Kata myKata = new Kata();
      String[] args = { "20", "5", "/"};
      assertThat(Kata.calc(args), equalTo(4));
  }

  //@Test
  //  void

}

