package MusicFileParser;

public class Header {
    private int channels;
    private int sampleRate;
    private int bits;
    Header(int channels, int sampleRate, int bits) {
        this.channels = channels;
        this.sampleRate = sampleRate;
        this.bits = bits;
    }

    public int getBits() {
        return bits;
    }

    public int getSampleRate() {
        return sampleRate;
    }

    public int getChannels() {
        return channels;
    }
}
