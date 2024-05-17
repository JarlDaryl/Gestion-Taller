package fileReader;

import logging.LoggerConfig;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase LectorDeArchivos implementa Runnable y se utiliza para leer archivos
 * en un directorio especificado de manera continua en un hilo separado.
 * <p>
 * Un hilo es una unidad de ejecución dentro de un proceso. La creación de un
 * hilo separado permite que la operación de lectura de archivos se ejecute
 * concurrentemente con otras operaciones de la aplicación, mejorando la
 * eficiencia y la capacidad de respuesta de la aplicación.
 */
public class LectorDeArchivos implements Runnable {
    private static final Logger logger = LoggerConfig.getLogger(LectorDeArchivos.class.getSimpleName());
    private final String rutaDirectorio;

    /**
     * Constructor que inicializa la ruta del directorio a procesar.
     * <p>
     * El constructor se utiliza para crear una instancia de LectorDeArchivos
     * con una ruta de directorio específica donde se buscarán y leerán los archivos.
     *
     * @param rutaDirectorio Ruta del directorio a procesar.
     */
    public LectorDeArchivos(String rutaDirectorio) {
        this.rutaDirectorio = rutaDirectorio;
    }

    /**
     * Método que se ejecuta cuando el hilo es iniciado.
     * <p>
     * Este método contiene un bucle infinito que periódicamente llama a
     * {@link #procesarDirectorio(String)} para leer archivos en el directorio especificado.
     * Utiliza {@link Thread#sleep(long)} para esperar un tiempo antes de
     * volver a comprobar el directorio, permitiendo que otros hilos puedan ejecutarse.
     */
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                procesarDirectorio(rutaDirectorio);
                // Esperar un tiempo antes de volver a comprobar el directorio
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "Hilo de LectorDeArchivos interrumpido", e);
                Thread.currentThread().interrupt(); // Restablecer el estado de interrupción
                break; // Salir del bucle si el hilo es interrumpido
            }
        }
    }

    /**
     * Procesa el directorio especificado, leyendo todos los archivos regulares en el directorio.
     * <p>
     * Utiliza {@link DirectoryStream} para listar los archivos en el directorio.
     * Si no se encuentran archivos, se registra un mensaje informativo.
     *
     * @param rutaDirectorio Ruta del directorio a procesar.
     */
    private void procesarDirectorio(String rutaDirectorio) {
        boolean archivosEncontrados = false;
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(rutaDirectorio))) {
            for (Path entrada : stream) {
                if (Files.isRegularFile(entrada)) {
                    archivosEncontrados = true;
                    leerArchivo(entrada.toString());
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error al listar archivos en el directorio: " + rutaDirectorio, e);
        }
        if (!archivosEncontrados) {
            logger.info("No se encontraron archivos en el directorio: " + rutaDirectorio);
        }
    }

    /**
     * Lee el contenido de un archivo y lo registra.
     * <p>
     * Utiliza {@link Files#readAllBytes(Path)} para leer el contenido del archivo
     * y lo registra usando el logger.
     *
     * @param rutaArchivo Ruta del archivo a leer.
     */
    private void leerArchivo(String rutaArchivo) {
        logger.info("Leyendo archivo: " + rutaArchivo);
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
            logger.info("Contenido del archivo:\n" + contenido);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error al leer el archivo: " + rutaArchivo, e);
        }
    }

    /**
     * Método estático para iniciar el hilo LectorDeArchivos.
     * <p>
     * Este método crea una nueva instancia de LectorDeArchivos, crea un hilo
     * con esta instancia y lo inicia. Los hilos permiten la ejecución concurrente,
     * lo que significa que múltiples tareas pueden ejecutarse al mismo tiempo.
     *
     * @param rutaDirectorio Ruta del directorio a procesar.
     * @return El hilo LectorDeArchivos creado.
     */
    public static Thread iniciarHiloLectorDeArchivos(String rutaDirectorio) {
        LectorDeArchivos lectorDeArchivos = new LectorDeArchivos(rutaDirectorio);
        Thread hiloLectorDeArchivos = new Thread(lectorDeArchivos);
        hiloLectorDeArchivos.start();
        return hiloLectorDeArchivos;
    }
}