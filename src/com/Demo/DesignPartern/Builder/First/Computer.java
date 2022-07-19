package com.Demo.DesignPartern.Builder.First;

public class Computer {
    private int dungLuongRam;
    private int dungLuongRom;
    private boolean coGPU;
    private boolean coBlutooth;

    public Computer() {
    }
    public Computer(ComputerBuilder computerBuilder){
        super();
        this.dungLuongRam = computerBuilder.dungLuongRam;
        this.dungLuongRom = computerBuilder.dungLuongRom;
        this.coGPU = computerBuilder.coGPU;
        this.coBlutooth = computerBuilder.coBlutooth;
    }
    public int getDungLuongRam() {
        return dungLuongRam;
    }

    public void setDungLuongRam(int dungLuongRam) {
        this.dungLuongRam = dungLuongRam;
    }

    public int getDungLuongRom() {
        return dungLuongRom;
    }

    public void setDungLuongRom(int dungLuongRom) {
        this.dungLuongRom = dungLuongRom;
    }

    public boolean isCoGPU() {
        return coGPU;
    }

    public void setCoGPU(boolean coGPU) {
        this.coGPU = coGPU;
    }

    public boolean isCoBlutooth() {
        return coBlutooth;
    }

    public void setCoBlutooth(boolean coBlutooth) {
        this.coBlutooth = coBlutooth;
    }
    public static class ComputerBuilder{
        private int dungLuongRam;
        private int dungLuongRom;
        private boolean coGPU;
        private boolean coBlutooth;

        public ComputerBuilder(int dungLuongRam, int dungLuongRom) {
            this.dungLuongRam = dungLuongRam;
            this.dungLuongRom = dungLuongRom;
        }
        public ComputerBuilder coGPU(boolean value){
            this.coGPU = value;
            return this;
        }
        public ComputerBuilder coBlutooth(boolean value){
            this.coBlutooth = value;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
