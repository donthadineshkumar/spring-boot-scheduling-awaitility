package com.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    /*
    fixedRate vs fixedDelay
    - fixedRate - specifies the interval between method invocations,
    measured from the start time of each invocation.

    - fixedDelay - specifies the interval between the method invocations
    measured from completion of the task.

    you can also use @Scheduled(cron="   ") - more sophisticated

    eg: 0/5 * * ? * * -every 5 secs
    make cron expression online: freeformatter.com

    cron expression format:

    "Seconds" "Minutes" "Hours" "Day of month" "month" "Day of week" "Year"
    "Year" not mandatory - only use 6 components in @Scheduled

    otherwise - IllegalStateException:
    Cron expression must consists of 6 fields

    Note: there are some allowed values & characters.

    use url: https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm#:~:text=A%20Cron%20Expressions&text=quartz.,allowed%20characters%20for%20that%20field.

    Examples:

    0 0 12 * * ? - Fire at 12:00 PM (noon) every day
    zero min - zero sec

    0 10,44 14 ? 3 WED - Fire at 2:10PM and 2:44PM
    every wednesday in the month of march.

     */
    //@Scheduled(fixedRate = 5000)
    //@Scheduled(fixedDelay = 3000)
    @Scheduled(cron = "0/5 * * ? * *")
    public void reportCurrentTime() throws InterruptedException {
        //Thread.sleep(6000l);
        logger.info(formatter.format(new Date()));
    }
}
