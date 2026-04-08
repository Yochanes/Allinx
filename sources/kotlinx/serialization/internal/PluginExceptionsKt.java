package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-serialization-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class PluginExceptionsKt {
    /* JADX INFO: renamed from: a */
    public static final void m21021a(int i, int i2, SerialDescriptor descriptor) {
        Intrinsics.m18599g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.mo20943f(i4));
            }
            i3 >>>= 1;
        }
        String serialName = descriptor.getF56749a();
        Intrinsics.m18599g(serialName, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
