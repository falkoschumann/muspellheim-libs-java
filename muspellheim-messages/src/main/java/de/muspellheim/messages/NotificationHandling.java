/*
 * Muspellheim - Messages
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.messages;

public interface NotificationHandling<N extends Notification> extends MessageHandling<N> {
  void handle(N notification);
}
