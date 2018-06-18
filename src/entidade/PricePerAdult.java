package entidade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PricePerAdult {

    @SerializedName("total_fare")
    @Expose
    private String totalFare;
    @SerializedName("tax")
    @Expose
    private String tax;

    public String getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(String totalFare) {
        this.totalFare = totalFare;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalFare", totalFare).append("tax", tax).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalFare).append(tax).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PricePerAdult) == false) {
            return false;
        }
        PricePerAdult rhs = ((PricePerAdult) other);
        return new EqualsBuilder().append(totalFare, rhs.totalFare).append(tax, rhs.tax).isEquals();
    }

}