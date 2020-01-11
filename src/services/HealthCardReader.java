package services; // Package for involved services

import data.HealthCardID;
import data.ProductID;

public interface HealthCardReader {
    HealthCardID getHealthCardID() throws HealthCardException;
}
