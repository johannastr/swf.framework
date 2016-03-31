package teletext.core;

import teletext.model.IContent;
import teletext.model.ISubSite;

/**
 * Created by JS on 26/03/2016.
 */
public interface IContentManager {
    IContent getContent(int page);
    ISubSite getNextSubSite();
}
