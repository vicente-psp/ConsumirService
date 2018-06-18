package entidade;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Result {

    @SerializedName("itineraries")
    @Expose
    private List<Itinerary> itineraries = null;
    @SerializedName("fare")
    @Expose
    private Fare fare;

    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("itineraries", itineraries).append("fare", fare).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fare).append(itineraries).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(fare, rhs.fare).append(itineraries, rhs.itineraries).isEquals();
    }

}