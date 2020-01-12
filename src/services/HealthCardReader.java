package services; // Package for involved services

import data.HealthCardID;
import services.exceptions.HealthCardException;

public interface HealthCardReader {
    HealthCardID getHealthCardID() throws HealthCardException;
}
