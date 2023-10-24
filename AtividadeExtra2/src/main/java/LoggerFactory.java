public class LoggerFactory {
    private static LoggerFactory instance;

    private LoggerFactory() {
        // Construtor privado para evitar a criação de instâncias diretas.
    }

    public static LoggerFactory getInstance() {
        if (instance == null) {
            instance = new LoggerFactory();
        }
        return instance;
    }

    public Logger createLogger(String type) {
        if ("Console".equalsIgnoreCase(type)) {
            return new ConsoleLogger();
        } else if ("File".equalsIgnoreCase(type)) {
            return new FileLogger("log.txt");
        } else {
            throw new IllegalArgumentException("Tipo de logger não suportado.");
        }
    }
}
