package xyz.directplan.servercontrol.api;

import xyz.directplan.servercontrol.api.server.Server;
import xyz.directplan.servercontrol.api.server.ServerData;

import java.util.Collection;

/**
 * @author DirectPlan
 */
public interface ServerControlAPI {

    /**
     * Gets all current online and in sync {@link Server servers}.
     *
     * @return The {@link Server servers}.
     */
    Collection<Server> getServers();

    /**
     * Gets the server data from the specified {@link String id}. If the server is not found,
     * then it'll return as null
     *
     * @param id The id of the {@link Server server}
     * @return The {@link ServerData server data}
     */
    ServerData getServerData(String id);

    /**
     * Gets the server from the specified {@link String id}. If the server is not found,
     * then it'll return as null.
     *
     * @param id The id of the {@link Server server}
     * @return The {@link Server server}.
     */
    Server getServer(String id);

    /**
     * Executes the {@link String command} on the server from its {@link String id}
     *
     * @param id The id of the {@link Server server}
     * @param command The command to be performed without slash
     */
    void executeCommand(String id, String command);

    /**
     * Marks the server as whitelisted or not.
     *
     * @param id The id of the {@link Server server}
     * @param whitelist Whether to whitelist the {@link Server server} or not
     */
    void setWhitelisted(String id, boolean whitelist);

    /**
     * Sets the {@link Server server} is maximum players to {@link Integer amount}
     *
     * @param id The id of the {@link Server server}
     * @param amount The amount of maximum players to set.
     */
    void setMaximumPlayers(String id, int amount);

    /**
     * Method to stop the server
     *
     * @param id The id of the server {@link Server server} to stop
     */
    void stopServer(String id);
}
