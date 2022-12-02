package com.developIt;

import javafx.application.Platform;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Time<T extends javafx.scene.control.Labeled> {
    private T node;

    public Time(T node) {
        this.node = node;
    }

    public void set(Timer timer) {
        var sb = new StringBuilder();
        var second = new AtomicInteger(0);
        var minute = new AtomicInteger(0);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    if (second.get() > 60) {
                        minute.set(minute.incrementAndGet());
                        second.set(0);
                    }
                    second.incrementAndGet();
                    sb.append(String.format("%02d", minute.get()));
                    sb.append(":");
                    sb.append(String.format("%02d", second.get()));
                    node.setText(sb.toString());
                    sb.setLength(0);
                });
            }
        }, 1000, 1000);
    }
}
