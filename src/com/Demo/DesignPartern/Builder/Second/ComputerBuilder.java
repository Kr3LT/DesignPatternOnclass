package com.Demo.DesignPartern.Builder.Second;

public abstract class ComputerBuilder {
    private int Ram;
    private int Rom;
    private String GPU;
    private boolean hasFan;
    private String Mainboard;
    private String CPU;

    public abstract void _1_buildMainboard();
    public abstract void _2_lapCpu();
    public abstract void _3_lapRam();
    public abstract void _4_lapFan();
    public abstract void _5_lapRom();
    public abstract void _6_lapGpu();
    public abstract void _7_installOS();
    public abstract ComputerBuilder build();

}
