/*
 * Muspellheim - Messages
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.messages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.var;
import org.junit.jupiter.api.Test;

public class HttpCommandStatusTests {
  @Test
  void success() {
    var httpStatus = new HttpCommandStatus(new Success());

    var expected = new HttpCommandStatus();
    expected.success = true;
    expected.errorMessage = null;
    assertEquals(expected, httpStatus);
    assertEquals(new Success(), httpStatus.commandStatus());
  }

  @Test
  void failure() {
    var httpStatus = new HttpCommandStatus(new Failure("Lorem ipsum"));

    var expected = new HttpCommandStatus();
    expected.success = false;
    expected.errorMessage = "Lorem ipsum";
    assertEquals(expected, httpStatus);
    assertEquals(new Failure("Lorem ipsum"), httpStatus.commandStatus());
  }
}
