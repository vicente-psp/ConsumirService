package entidade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Origin {

    @SerializedName("airport")
    @Expose
    private String airport;
    @SerializedName("terminal")
    @Expose
    private String terminal;

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("airport", airport).append("terminal", terminal).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(airport).append(terminal).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Origin) == false) {
            return false;
        }
        Origin rhs = ((Origin) other);
        return new EqualsBuilder().append(airport, rhs.airport).append(terminal, rhs.terminal).isEquals();
    }

}