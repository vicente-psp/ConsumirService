package entidade;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Inbound {

    @SerializedName("flights")
    @Expose
    private List<Flight> flights = null;

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flights", flights).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flights).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Inbound) == false) {
            return false;
        }
        Inbound rhs = ((Inbound) other);
        return new EqualsBuilder().append(flights, rhs.flights).isEquals();
    }

}
