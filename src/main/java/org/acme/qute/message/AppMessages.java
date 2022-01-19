package org.acme.qute.message;

import io.quarkus.qute.i18n.Message;
import io.quarkus.qute.i18n.MessageBundle;
import io.quarkus.qute.i18n.MessageBundles;

/**
 *
 */
@MessageBundle(locale = MessageBundles.DEFAULT_LOCALE)
public interface AppMessages {

    /**
     * {msg:hello_name}
     *
     * @param name
     * @return
     */
    @Message("Hello {name ?: \"world\"}!")
    String hello_name(String name);

}
