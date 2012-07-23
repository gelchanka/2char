package so._2ch.frames.utils;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Класс для быстрой загрузки иконок из ресурсов
 *  
 */
public class IconLoader extends ImageIcon {

	private static final long serialVersionUID = 7328447438439002846L;

	public IconLoader(String name) {
		setImage(new ImageIcon(getClass().getResource(
				"/so/_2ch/icons/" + name + ".png")).getImage());
	}

	public Icon getResizeIcon(int width, int height) {
		Image pic = getImage().getScaledInstance(width, height, 1);
		return new ImageIcon(pic);
	}

	public Icon getResizeIcon(int width) {

		return getResizeIcon(width, -1);
	}

}
