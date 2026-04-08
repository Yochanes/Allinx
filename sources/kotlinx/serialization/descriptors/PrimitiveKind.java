package kotlinx.serialization.descriptors;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "BOOLEAN", "BYTE", "CHAR", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "STRING", "Lkotlinx/serialization/descriptors/PrimitiveKind$BOOLEAN;", "Lkotlinx/serialization/descriptors/PrimitiveKind$BYTE;", "Lkotlinx/serialization/descriptors/PrimitiveKind$CHAR;", "Lkotlinx/serialization/descriptors/PrimitiveKind$DOUBLE;", "Lkotlinx/serialization/descriptors/PrimitiveKind$FLOAT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$INT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$LONG;", "Lkotlinx/serialization/descriptors/PrimitiveKind$SHORT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$STRING;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class PrimitiveKind extends SerialKind {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$BOOLEAN;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class BOOLEAN extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final BOOLEAN f56613a = new BOOLEAN();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$BYTE;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class BYTE extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final BYTE f56614a = new BYTE();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$CHAR;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class CHAR extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final CHAR f56615a = new CHAR();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$DOUBLE;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DOUBLE extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final DOUBLE f56616a = new DOUBLE();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$FLOAT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class FLOAT extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final FLOAT f56617a = new FLOAT();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$INT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class INT extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final INT f56618a = new INT();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$LONG;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class LONG extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final LONG f56619a = new LONG();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$SHORT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SHORT extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final SHORT f56620a = new SHORT();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$STRING;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class STRING extends PrimitiveKind {

        /* JADX INFO: renamed from: a */
        public static final STRING f56621a = new STRING();
    }
}
