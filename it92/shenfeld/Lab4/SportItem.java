package it92.shenfeld.Lab4;

public class SportItem {
	/**
     * Field - name
     */
    private String name;
    /**
     * Field - material
     */
    private String material;
    /**
     * Field - manufacturer
     */
    private String manufacturer;
    /**
     * Field - category
     */
    private String category;
    /**
     * Field - price
     */
    private float price;

    /**
     * Constructor - creating a new object with certain parameters
     *
     * @param n name
     * @param m material
     * @param ma manufacturer
     * @param c category
     * @param p price
     */
    SportItem(String name, String material, String manufacturer, String category, float price) {
    	setName(name);
    	setMaterial(material);
    	setManufacturer(manufacturer);
    	setCategory(category);
    	setPrice(price);
    }

    /**
     * String representation of an object
     */
    public String toString() {
    	return name + "," + material + "," + manufacturer + "," + category + "," + price;
    }

    /**
     * Name getter
     */
    public String getName() {
    	return name;
    }

    /**
     * Name setter
     */
    public void setName(String name) {
    	this.name = name;
    }

    /**
     * Material getter
     */
    public String getMaterial() {
    	return material;
    }

    /**
     * Material setter
     */
    public void setMaterial(String material) {
    	this.material = material;
    }

    /**
     * Manufacturer getter
     */
    public String getManufacturer() {
    	return manufacturer;
    }
    
    /**
     * Manufacturer getter
     */
    public void setManufacturer(String manufacturer) {
    	this.manufacturer = manufacturer;
    }
    
    /**
     * Category getter
     */
    public String getCategory() {
    	return category;
    }
    
    /**
     * Category setter
     */
    public void setCategory(String category) {
    	this.category = category;
    }
    
    /**
     * Price getter
     */
    public float getPrice() {
    	return price;
    }
    
    /**
     * Price setter
     */
    public void setPrice(float price) {
    	this.price = price;
    }
}
