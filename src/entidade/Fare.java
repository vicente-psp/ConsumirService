package entidade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Fare {

    @SerializedName("total_price")
    @Expose
    private String totalPrice;
    @SerializedName("price_per_adult")
    @Expose
    private PricePerAdult pricePerAdult;
    @SerializedName("price_per_child")
    @Expose
    private PricePerChild pricePerChild;
    @SerializedName("price_per_infant")
    @Expose
    private PricePerInfant pricePerInfant;
    @SerializedName("restrictions")
    @Expose
    private Restrictions restrictions;

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PricePerAdult getPricePerAdult() {
        return pricePerAdult;
    }

    public void setPricePerAdult(PricePerAdult pricePerAdult) {
        this.pricePerAdult = pricePerAdult;
    }

    public PricePerChild getPricePerChild() {
        return pricePerChild;
    }

    public void setPricePerChild(PricePerChild pricePerChild) {
        this.pricePerChild = pricePerChild;
    }

    public PricePerInfant getPricePerInfant() {
        return pricePerInfant;
    }

    public void setPricePerInfant(PricePerInfant pricePerInfant) {
        this.pricePerInfant = pricePerInfant;
    }

    public Restrictions getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalPrice", totalPrice).append("pricePerAdult", pricePerAdult).append("pricePerChild", pricePerChild).append("pricePerInfant", pricePerInfant).append("restrictions", restrictions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(restrictions).append(pricePerChild).append(pricePerInfant).append(pricePerAdult).append(totalPrice).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fare) == false) {
            return false;
        }
        Fare rhs = ((Fare) other);
        return new EqualsBuilder().append(restrictions, rhs.restrictions).append(pricePerChild, rhs.pricePerChild).append(pricePerInfant, rhs.pricePerInfant).append(pricePerAdult, rhs.pricePerAdult).append(totalPrice, rhs.totalPrice).isEquals();
    }

}