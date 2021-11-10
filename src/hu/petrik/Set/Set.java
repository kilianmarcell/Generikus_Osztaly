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

    public boolean isElement(T element) {

        int i = 0;

        while (i < this.elements.size() && this.elements.get(i) != element) {

            i++;

        }

        //this.elements.contains(element);
        return i < this.elements.size();

    }

    public boolean isEmpty() {

        //this.elements.isEmpty();
        return 0 == this.elements.size();

    }

    public boolean isEquals(Set<T> otherSet) {

        return this.getSize() == otherSet.getSize() && this.isPartOf(otherSet);

    }

    public boolean isPartOf(Set<T> otherSet) {

        boolean isBigger = this.getSize() > otherSet.getSize();
        boolean isPartOf = false;

        if (!isBigger) {

            int i = 0;

            while (i < this.getSize() && otherSet.isElement(this.elements.get(i))) {

                i++;

            }

            isPartOf = i == this.getSize();

        }

        return isPartOf;

    }

    public Set<T> unio(Set<T> otherSet) {

        Set<T> unioSet = new Set<>();

        for (T element : this.elements) {

            unioSet.add(element);

        }

        for (T element : otherSet.elements) {

            unioSet.add(element);

        }

        return unioSet;

    }

    public Set<T> intersect(Set<T> otherSet) {

        Set<T> intersect = new Set<>();

        for (T i : intersect.elements) {

            for (T f : otherSet.elements) {

             if (i == f) {

                 intersect.add(i);

             }

            }

        }

        return intersect;

    }

}
