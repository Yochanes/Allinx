package io.ktor.utils.p043io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/ByteOrder;", "", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ByteOrder {

    /* JADX INFO: renamed from: b */
    public static final ByteOrder f47356b;

    /* JADX INFO: renamed from: c */
    public static final ByteOrder f47357c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ByteOrder[] f47358d;

    /* JADX INFO: renamed from: a */
    public final java.nio.ByteOrder f47359a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/utils/io/core/ByteOrder$Companion;", "", "Lio/ktor/utils/io/core/ByteOrder;", "native", "Lio/ktor/utils/io/core/ByteOrder;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        Intrinsics.m18598f(byteOrder, "java.nio.ByteOrder.BIG_ENDIAN");
        ByteOrder byteOrder2 = new ByteOrder("BIG_ENDIAN", 0, byteOrder);
        f47356b = byteOrder2;
        java.nio.ByteOrder byteOrder3 = java.nio.ByteOrder.LITTLE_ENDIAN;
        Intrinsics.m18598f(byteOrder3, "java.nio.ByteOrder.LITTLE_ENDIAN");
        ByteOrder byteOrder4 = new ByteOrder("LITTLE_ENDIAN", 1, byteOrder3);
        f47357c = byteOrder4;
        f47358d = new ByteOrder[]{byteOrder2, byteOrder4};
        Intrinsics.m18598f(java.nio.ByteOrder.nativeOrder(), "java.nio.ByteOrder.nativeOrder()");
    }

    public ByteOrder(String str, int i, java.nio.ByteOrder byteOrder) {
        this.f47359a = byteOrder;
    }

    public static ByteOrder valueOf(String str) {
        return (ByteOrder) Enum.valueOf(ByteOrder.class, str);
    }

    public static ByteOrder[] values() {
        return (ByteOrder[]) f47358d.clone();
    }
}
