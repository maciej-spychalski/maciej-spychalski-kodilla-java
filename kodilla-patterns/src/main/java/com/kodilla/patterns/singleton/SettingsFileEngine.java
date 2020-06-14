package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    private SettingsFileEngine() {
    }

    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            synchronized(SettingsFileEngine.class) {
                // Aby zapobiec problemom związanym z równoczesnym dostępem do jakiegoś zasobu (np. pól obiektu) przez
                // równolegle wykonywane wątki programu, należy zastosować blok synchronized(Object o) { ... }.
                // W bloku tym umieszczamy kod modyfikujący pola obiektu, który ma być chroniony. Jako argument
                // polecenia synchronized(Object o) przekazujemy jakiś obiekt, który jest "identyfikatorem" chronionego
                // zasobu.
                // Wewnątrz metody zwracającej obiekt Singletona dokonujemy dwukrotnego sprawdzenia, czy został już
                // wcześniej zainicjowany. Co ważne, drugie sprawdzenie odbywa się wewnątrz bloku synchronized(),
                // dzięki czemu będziemy mieli pewność, że nie wystąpi równoczesne utworzenie osobnych obiektów
                // Singletona przez równolegle działające wątki aplikacji.
                if (settingsFileEngineInstance == null) {
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }


    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}