package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, m18302d2 = {"Lkotlinx/serialization/descriptors/SerialKind;", "", "ENUM", "CONTEXTUAL", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
public abstract class SerialKind {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @ExperimentalSerializationApi
    public static final class CONTEXTUAL extends SerialKind {

        /* JADX INFO: renamed from: a */
        public static final CONTEXTUAL f56640a = new CONTEXTUAL();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @ExperimentalSerializationApi
    public static final class ENUM extends SerialKind {

        /* JADX INFO: renamed from: a */
        public static final ENUM f56641a = new ENUM();
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String strMo18588i = Reflection.f51660a.mo18612b(getClass()).mo18588i();
        Intrinsics.m18596d(strMo18588i);
        return strMo18588i;
    }
}
