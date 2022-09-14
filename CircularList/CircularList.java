public class CircularList<T> {
    private T[] elements;
    private int pos;
    private Boolean flag;

    @SafeVarargs
    public CircularList(final T... elements) {
        if (java.util.Objects.isNull(elements) || elements.length == 0) throw new RuntimeException();
        this.elements = elements;
        pos = elements.length - 1;
        flag = true;
    }

    T next() {
        ++pos;
        pos = pos > elements.length - 1 ? 0 : pos;
        return elements[pos];
    }

    T prev() {
        pos = pos - 1 < 0 ? elements.length - 1 : flag ? pos : --pos;
        flag = false;
        return elements[pos];
    }
  }


// DESCRIPTION:
// Create a Circular List

// A circular list is of finite size, but can infititely be asked for its previous and next elements. This is because it acts like it is joined at the ends and loops around.

// For example, imagine a CircularList of [1, 2, 3, 4]. Five invocations of next() in a row should return 1, 2, 3, 4 and then 1 again. At this point, five invocations of prev() in a row should return 4, 3, 2, 1 and then 4 again.

// Your CircularList is created by passing a vargargs parameter in, e.g. new CircularList(1, 2, 3). Your list constructor/init code should throw an Exception if nothing is passed in.

// LISTS DATA STRUCTURES FUNDAMENTALS
