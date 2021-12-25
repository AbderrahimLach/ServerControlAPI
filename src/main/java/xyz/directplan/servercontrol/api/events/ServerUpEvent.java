package xyz.directplan.servercontrol.api.events;

import lombok.Getter;
import xyz.directplan.servercontrol.api.server.Server;

/**
 * @author DirectPlan
 */
@Getter
public class ServerUpEvent extends ServerEvent {

    private final Server server;

    public ServerUpEvent(Server server) {
        this.server = server;
    }
}
