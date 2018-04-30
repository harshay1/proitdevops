package com.proitdevops.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class I18NService {
    @Autowired
    private MessageSource messageSource;

    /**
     * Returns a message from the given message id and the default locale in the session context
     * @Param messageId The key to the messages resource file
     **/
    public String getMessage(String messageId) {
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    /**
     * Returns a message from the given message id and locale
     * @Param messageId The key to the messages resource file
     * @Param locale the Locale
     **/
    public String getMessage(String messageId, Locale locale) {
        return messageSource.getMessage(messageId, null, locale);
    }
}
