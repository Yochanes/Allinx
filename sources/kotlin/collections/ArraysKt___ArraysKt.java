package kotlin.collections;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    /* JADX INFO: renamed from: b */
    public static final void m18393b(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        Intrinsics.m18599g(objArr, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            StringsKt.m20433i(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: c */
    public static final void m18394c(Object[] objArr, LinkedHashSet linkedHashSet) {
        Intrinsics.m18599g(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }
}
