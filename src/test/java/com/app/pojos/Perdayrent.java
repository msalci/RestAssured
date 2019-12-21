
package com.app.pojos;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Perdayrent {

    @SerializedName("Price")
    @Expose
    private long price;
    @SerializedName("Discount")
    @Expose
    private long discount;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Perdayrent withPrice(long price) {
        this.price = price;
        return this;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public Perdayrent withDiscount(long discount) {
        this.discount = discount;
        return this;
    }

	@Override
	public String toString() {
		return "Perdayrent [price=" + price + ", discount=" + discount + "]";
	}

}
