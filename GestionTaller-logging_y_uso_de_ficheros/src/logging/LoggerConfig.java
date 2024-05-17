package logging;

import appconfig.AppConfig;
import java.io.IOException;
import java.util.logging.*;

/**
 * LoggerConfig es una clase de utilidad que proporciona configuración centralizada
 * para loggers en toda la aplicación. Utiliza el patrón Singleton para asegurar que
 * la configuración del logger se realice solo una vez, y el patrón Factory para
 * proporcionar instancias de loggers configurados.
 * <p>
 *
 * <p>
 *
 * <li><b>Patrón Singleton:</b> Este patrón garantiza que una clase tenga solo una instancia
 * y proporcione un punto de acceso global a dicha instancia. En esta clase, el patrón
 * Singleton se utiliza para asegurar que el logger se configure solo una vez, evitando
 * múltiples configuraciones que podrían causar inconsistencias.
 * <p>
 * <li><b>Patrón Factory:</b> Este patrón se utiliza para crear objetos sin tener que
 * especificar la clase exacta del objeto que se va a crear. En esta clase, el método
 * {@link #getLogger(String)} actúa como una fábrica que proporciona instancias de loggers
 * configurados según el nombre de la clase proporcionado.
 */
public class LoggerConfig {

    /**
     * Logger para la propia clase LoggerConfig, utilizado para registrar eventos
     * internos de la clase.
     */
//    private static final Logger logger = Logger.getLogger(LoggerConfig.class.getSimpleName());

    /**
     * Flag para asegurar que la configuración del logger se realice solo una vez.
     * Utilizada en el patrón Singleton.
     */
    private static boolean isConfigured = false;


    /**
     * Proporciona una instancia de Logger configurada para la clase especificada.
     * Este método sigue el patrón Factory, proporcionando una instancia de Logger
     * configurada según el nombre de la clase.
     *
     * @param className El nombre de la clase para la cual se requiere el Logger.
     * @return Una instancia de Logger configurada.
     */
    public static Logger getLogger(String className) {
        if (!isConfigured) {
            configureLogger();
        }
        return Logger.getLogger(className);

    }

    /**
     * Configura el Logger raíz con manejadores personalizados para archivo y consola.
     * Este método sigue el patrón Singleton para asegurar que la configuración se
     * realice solo una vez.
     * <p>
     * El Logger raíz se configura removiendo los manejadores predeterminados y
     * añadiendo manejadores personalizados para archivo y consola, utilizando un
     * formato específico definido por {@link LogFormatter}.
     */
    public static void configureLogger() {
        if (isConfigured) {
            return;
        }
        try {
            // Obtener el logger raíz y remover los manejadores predeterminados
            Logger rootLogger = Logger.getLogger("");

            Handler[] handlers = rootLogger.getHandlers();
            for (Handler handler : handlers) {
                rootLogger.removeHandler(handler);
            }

            // Configurar el manejador de archivos
            FileHandler fileHandler = new FileHandler(AppConfig.LOG_FILE_NAME, AppConfig.LOG_FILE_APPEND);
            fileHandler.setFormatter(new LogFormatter()); // Usar LogFormatter personalizado
            fileHandler.setLevel(Level.ALL);

            // Configurar el manejador de consola
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new LogFormatter()); // Usar LogFormatter personalizado
            consoleHandler.setLevel(Level.WARNING);

            // Agregar los manejadores personalizados al logger raíz
            rootLogger.addHandler(fileHandler);
            rootLogger.addHandler(consoleHandler);
            rootLogger.setLevel(AppConfig.LOG_LEVEL);

            // Marcar la configuración como realizada
            isConfigured = true;

        } catch (IOException e) {
            Logger.getLogger("").log(Level.SEVERE, "Fallo al configurar el logger", e);
        }
    }
}
