package teletext.plugin;

import teletext.model.IContent;
import teletext.model.IPageRange;

/**
 * Created by JS on 26/03/2016.
 */
public interface IPlugin {
    IPageRange getPageNumber();
    void setPageNumber(IPageRange range);
    IContent getContent(int page);
}
