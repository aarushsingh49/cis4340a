// ─── Rule 3: NUM03-J - Use integer types that can fully represent unsigned data ───
public static long getInteger(DataInputStream is) throws IOException {
    return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}