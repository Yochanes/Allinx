package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum UnsignedArrayType {
    UBYTEARRAY(ClassId.m19575e("kotlin/UByteArray", false)),
    USHORTARRAY(ClassId.m19575e("kotlin/UShortArray", false)),
    UINTARRAY(ClassId.m19575e("kotlin/UIntArray", false)),
    ULONGARRAY(ClassId.m19575e("kotlin/ULongArray", false));


    /* JADX INFO: renamed from: a */
    public final Name f52126a;

    UnsignedArrayType(ClassId classId) {
        Name nameM19583i = classId.m19583i();
        Intrinsics.m18598f(nameM19583i, "classId.shortClassName");
        this.f52126a = nameM19583i;
    }
}
