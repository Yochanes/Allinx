package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: a */
    public final Name f52037a;

    /* JADX INFO: renamed from: b */
    public final Name f52038b;

    /* JADX INFO: renamed from: c */
    public final Object f52039c;

    /* JADX INFO: renamed from: d */
    public final Object f52040d;

    /* JADX INFO: renamed from: f */
    public static final Set f52027f = ArraysKt.m18372h0(new PrimitiveType[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    PrimitiveType(String str) {
        this.f52037a = Name.m19605e(str);
        this.f52038b = Name.m19605e(str.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f51422b;
        this.f52039c = LazyKt.m18298a(lazyThreadSafetyMode, new PrimitiveType$typeFqName$2(this));
        this.f52040d = LazyKt.m18298a(lazyThreadSafetyMode, new PrimitiveType$arrayTypeFqName$2(this));
    }
}
