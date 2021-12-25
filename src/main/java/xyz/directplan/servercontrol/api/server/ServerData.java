package xyz.directplan.servercontrol.api.server;

/**
 * @author DirectPlan
 */
public interface ServerData {

    /**
     * @return The current online players of the server
     */
    int getOnlinePlayers();

    /**
     * @return The maximum players on the server.
     */
    int getMaximumPlayers();

    /**
     * @return Positive if the server is whitelisted.
     */
    boolean isWhitelisted();

    /**
     * The memory usage is counted in Megabytes.
     *
     * @return The current total memory usage consumed by the server software.
     */
    int getCurrentMemory();

    /**
     * @return The maximum memory assigned to the server.
     */
    int getMaximumMemory();

    /**
     * @return The current TPS (Ticks Per Second) of the server.
     */
    double getTPS();

    /**
     * @return The server machine's CPU usage
     */
    double getProcessorUsage();
}
