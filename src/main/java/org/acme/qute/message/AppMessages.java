package org.acme.qute.message;

import io.quarkus.qute.i18n.Message;
import io.quarkus.qute.i18n.MessageBundle;

/**
 * use this is ok
 * {@code @MessageBundle(locale = MessageBundles.DEFAULT_LOCALE)}
 */
@MessageBundle
public interface AppMessages {

    /**
     * {msg:hello_name(name)}
     *
     * @param name
     * @return
     */
    @Message("Hello {name ?: \"world\"}!")
    String hello_name(String name);

}
