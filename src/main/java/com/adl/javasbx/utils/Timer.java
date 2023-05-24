package com.adl.javasbx.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

@Slf4j
public class Timer {

    private final String name;
    private Instant start;

    public Timer()
    {
        this.name = UUID.randomUUID().toString();
    }

    public Timer(String name)
    {
        this.name = name;
    }

    public void start() {
        start = Instant.now();

        log.info("Timer '{}' started.", name);
    }

    public void stop() {

        if(start == null)
        {
            log.info("Timer '{}' cannot be stopped before being started first!", name);
            return;
        }

        Instant finish = Instant.now();
        long timeElapsedInSeconds = Duration.between(start, finish).toSeconds();

        long hh = timeElapsedInSeconds / 3600;
        long mm = (timeElapsedInSeconds % 3600) / 60;
        long ss = timeElapsedInSeconds % 60;

        String hours = hh == 0 ? "" :String.format("%02d hours", hh);
        String minutes = mm == 0 ? "" :String.format("%02d minutes", mm);
        String seconds = ss == 0 ? "" :String.format("%02d seconds", ss);

        String timeInHHMMSS = String.join(hours, minutes, seconds);

        log.info("Timer '{}' finished in '{}'", name, timeInHHMMSS);
    }
}

