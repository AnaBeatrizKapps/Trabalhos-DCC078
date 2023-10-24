public class FileLogger implements Logger {
    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        // Implementação para gravar em um arquivo (não fornecida aqui)
        System.out.println("File: " + message);
    }
}