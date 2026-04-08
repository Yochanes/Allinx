package retrofit2;

import java.util.concurrent.Executor;
import retrofit2.BuiltInFactories;
import retrofit2.Reflection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class Platform {

    /* JADX INFO: renamed from: a */
    public static final Executor f59394a;

    /* JADX INFO: renamed from: b */
    public static final Reflection f59395b;

    /* JADX INFO: renamed from: c */
    public static final BuiltInFactories f59396c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f59394a = null;
            f59395b = new Reflection();
            f59396c = new BuiltInFactories();
        } else if (property.equals("Dalvik")) {
            f59394a = new AndroidMainExecutor();
            f59395b = new Reflection.Android24();
            f59396c = new BuiltInFactories.Java8();
        } else {
            f59394a = null;
            f59395b = new Reflection.Java8();
            f59396c = new BuiltInFactories.Java8();
        }
    }
}
