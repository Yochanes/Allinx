package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class KotlinRetention {

    /* JADX INFO: renamed from: a */
    public static final KotlinRetention f52349a;

    /* JADX INFO: renamed from: b */
    public static final KotlinRetention f52350b;

    /* JADX INFO: renamed from: c */
    public static final KotlinRetention f52351c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KotlinRetention[] f52352d;

    static {
        KotlinRetention kotlinRetention = new KotlinRetention("RUNTIME", 0);
        f52349a = kotlinRetention;
        KotlinRetention kotlinRetention2 = new KotlinRetention("BINARY", 1);
        f52350b = kotlinRetention2;
        KotlinRetention kotlinRetention3 = new KotlinRetention("SOURCE", 2);
        f52351c = kotlinRetention3;
        f52352d = new KotlinRetention[]{kotlinRetention, kotlinRetention2, kotlinRetention3};
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) f52352d.clone();
    }
}
