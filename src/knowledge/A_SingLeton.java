package knowledge;

// ------------------------- ����ʽ���� -----------------------------------
class hungrySingLeton {
    // ������
    private hungrySingLeton(){
        if(INSTANCE != null) // �����ƻ����
            throw new RuntimeException("�Ѿ�����");
    };
    private static A_SingLeton INSTANCE = new A_SingLeton();
    // ����
    public A_SingLeton getINSTANCE(){
        return INSTANCE;
    }
    // �������ƻ����
    public Object readResolve(){
        return INSTANCE;
    }
}

// ------------------------- ˫��������ʽ���� -------------------------
class DoubleCheckSingleton {
    // ������
    private DoubleCheckSingleton() {
    }

    ;
    private static volatile DoubleCheckSingleton INSDANCE = null; // �õ���ʵ����

    // ˫��������
    public static DoubleCheckSingleton getINSDANCE() {
        // �ж�1: �Ƿ�ʵ����
        if (INSDANCE == null) {
            // ����������
            synchronized (DoubleCheckSingleton.class) { // �����Ƕ���
                // �ж�2: �Ƿ�ʵ����
                if (INSDANCE == null)
                    INSDANCE = new DoubleCheckSingleton();
            }
        }
        return INSDANCE;
    }

}

// ------------------------- �ڲ�������ʽ���� -------------------------
class LazySingLeton{
    // ������
    private LazySingLeton(){};

    // �ڲ���: static����JVM��֤���԰�ȫ
    private static class Holder{
        private static LazySingLeton INSTANCE = new LazySingLeton(); // �õ���ʵ����
    }

    // ����
    public static LazySingLeton getInstance(){
        return Holder.INSTANCE;
    }

}


public class A_SingLeton {
}