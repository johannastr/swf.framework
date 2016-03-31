package teletext.model;

import java.util.List;

/**
 * Created by JS on 26/03/2016.
 */
public interface IContent {
    List<ISubSite> getSubSites();
    ISubSite getSubSite(int index);
    void addSubSite(ISubSite subSite);
}
