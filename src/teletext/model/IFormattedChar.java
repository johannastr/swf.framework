package teletext.model;

import java.awt.*;

/**
 * Created by JS on 26/03/2016.
 */
public interface IFormattedChar {
    void setCharacter(char character);
    char getCharacter();
    void setForegroundColor(Color fgColor);
    Color getForegroundColor();
    void setBackgroundColor(Color bgColor);
    Color getBackgroundColor();
}
