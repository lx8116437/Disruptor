package com.lx.disruptor;

public class LongEvent {
    private Long value;

    public void set(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LongEvent{" +
                "value=" + value +
                '}';
    }
}
