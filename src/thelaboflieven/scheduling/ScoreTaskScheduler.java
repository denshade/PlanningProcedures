package thelaboflieven.scheduling;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Lieven on 5-6-2016.
 */
public class ScoreTaskScheduler implements TaskScheduler
{

    @Override
    public List<Task> schedule(List<Task> tasks, List<AvailablePeriod> availablePeriods) {
        PriorityQueue<ScoredTask> prioTasks = new PriorityQueue<>();
        for (Task task: tasks)
        {
            prioTasks.add(new ScoredTask(task));
        }
        List<Task> sortedTasks = new ArrayList<>(tasks.size());
        while (prioTasks.size() != 0)
        {
            ScoredTask scoredTask = prioTasks.remove();
            sortedTasks.add(scoredTask.getTask());
        }
        return sortedTasks;
    }
}
