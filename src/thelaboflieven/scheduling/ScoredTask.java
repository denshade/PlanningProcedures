package thelaboflieven.scheduling;

/**
 * Created by Lieven on 5-6-2016.
 */
public class ScoredTask
{
    private Task task;

    public ScoredTask(final Task task)
    {
        this.task = task;
        long now = System.currentTimeMillis();
        long taskDeadline = task.getDeadline().getTime();
        long sumOfDurations = 0;
        for (Task dependentTask : task.getBlocksTasks())
        {
            sumOfDurations += dependentTask.getDuration().getMilliseconds();
        }
        score = now - taskDeadline - sumOfDurations;
    }
    private long score;

    public long getScore() {
        return score;
    }

    public Task getTask() {
        return task;
    }
}
