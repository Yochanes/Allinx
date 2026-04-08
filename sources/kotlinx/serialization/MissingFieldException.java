package kotlinx.serialization;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: a */
    public final ArrayList f56586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(ArrayList missingFields, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        Intrinsics.m18599g(missingFields, "missingFields");
        this.f56586a = missingFields;
    }
}
