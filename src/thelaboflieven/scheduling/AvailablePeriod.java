package thelaboflieven.scheduling;

import java.util.Date;

/**
 * Created by Lieven on 5-6-2016.
 */
public class AvailablePeriod
{

    public AvailablePeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private Date startDate;
    private Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

}
