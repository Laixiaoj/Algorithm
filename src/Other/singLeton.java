package Other;

// ------------------------- 饿汉式单例 -----------------------------------
class hungrySingLeton {
    // 单例化
    private hungrySingLeton(){
        if(INSTANCE != null) // 反射破坏解决
            throw new RuntimeException("已经存在");
    };
    private static singLeton INSTANCE = new singLeton();
    // 访问
    public singLeton getINSTANCE(){
        return INSTANCE;
    }
    // 反序列破坏解决
    public Object readResolve(){
        return INSTANCE;
    }
}

// ------------------------- 双检锁懒汉式单例 -------------------------
class DoubleCheckSingleton {
    // 单例化
    private DoubleCheckSingleton() {
    }

    ;
    private static volatile DoubleCheckSingleton INSDANCE = null; // 用到才实例化

    // 双检锁访问
    public static DoubleCheckSingleton getINSDANCE() {
        // 判断1: 是否实例化
        if (INSDANCE == null) {
            // 加重量级锁
            synchronized (DoubleCheckSingleton.class) { // 锁的是对象
                // 判断2: 是否实例化
                if (INSDANCE == null)
                    INSDANCE = new DoubleCheckSingleton();
            }
        }
        return INSDANCE;
    }

}

// ------------------------- 内部类懒汉式单例 -------------------------
class LazySingLeton{
    // 单例化
    private LazySingLeton(){};

    // 内部类: static类由JVM保证线性安全
    private static class Holder{
        private static LazySingLeton INSTANCE = new LazySingLeton(); // 用到才实例化
    }

    // 访问
    public static LazySingLeton getInstance(){
        return Holder.INSTANCE;
    }

}


public class singLeton {
}