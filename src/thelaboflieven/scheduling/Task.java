package thelaboflieven.scheduling;

import java.util.Date;
import java.util.List;

/**
 * Created by Lieven on 5-6-2016.
 */
public class Task
{
    public Task(String name, Date startDate, Duration duration, Date deadline, List<Task> blocksTasks) {
        this.name = name;
        this.startDate = startDate;
        this.duration = duration;
        this.deadline = deadline;
        this.blocksTasks = blocksTasks;
    }

    private String name;
    private Date startDate;
    private Duration duration;
    private Date deadline;
    private List<Task> blocksTasks;


    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public Date getDeadline() {
        return deadline;
    }

    public List<Task> getBlocksTasks() {
        return blocksTasks;
    }
}
