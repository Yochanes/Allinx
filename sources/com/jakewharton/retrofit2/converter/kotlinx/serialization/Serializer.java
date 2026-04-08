package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.StringFormat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer;", "", "FromBytes", "FromString", "Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer$FromBytes;", "Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer$FromString;", "retrofit2-kotlinx-serialization-converter"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class Serializer {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer$FromBytes;", "Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer;", "retrofit2-kotlinx-serialization-converter"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class FromBytes extends Serializer {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer$FromString;", "Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer;", "retrofit2-kotlinx-serialization-converter"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class FromString extends Serializer {

        /* JADX INFO: renamed from: a */
        public final StringFormat f42958a;

        public FromString(StringFormat stringFormat) {
            this.f42958a = stringFormat;
        }

        /* JADX INFO: renamed from: a */
        public final SerialFormat m15319a() {
            return this.f42958a;
        }
    }
}
