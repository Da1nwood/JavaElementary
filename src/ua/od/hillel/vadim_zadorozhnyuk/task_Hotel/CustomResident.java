package ua.od.hillel.vadim_zadorozhnyuk.task_Hotel;

import java.util.Objects;

public class CustomResident {

    private String name;

    public CustomResident(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomResident resident = (CustomResident) o;
        return Objects.equals(name, resident.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name.charAt(0));
    }
}
