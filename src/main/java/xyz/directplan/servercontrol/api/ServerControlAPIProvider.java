package xyz.directplan.servercontrol.api;

/**
 * @author DirectPlan
 */
public abstract class ServerControlAPIProvider {

    private static ServerControlAPI api;

    public static void setApi(ServerControlAPI api) {
        ServerControlAPIProvider.api = api;
    }

    public static ServerControlAPI getApi() {
        if(api == null) {
            throw new IllegalStateException("ServerControl API did not load properly. (No API implementation is set)");
        }
        return api;
    }
}
