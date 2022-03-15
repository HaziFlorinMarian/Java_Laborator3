package compulsory;

public interface Storage {
    void setCapacity(int x);
    int getCapacity();

    default int defaultMethod(Units unit) {
        if (unit == Units.MEGABYTES) {
            return getCapacity() * 1024000;
        }
        else if (unit == Units.KILOBYTES) {
            return getCapacity() * 1024;
        }
        else {
            return getCapacity();
        }
    }
}
