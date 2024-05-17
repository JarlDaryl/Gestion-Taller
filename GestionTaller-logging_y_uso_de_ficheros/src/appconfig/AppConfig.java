package appconfig;

import java.util.logging.Level;

/**
 * La clase AppConfig contiene las configuraciones globales para la aplicación.
 * Estas configuraciones incluyen el nivel de logging, el nombre del archivo de log,
 * y un indicador para configurar si se debe añadir al archivo de log existente o crear uno nuevo.
 */
public class AppConfig {

    /**
     * El nivel de logging para toda la aplicación.
     * &lt;p&gt;
     * Este nivel determina la severidad mínima de los mensajes de log que serán registrados.
     * Los niveles de logging disponibles son:
     * &lt;ul&gt;
     * &lt;li&gt;{@link Level#ALL} - Captura todos los mensajes de log&lt;/li&gt;
     * &lt;li&gt;{@link Level#SEVERE} - Captura solo los mensajes de error graves&lt;/li&gt;
     * &lt;li&gt;{@link Level#WARNING} - Captura mensajes de advertencia y errores graves&lt;/li&gt;
     * &lt;li&gt;{@link Level#INFO} - Captura mensajes informativos, advertencias y errores graves&lt;/li&gt;
     * &lt;li&gt;{@link Level#CONFIG} - Captura mensajes de configuración, informativos, advertencias y errores graves&lt;/li&gt;
     * &lt;li&gt;{@link Level#FINE} - Captura mensajes detallados de depuración, además de todos los anteriores&lt;/li&gt;
     * &lt;li&gt;{@link Level#FINER} - Captura mensajes más detallados de depuración, además de todos los anteriores&lt;/li&gt;
     * &lt;li&gt;{@link Level#FINEST} - Captura el mayor detalle de mensajes de depuración, además de todos los anteriores&lt;/li&gt;
     * &lt;li&gt;{@link Level#OFF} - Desactiva el logging&lt;/li&gt;
     * &lt;/ul&gt;
     */
    public static final Level LOG_LEVEL = Level.ALL;

    /**
     * El nombre del archivo donde se registrarán los logs de la aplicación.
     * &lt;p&gt;
     * Este archivo almacenará todos los mensajes de log generados por la aplicación.
     * Se recomienda proporcionar un nombre de archivo significativo y con una extensión apropiada,
     * como ".log" o ".txt".
     */
    public static final String LOG_FILE_NAME = "app.log";

    /**
     * Indicador para configurar si se debe añadir al archivo de log existente o crear uno nuevo.
     * &lt;p&gt;
     * Si es {@code true}, los mensajes de log se añadirán al archivo de log existente.
     * Si es {@code false}, se creará un nuevo archivo de log, sobrescribiendo el existente.
     * &lt;p&gt;
     * Esta configuración es útil para controlar el tamaño del archivo de log y la gestión de archivos de log históricos.
     */
    public static final boolean LOG_FILE_APPEND = true;
}