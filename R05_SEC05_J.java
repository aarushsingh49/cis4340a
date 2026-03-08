// ─── Rule 5: SEC05-J (Platform Security) - Do not use reflection to increase accessibility of classes, methods, or fields ───
// Non-Compliant: bypasses access controls using reflection
// Field secret = MyClass.class.getDeclaredField("secretKey");
// secret.setAccessible(true); // overrides private/protected modifier
// String value = (String) secret.get(myObj);

// Compliant: expose data only through a proper accessor method
public class MyClass {
    private String secretKey;

    public String getSecretKey() {
        // Apply authorization check before returning sensitive data
        if (isAuthorized()) {
            return secretKey;
        }
        throw new SecurityException("Access denied");
    }

    private boolean isAuthorized() {
        // authorization logic here
        return false;
    }
}