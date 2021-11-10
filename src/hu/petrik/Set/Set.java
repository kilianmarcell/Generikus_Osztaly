package hu.petrik.Set;

import java.util.ArrayList;
import java.util.List;

public class Set<T> { // T tipusú elemek fogadására alkalmas

    private List<T> elements;

    public Set() {

        this.elements = new ArrayList<>();

    }

    public void add(T element) {

        if (!elements.contains(element)) {

            this.elements.add(element);

        }

    }

    public boolean remove(T element) {

        //return this.elements.remove(element);

        boolean isRemoved = false;

        if (this.elements.contains(element)) {

            this.elements.remove(element);
            return true;

        }

        return isRemoved;

    }

    public int getSize() {

        return this.elements.size();

    }

    public void clear() {

        this.elements.clear();

    }

}
