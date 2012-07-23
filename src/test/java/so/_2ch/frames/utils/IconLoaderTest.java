package so._2ch.frames.utils;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class IconLoaderTest {
	private IconLoader icon;

	@Test
	@Before
	public void testIconLoader() {
		icon = new IconLoader("2ch");
	}

	@Test
	public void testGetResizeIconInt() {
		assertNotNull("Пришел null вметсо иконки", icon.getResizeIcon(30));
	}

}
