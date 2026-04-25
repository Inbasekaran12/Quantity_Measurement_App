import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase2_QuantityMeasurementAppTest {

    // Feet objects
    UseCase2_QuantityMeasurementApp.Feet f1 =
            new UseCase2_QuantityMeasurementApp.Feet(1.0);

    UseCase2_QuantityMeasurementApp.Feet f2 =
            new UseCase2_QuantityMeasurementApp.Feet(1.0);

    UseCase2_QuantityMeasurementApp.Feet f3 =
            new UseCase2_QuantityMeasurementApp.Feet(2.0);

    // Inches objects
    UseCase2_QuantityMeasurementApp.Inches i1 =
            new UseCase2_QuantityMeasurementApp.Inches(1.0);

    UseCase2_QuantityMeasurementApp.Inches i2 =
            new UseCase2_QuantityMeasurementApp.Inches(1.0);

    UseCase2_QuantityMeasurementApp.Inches i3 =
            new UseCase2_QuantityMeasurementApp.Inches(2.0);

    // Feet Tests
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

    // Inches Tests
    @Test
    void testInchesEquality_SameValue() {
        assertTrue(i1.equals(i2));
    }

    @Test
    void testInchesEquality_DifferentValue() {
        assertFalse(i1.equals(i3));
    }

    @Test
    void testInchesEquality_NullComparison() {
        assertFalse(i1.equals(null));
    }

    @Test
    void testInchesEquality_DifferentClass() {
        assertFalse(i1.equals("1.0"));
    }

    @Test
    void testInchesEquality_SameReference() {
        assertTrue(i1.equals(i1));
    }
}
