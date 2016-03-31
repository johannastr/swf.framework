package teletext.core;

import teletext.model.IContent;

/**
 * Created by JS on 26/03/2016.
 */
public interface IHistoryManager {
    void addEntry(IContent content);
    IContent getPreviousPage();
}
