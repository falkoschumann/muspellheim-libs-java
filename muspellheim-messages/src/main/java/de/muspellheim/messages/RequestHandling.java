/*
 * Muspellheim - Messages
 * Copyright (c) 2020 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.messages;

public interface RequestHandling<I extends Incoming, O extends Outcoming>
    extends MessageHandling<I> {
  O handle(I request);
}
