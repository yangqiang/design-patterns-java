package refactoring_guru.construct.singleton.example.thread_safe;

public final class Singleton {
    // EN: The field must be declared volatile so that double check lock would
    // work correctly.
    //
    // RU: Поле обязательно должно быть объявлено volatile, чтобы двойная
    // проверка блокировки сработала как надо.
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // EN: The approach taken here is called double-checked locking (DCL).
        // It exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating
        // separate instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        //
        // RU: Техника, которую мы здесь применяем называется «блокировка с
        // двойной проверкой» (Double-Checked Locking). Она применяется, чтобы
        // предотвратить создание нескольких объектов-одиночек, если метод будет
        // вызван из нескольких потоков одновременно.
        //
        // Хотя переменная `result` вполне оправданно кажется здесь лишней, она
        // помогает избежать подводных камней реализации DCL в Java.
        //
        // Больше об этой проблеме можно почитать здесь:
        // https://refactoring.guru/ru/java-dcl-issue
        // 减少 instance 被访问的次数
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            result = instance;
            if (result == null) {
                instance = result = new Singleton(value);
            }
            return result;
        }
    }
}
