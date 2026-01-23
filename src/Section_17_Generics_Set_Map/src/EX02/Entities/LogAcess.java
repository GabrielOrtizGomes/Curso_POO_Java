package Section_17_Generics_Set_Map.src.EX02.Entities;

import java.time.Instant;
import java.util.Objects;

public class LogAcess {
    private String userName;
    private Instant instant;


    public LogAcess(String userName, Instant instant) {
        this.userName = userName;
        this.instant = instant;
    }

    public String getUserName() {
        return userName;
    }

    public Instant getInstant() {
        return instant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogAcess logAcess = (LogAcess) o;
        return Objects.equals(userName, logAcess.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }

    @Override
    public String toString() {
        return "LogAcess{" +
                "userName='" + userName + '\'' +
                ", instant=" + instant +
                '}';
    }
}
