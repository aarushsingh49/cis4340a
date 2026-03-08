// ─── Rule 3: FIO08-J (Input Output) - Use an int to capture the return value of methods that read a character or byte ───
// Non-Compliant: uses byte, -1 EOF signal is lost due to sign truncation
// FileInputStream fis = new FileInputStream("file.txt");
// byte data;
// while ((data = (byte) fis.read()) != -1) { // -1 becomes 0xFF, loop never ends
//     process(data);
// }

FileInputStream fis = new FileInputStream("file.txt");
int data;
while ((data = fis.read()) != -1) { // int correctly captures -1 as EOF
    process(data);
}
fis.close();