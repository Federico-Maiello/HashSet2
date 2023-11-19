// non l'ho capito molto mi sono aiutato.
import java.util.HashSet;

public class Main {

    static class HashSetObject {
        String name;
        public HashSetObject(String name) {
            this.name = name;
        }
    }

    public static HashSet<HashSetObject> createAndPopulateHashSet() {
        HashSet<HashSetObject> hashSet = new HashSet<>();
        HashSetObject object = new HashSetObject("Element1");
        hashSet.add(object);

        return hashSet;
    }

    public static void main(String[] args) {
        HashSet<HashSetObject> myHashSet = createAndPopulateHashSet();
        HashSetObject newObject = new HashSetObject("Element1");
        boolean present = myHashSet.contains(newObject);
        System.out.println("The element is present in the set: " + present);
    }
}
