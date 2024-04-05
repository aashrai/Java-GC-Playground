package gcPlayground.utils;

public class LargeObject {
    private byte[] data;

    public LargeObject(int sizeInBytes) {
        // Initializes a byte array of the specified size.
        this.data = new byte[sizeInBytes];
    }
}
