package modelo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ViagemModelo {

    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("results")
    @Expose
    private List<ResultModelo> results = null;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<ResultModelo> getResults() {
        return results;
    }

    public void setResults(List<ResultModelo> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("origin", origin).append("currency", currency).append("results", results).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(results).append(origin).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViagemModelo) == false) {
            return false;
        }
        ViagemModelo rhs = ((ViagemModelo) other);
        return new EqualsBuilder().append(results, rhs.results).append(origin, rhs.origin).append(currency, rhs.currency).isEquals();
    }

}
