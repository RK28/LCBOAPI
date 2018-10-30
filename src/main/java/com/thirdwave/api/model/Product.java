package com.thirdwave.api.model;
/**
 * @author RK
 *
 */
public class Product {

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	private String id;
	private String is_dead;
	private String name;
	private String price_in_cents;
	private String primary_category;
	private String secondary_category;

	private String _package;
	
	private String origin;
	private String country;
	private String producer_name;
	private String price;
	private String vintage;
	private String varietal;
	private String stock_type;
	
	
	public String getStock_type() {
		return stock_type;
	}
	public void setStock_type(String stock_type) {
		this.stock_type = stock_type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIs_dead() {
		return is_dead;
	}
	public void setIs_dead(String is_dead) {
		this.is_dead = is_dead;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice_in_cents() {
		double i= Integer.parseInt(price_in_cents);
		return String.valueOf(i/100);
	}
	public void setPrice_in_cents(String price_in_cents) {
		this.price_in_cents = price_in_cents;
	}
	public String getPrimary_category() {
		return primary_category;
	}
	public void setPrimary_category(String primary_category) {
		this.primary_category = primary_category;
	}
	public String getSecondary_category() {
		return secondary_category;
	}
	public void setSecondary_category(String secondary_category) {
		this.secondary_category = secondary_category;
	}
	public String get_package() {
		return _package;
	}
	public void set_package(String _package) {
		this._package = _package;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getProducer_name() {
		return producer_name;
	}
	public void setProducer_name(String producer_name) {
		this.producer_name = producer_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getVintage() {
		return vintage;
	}
	public void setVintage(String vintage) {
		this.vintage = vintage;
	}
	public String getVarietal() {
		return varietal;
	}
	public void setVarietal(String varietal) {
		this.varietal = varietal;
	}
	@Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", primary_category='" + primary_category + '\'' + 
                '}';
    }
	
	
}
