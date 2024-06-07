package backend.bikestore.models;

import jakarta.persistence.*;

@Entity
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mark;

    public Bike(Long id, String name, String mark, Integer price, String modelName, String engineCapacity, String mileage, Integer year, String imageURL) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.price = price;
        this.modelName = modelName;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
        this.year = year;
        this.imageURL = imageURL;
    }

    private Integer price;
    private String modelName;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Bike() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }



    private String engineCapacity;
    private String  mileage;
    private Integer year;
    @Column(length = 1000)
    private String imageURL;
}
