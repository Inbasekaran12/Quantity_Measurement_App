import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase3_QuantityMeasurementAppTest {

    @Test
    void testEquality_FeetToFeet_SameValue() {
        UseCase3_QuantityMeasurementApp.Length l1 =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.FEET);

        UseCase3_QuantityMeasurementApp.Length l2 =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.FEET);

        assertTrue(l1.equals(l2));
    }

    @Test
    void testEquality_InchToInch_SameValue() {
        UseCase3_QuantityMeasurementApp.Length l1 =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.INCHES);

        UseCase3_QuantityMeasurementApp.Length l2 =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    @Test
    void testEquality_FeetToInch_EquivalentValue() {
        UseCase3_QuantityMeasurementApp.Length feet =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.FEET);

        UseCase3_QuantityMeasurementApp.Length inches =
                new UseCase3_QuantityMeasurementApp.Length(12.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.INCHES);

        assertTrue(feet.equals(inches));
    }

    @Test
    void testEquality_InchToFeet_EquivalentValue() {
        UseCase3_QuantityMeasurementApp.Length inches =
                new UseCase3_QuantityMeasurementApp.Length(12.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.INCHES);

        UseCase3_QuantityMeasurementApp.Length feet =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.FEET);

        assertTrue(inches.equals(feet));
    }

    @Test
    void testEquality_Feet_DifferentValue() {
        UseCase3_QuantityMeasurementApp.Length l1 =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.FEET);

        UseCase3_QuantityMeasurementApp.Length l2 =
                new UseCase3_QuantityMeasurementApp.Length(2.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.FEET);

        assertFalse(l1.equals(l2));
    }

    @Test
    void testEquality_Inch_DifferentValue() {
        UseCase3_QuantityMeasurementApp.Length l1 =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.INCHES);

        UseCase3_QuantityMeasurementApp.Length l2 =
                new UseCase3_QuantityMeasurementApp.Length(2.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.INCHES);

        assertFalse(l1.equals(l2));
    }

    @Test
    void testEquality_NullComparison() {
        UseCase3_QuantityMeasurementApp.Length l1 =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.FEET);

        assertFalse(l1.equals(null));
    }

    @Test
    void testEquality_SameReference() {
        UseCase3_QuantityMeasurementApp.Length l1 =
                new UseCase3_QuantityMeasurementApp.Length(1.0,
                        UseCase3_QuantityMeasurementApp.Length.LengthUnit.FEET);

        assertTrue(l1.equals(l1));
    }

    @Test
    void testEquality_InvalidUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new UseCase3_QuantityMeasurementApp.Length(1.0, null);
        });
    }
}
