package teletext.core;

import teletext.plugin.IPlugin;

import java.util.List;

/**
 * Created by JS on 26/03/2016.
 */
public interface IPluginManager {
    IPlugin getPlugin(int pageNumber);
    List<IPlugin> getPluginList();
    void registerPlugin(IPlugin plugin);
    void unregisterPlugin(IPlugin plugin);
}
