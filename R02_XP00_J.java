// ─── Rule 2: EXP00-J - Do not ignore values returned by methods ───
public void deleteFile() {
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    if (!someFile.delete()) {
        // Handle failure to delete the file
    }
}