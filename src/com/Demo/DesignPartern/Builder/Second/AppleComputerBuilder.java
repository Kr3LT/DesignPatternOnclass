package com.Demo.DesignPartern.Builder.Second;

public class AppleComputerBuilder extends ComputerBuilder{
    @Override
    public void _1_buildMainboard() {
        System.out.println("step 1");
    }

    @Override
    public void _2_lapCpu() {
        System.out.println("step 2");
    }

    @Override
    public void _3_lapRam() {
        System.out.println("step 3");
    }

    @Override
    public void _4_lapFan() {
        System.out.println("step 4");
    }

    @Override
    public void _5_lapRom() {
        System.out.println("step 5");
    }

    @Override
    public void _6_lapGpu() {
        System.out.println("step 6");
    }

    @Override
    public void _7_installOS() {
        System.out.println("step 7");
    }

    @Override
    public ComputerBuilder build() {
        return null;
    }
}
