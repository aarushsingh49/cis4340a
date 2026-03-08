// ─── Rule 1: OBJ03-J (Object Orientation) - Do not mix generic with raw types ───
// Non-Compliant: uses raw type List, loses type safety
// public void addToList(List list, Object obj) {
//     list.add(obj); // unchecked warning, ClassCastException at runtime possible
// }

public <T> void addToList(List<T> list, T obj) {
    list.add(obj); // type-safe, compiler enforces correct types
}