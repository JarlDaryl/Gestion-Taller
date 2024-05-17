package logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * La clase LogFormatter extiende Formatter y se utiliza para definir un formato personalizado
 * para los registros de log en una aplicación Java.
 * <p>
 * Los formatters en Java Logging API permiten controlar cómo se presentan los mensajes de log
 * cuando se escriben en una salida, como la consola o un archivo. Este formatter específico
 * organiza los mensajes de log en un formato legible que incluye la fecha, hora, nivel de log,
 * nombre del logger y el mensaje del log.
 */
public class LogFormatter extends Formatter {

    /**
     * Formatea un registro de log en una cadena de texto utilizando un formato específico.
     * <p>
     * Este método sobrescribe {@link Formatter#format(LogRecord)} para proporcionar un formato
     * personalizado para los registros de log. El formato incluye:
     * <ul>
     * <li>Fecha en formato año-mes-día</li>
     * <li>Hora en formato hora:minuto:segundo</li>
     * <li>Nivel del log (por ejemplo, INFO, SEVERE)</li>
     * <li>Nombre del logger</li>
     * <li>Mensaje del registro de log</li>
     * </ul>
     *
     * @param record El registro de log que debe ser formateado.
     * @return Una cadena de texto que representa el registro de log formateado.
     */
    @Override
    public String format(LogRecord record) {
        return String.format("%1$tF %1$tT %2$s %3$s - %4$s%n",
                record.getMillis(),
                record.getLevel().getName(),
                record.getLoggerName(),
                formatMessage(record));
    }
}