package thelaboflieven.scheduling;

/**
 * Created by Lieven on 5-6-2016.
 */
public class Duration
{
    private long milliseconds;

    public Duration(long milliseconds)
    {

        this.milliseconds = milliseconds;
    }

    public long getMilliseconds() {
        return milliseconds;
    }
}
