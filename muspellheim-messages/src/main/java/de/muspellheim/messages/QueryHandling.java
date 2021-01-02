/*
 * Muspellheim - Messages
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.messages;

public interface QueryHandling<Q extends Query, R extends QueryResult>
    extends RequestHandling<Q, R> {}
