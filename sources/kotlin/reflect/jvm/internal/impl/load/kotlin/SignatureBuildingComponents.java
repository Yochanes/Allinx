package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.p013ui.platform.AbstractC1313i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class SignatureBuildingComponents {
    /* JADX INFO: renamed from: a */
    public static String[] m19407a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: b */
    public static LinkedHashSet m19408b(String internalName, String... signatures) {
        Intrinsics.m18599g(internalName, "internalName");
        Intrinsics.m18599g(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public static LinkedHashSet m19409c(String str, String... signatures) {
        Intrinsics.m18599g(signatures, "signatures");
        return m19408b("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    /* JADX INFO: renamed from: d */
    public static LinkedHashSet m19410d(String str, String... strArr) {
        return m19408b("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: e */
    public static String m19411e(String str, String ret, ArrayList arrayList) {
        Intrinsics.m18599g(ret, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(CollectionsKt.m18409J(arrayList, "", null, null, SignatureBuildingComponents$jvmDescriptor$1.f53274a, 30));
        sb.append(')');
        if (ret.length() > 1) {
            ret = AbstractC1313i.m6244a(';', "L", ret);
        }
        sb.append(ret);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m19412f(String internalName, String jvmDescriptor) {
        Intrinsics.m18599g(internalName, "internalName");
        Intrinsics.m18599g(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
