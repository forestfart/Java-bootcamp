package com.kodilla.patterns.singleton;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDateTime;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {

        //Given
        Logger.getInstance().log(LocalDateTime.now().toString() + " The first log");
        Logger.getInstance().log(LocalDateTime.now().toString() + " The second log");
        Logger.getInstance().log(LocalDateTime.now().toString() + " The last log");

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertThat(lastLog, CoreMatchers.containsString("The last log"));
    }
}
