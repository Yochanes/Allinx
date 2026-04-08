package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lkotlinx/serialization/descriptors/StructureKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "CLASS", "LIST", "MAP", "OBJECT", "Lkotlinx/serialization/descriptors/StructureKind$CLASS;", "Lkotlinx/serialization/descriptors/StructureKind$LIST;", "Lkotlinx/serialization/descriptors/StructureKind$MAP;", "Lkotlinx/serialization/descriptors/StructureKind$OBJECT;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
public abstract class StructureKind extends SerialKind {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/StructureKind$CLASS;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class CLASS extends StructureKind {

        /* JADX INFO: renamed from: a */
        public static final CLASS f56642a = new CLASS();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/StructureKind$LIST;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class LIST extends StructureKind {

        /* JADX INFO: renamed from: a */
        public static final LIST f56643a = new LIST();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/StructureKind$MAP;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class MAP extends StructureKind {

        /* JADX INFO: renamed from: a */
        public static final MAP f56644a = new MAP();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/StructureKind$OBJECT;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class OBJECT extends StructureKind {

        /* JADX INFO: renamed from: a */
        public static final OBJECT f56645a = new OBJECT();
    }
}
