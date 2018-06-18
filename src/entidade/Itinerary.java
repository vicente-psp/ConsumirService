package entidade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Itinerary {

    @SerializedName("outbound")
    @Expose
    private Outbound outbound;
    @SerializedName("inbound")
    @Expose
    private Inbound inbound;

    public Outbound getOutbound() {
        return outbound;
    }

    public void setOutbound(Outbound outbound) {
        this.outbound = outbound;
    }

    public Inbound getInbound() {
        return inbound;
    }

    public void setInbound(Inbound inbound) {
        this.inbound = inbound;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("outbound", outbound).append("inbound", inbound).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outbound).append(inbound).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Itinerary) == false) {
            return false;
        }
        Itinerary rhs = ((Itinerary) other);
        return new EqualsBuilder().append(outbound, rhs.outbound).append(inbound, rhs.inbound).isEquals();
    }

}