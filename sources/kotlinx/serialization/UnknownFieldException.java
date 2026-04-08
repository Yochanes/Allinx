package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.PublishedApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(AbstractC0000a.m9f(i, "An unknown field for index "));
    }
}
