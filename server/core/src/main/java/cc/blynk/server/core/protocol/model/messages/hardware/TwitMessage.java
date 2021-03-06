package cc.blynk.server.core.protocol.model.messages.hardware;

import cc.blynk.server.core.protocol.model.messages.StringMessage;

import static cc.blynk.server.core.protocol.enums.Command.TWEET;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 */
public class TwitMessage extends StringMessage {

    public TwitMessage(int messageId, String body) {
        super(messageId, TWEET, body.length(), body);
    }

    @Override
    public String toString() {
        return "TwitMessage{" + super.toString() + "}";
    }
}
