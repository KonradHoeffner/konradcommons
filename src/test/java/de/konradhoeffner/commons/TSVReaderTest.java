package de.konradhoeffner.commons;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.Test;

public class TSVReaderTest
{
	@Test public void testTSVReader() throws IOException
	{
		int count=0;
		try(TSVReader in = new TSVReader(this.getClass().getClassLoader().getResourceAsStream("codetocurrency.tsv")))
		{
		while(in.hasNextTokens())
		{
			count++;
			String[] tokens = in.nextTokens();
			assertTrue(tokens.length==2);
		}
		}
		assertTrue(count>5);
	}
}