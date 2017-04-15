/**
 * Created by Paul on 10/17/2016.
 */
public class IntegerSet {
    private int[] a;

    public IntegerSet() {

        a = new int[100];
    }

    // A constructor that copies from an existing set.
    public IntegerSet(IntegerSet existingSet) {
        a = new int[101];
        for (int i = 0; i < a.length; i++)
            a[i] = existingSet.a[i];
    }

    public void deleteElement(int i) {
        if ((i >= 0) && (i < a.length))
            a[i] = 0;  // set to 1
    }

    public void insertElement(int i) {
        if ((i >= 0) && (i < a.length))
            a[i] = 1;  // set to 1
    }

    public boolean isSet(int i) {
        return (a[i] == 1);
    }


    public IntegerSet unionOfIntegerSets(IntegerSet otherSet) {
        IntegerSet newSet = new IntegerSet(this);

        for (int i = 0; i < a.length; i++) {
            if (otherSet.isSet(i))
                newSet.insertElement(i);
        }
        return newSet;
    }
    public IntegerSet intersectionOfIntegerSets(IntegerSet otherSet) {
        IntegerSet newSet = new IntegerSet(this);
        for (int i = 0; i < a.length; i++) {
            if (!otherSet.isSet(i))
                newSet.deleteElement(i);
        }
        return newSet;
    }
    public boolean isEmpty() {
        for (int i = 0; i < a.length; i++)
            if (isSet(i)) return false;
        return true;
    }
    public int cardinality() {
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (isSet(i))
                count++;
        return count;
    }
    public void setPrint() {
        System.out.print("[Set:");

        if (isEmpty())
            System.out.print("---");

        for (int i = 0; i < a.length; i++) {
            if (isSet(i))
                System.out.print(" " + i);
        }

        System.out.print("]\n");
    }
    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i < a.length; i++) {
            if (otherSet.isSet(i) != isSet(i))
                return false;
        }
        return true;
    }


    // Small test program to verify that IntegerSet works!
    public static void main(String[] args) {
        IntegerSet smallEvens = new IntegerSet();
        IntegerSet smallOdds = new IntegerSet();
        for (int i = 0; i < 10; i++)
            if ((i % 2) == 0)
                smallEvens.insertElement(i);
            else
                smallOdds.insertElement(i);

        System.out.print("smallEvens: ");
        smallEvens.setPrint();

        System.out.print("smallOdds: ");
        smallOdds.setPrint();

        IntegerSet union = smallEvens.unionOfIntegerSets(smallOdds);
        System.out.print("union: ");
        union.setPrint();

        IntegerSet intersection = smallEvens.intersectionOfIntegerSets(smallOdds);
        System.out.print("intersection: ");
        intersection.setPrint();

    }
}