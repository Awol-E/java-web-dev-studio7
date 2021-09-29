package org.launchcode.studio7;

public class FloppyDisk extends ComputerDisc implements OpticalDisc {
    public FloppyDisk(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storeData(String data) {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
