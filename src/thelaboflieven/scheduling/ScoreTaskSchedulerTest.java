package thelaboflieven.scheduling;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Lieven on 5-6-2016.
 */
public class ScoreTaskSchedulerTest {

    @Test
    public void testEmptySchedule() throws Exception {
        ScoreTaskScheduler scheduler = new ScoreTaskScheduler();
        assertEquals(0, scheduler.schedule(new ArrayList<>(), new ArrayList<>()).size());
    }
}