package AbstractAssetManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void getTotalPercentDevalue() {

        double actual = Vehicle.getTotalPercentDevalue(4);

        assertEquals(0.85791262, actual, 0.001);
    }
}