package com.esielkar.facade;

public class Facade {
    private Subsystem subsystem = new Subsystem();
    private Subsystem2 subsystem2 = new Subsystem2();
    private AdditonalFacade additonalFacade = new AdditonalFacade();

    public void subsystemsOperation() {
        subsystem.execute();
        subsystem2.execute();
        additonalFacade.subsystemsOperation();
    }
}
