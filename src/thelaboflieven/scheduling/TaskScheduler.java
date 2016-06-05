package thelaboflieven.scheduling;

import java.util.List;

/**
 * Created by Lieven on 5-6-2016.
 */
public interface TaskScheduler {
    List<Task> schedule(List<Task> tasks, List<AvailablePeriod> availablePeriods);
}
