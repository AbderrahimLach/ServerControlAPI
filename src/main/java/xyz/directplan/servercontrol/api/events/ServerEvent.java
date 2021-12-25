package xyz.directplan.servercontrol.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author DirectPlan
 */
public class ServerEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
