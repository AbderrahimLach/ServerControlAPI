package xyz.directplan.servercontrol.api.events;

import lombok.Getter;
import xyz.directplan.servercontrol.api.server.Server;

/**
 * @author DirectPlan
 */
@Getter
public class ServerDownEvent extends ServerEvent {

    private final Server server;

    public ServerDownEvent(Server server) {
        this.server = server;
    }
}
