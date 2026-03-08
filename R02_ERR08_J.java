// ─── Rule 2: ERR08-J (Exceptional Behavior) - Do not catch NullPointerException ───
// Non-Compliant: catches NPE to handle null, masking real bugs
// try {
//     String s = getUserInput();
//     System.out.println(s.length());
// } catch (NullPointerException e) {
//     System.out.println("Input was null");
// }

String s = getUserInput();
if (s == null) {
    System.out.println("Input was null");
} else {
    System.out.println(s.length());
}