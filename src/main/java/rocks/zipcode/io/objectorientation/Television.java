package rocks.zipcode.io.objectorientation;

public class Television {

    private Integer channel;
    private TVChannel tvChannel;

    public void turnOn() {
    }

    public void setChannel(Integer channelNumber) {
        this.channel = channelNumber;
    }

    public TVChannel getChannel() {

        return this.tvChannel;
    }
}
