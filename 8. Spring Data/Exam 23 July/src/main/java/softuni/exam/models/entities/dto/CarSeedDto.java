package softuni.exam.models.entities.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;

import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class CarSeedDto {

    public CarSeedDto() {
    }

    @Expose
    @Size(min = 2, max = 20)
    private String make;

    @Expose
    @Size(min = 2, max = 20)
    private String model;

    @Expose
    @Positive
    private Integer kilometers;

    @Expose
    private String registeredOn;


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getKilometers() {
        return kilometers;
    }

    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }

    public String getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(String registeredOn) {
        this.registeredOn = registeredOn;
    }
}
