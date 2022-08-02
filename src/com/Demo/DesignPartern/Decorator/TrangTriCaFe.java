package com.Demo.DesignPartern.Decorator;

public abstract class TrangTriCaFe extends Cafe{
    protected Cafe cafe;
    public Cafe getCafe(){return this.cafe;}
    public abstract String getMoTa();
}
