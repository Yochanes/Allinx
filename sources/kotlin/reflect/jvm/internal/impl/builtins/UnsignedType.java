package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum UnsignedType {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(ClassId.m19575e("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(ClassId.m19575e("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(ClassId.m19575e("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(ClassId.m19575e("kotlin/ULong", false));


    /* JADX INFO: renamed from: a */
    public final ClassId f52128a;

    /* JADX INFO: renamed from: b */
    public final Name f52129b;

    /* JADX INFO: renamed from: c */
    public final ClassId f52130c;

    UnsignedType(ClassId classId) {
        this.f52128a = classId;
        Name nameM19583i = classId.m19583i();
        Intrinsics.m18598f(nameM19583i, "classId.shortClassName");
        this.f52129b = nameM19583i;
        this.f52130c = new ClassId(classId.m19581g(), Name.m19605e(nameM19583i.m19608b() + "Array"));
    }
}
