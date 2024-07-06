package com.gildedrose;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TexttestFixtureIT extends InvokeMainTestCase {

  @Test
  void texttestFixtureOf30DaysPrintsExpectedOutput() throws IOException {
    MainMethodResult result = invokeMain(TexttestFixture.class, "30");
    assertThat(result.getTextWrittenToStandardError(), emptyString());

    InputStream stream = this.getClass().getResourceAsStream("30DaysStandardOutput.txt");
    assertThat(stream, notNullValue());
    try (
      BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
      StringWriter sw = new StringWriter();
      PrintWriter pw = new PrintWriter(sw, true)
    ) {

      for (String line = reader.readLine(); line != null; line = reader.readLine()) {
        pw.println(line);
      }
      assertThat(result.getTextWrittenToStandardOut(), equalTo(sw.toString()));
    }
  }
}
