package entidade;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Viagem {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currency", currency).append("results", results).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(results).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Viagem) == false) {
            return false;
        }
        Viagem rhs = ((Viagem) other);
        return new EqualsBuilder().append(results, rhs.results).append(currency, rhs.currency).isEquals();
    }

}