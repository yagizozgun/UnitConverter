package model.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UnitRequest {
    private int value;
    private String fromUnit;
    private String toUnit;

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

    public int getValue() {
        return value;
    }
}
