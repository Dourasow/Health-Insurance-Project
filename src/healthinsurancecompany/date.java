/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthinsurancecompany;

import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 *
 * @author ues
 */
class date {
    private static final Locale defaultFormattingLocale
        = Locale.getDefault(Locale.Category.FORMAT);
private static final String defaultDateFormat = DateTimeFormatterBuilder
        .getLocalizedDateTimePattern(FormatStyle.SHORT, null, 
                IsoChronology.INSTANCE, defaultFormattingLocale);
private static final DateTimeFormatter dateFormatter
        = DateTimeFormatter.ofPattern(defaultDateFormat, defaultFormattingLocale);
    
}
