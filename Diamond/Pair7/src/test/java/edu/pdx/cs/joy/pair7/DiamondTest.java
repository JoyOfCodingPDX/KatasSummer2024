package edu.pdx.cs.joy.pair7;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

public class DiamondTest extends InvokeMainTestCase
{

  private InvokeMainTestCase.MainMethodResult invokeMain(String... args) {
    return invokeMain(Diamond.class, args );
  }

  @Test
  void canInstantiateKataClass() {
    Diamond d = new Diamond();
    assertThat(d, instanceOf(Diamond.class));
  }

  @Test
  void outputsToStdOut() {
    MainMethodResult result = invokeMain();
    assertThat(result.getTextWrittenToStandardOut(), is("test"));
  }

  @Test
  void testSingleA() {
    MainMethodResult result = invokeMain("A");
    assertThat(result.getTextWrittenToStandardOut(), is("A"));
  }

  @Test
  void testSingleB() {
    MainMethodResult result = invokeMain("B");
    assertThat(result.getTextWrittenToStandardOut(), is(" A \nB B\n A "));
  }

}
