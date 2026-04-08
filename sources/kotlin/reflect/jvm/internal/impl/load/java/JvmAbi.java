package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JvmAbi {

    /* JADX INFO: renamed from: a */
    public static final FqName f52758a;

    /* JADX INFO: renamed from: b */
    public static final ClassId f52759b;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        f52758a = fqName;
        ClassId.m19576j(fqName);
        ClassId.m19576j(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f52759b = ClassId.m19575e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    /* JADX INFO: renamed from: a */
    public static final String m19195a(String propertyName) {
        Intrinsics.m18599g(propertyName, "propertyName");
        if (m19197c(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.m20331a(propertyName);
    }

    /* JADX INFO: renamed from: b */
    public static final String m19196b(String str) {
        String strM20331a;
        StringBuilder sb = new StringBuilder("set");
        if (m19197c(str)) {
            strM20331a = str.substring(2);
            Intrinsics.m18598f(strM20331a, "this as java.lang.String).substring(startIndex)");
        } else {
            strM20331a = CapitalizeDecapitalizeKt.m20331a(str);
        }
        sb.append(strM20331a);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m19197c(String name) {
        Intrinsics.m18599g(name, "name");
        if (StringsKt.m20416N(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (Intrinsics.m18601i(97, cCharAt) > 0 || Intrinsics.m18601i(cCharAt, ModuleDescriptor.MODULE_VERSION) > 0) {
                return true;
            }
        }
        return false;
    }
}
