package de.konradhoeffner.commons;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/** Helper methods for Java 8 streams */
public class Streams
{
	/** @return a stream for an iterator */
	static public <T> Stream<T> stream(Iterator<T> it)
	{
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED), false);
	}
}