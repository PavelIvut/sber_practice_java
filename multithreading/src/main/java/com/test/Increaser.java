package com.test;

class Increaser extends Thread {
    private ResourceProcessor resourceProcessor;

    public Increaser(ResourceProcessor resourceProcessor) {
        this.resourceProcessor = resourceProcessor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            resourceProcessor.increase();
        }
    }
}
