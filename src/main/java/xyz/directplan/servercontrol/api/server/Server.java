package xyz.directplan.servercontrol.api.server;

/**
 * @author DirectPlan
 */
public interface Server {

    /**
     * Get the name of the server
     *
     * @return The name of the server.
     */
    String getName();

    /**
     * Gets the {@link ServerData server data} such as memory, players, whitelist, etc...
     *
     * @return The {@link ServerData server data}
     */
    ServerData getServerData();
}
