package ua.busstation.core.route;

import java.util.List;

public interface RouteManager {
	List<Route> getAllRouts();
	Route findByName(String name);
}
