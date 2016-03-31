package teletext.model;

/**
 * Created by JS on 26/03/2016.
 */
public interface ISubSite {
    IFormattedChar[][] getText();
    void setText(IFormattedChar[][] text);
}
