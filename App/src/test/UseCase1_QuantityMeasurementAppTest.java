import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase1_QuantityMeasurementAppTest {

    UseCase1_QuantityMeasurementApp.Feet f1 =
            new UseCase1_QuantityMeasurementApp.Feet(1.0);

    UseCase1_QuantityMeasurementApp.Feet f2 =
            new UseCase1_QuantityMeasurementApp.Feet(1.0);

    UseCase1_QuantityMeasurementApp.Feet f3 =
            new UseCase1_QuantityMeasurementApp.Feet(2.0);

    @Test
    void testFeetEquality_SameValue() {
        assertTrue(f1.equals(f2));
    }

    @Test
    void testFeetEquality_DifferentValue() {
        assertFalse(f1.equals(f3));
    }

    @Test
    void testFeetEquality_NullComparison() {
        assertFalse(f1.equals(null));
    }

    @Test
    void testFeetEquality_DifferentClass() {
        assertFalse(f1.equals("1.0"));
    }

    @Test
    void testFeetEquality_SameReference() {
        assertTrue(f1.equals(f1));
    }
}