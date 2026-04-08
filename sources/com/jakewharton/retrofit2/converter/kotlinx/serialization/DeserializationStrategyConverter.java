package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0004"}, m18302d2 = {"Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/DeserializationStrategyConverter;", "T", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "retrofit2-kotlinx-serialization-converter"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DeserializationStrategyConverter<T> implements Converter<ResponseBody, T> {

    /* JADX INFO: renamed from: a */
    public final DeserializationStrategy f42951a;

    /* JADX INFO: renamed from: b */
    public final Serializer.FromString f42952b;

    public DeserializationStrategyConverter(DeserializationStrategy deserializationStrategy, Serializer.FromString fromString) {
        this.f42951a = deserializationStrategy;
        this.f42952b = fromString;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) throws IOException {
        ResponseBody value = (ResponseBody) obj;
        Intrinsics.m18599g(value, "value");
        Serializer.FromString fromString = this.f42952b;
        return ((Json) fromString.f42958a).m21054b(this.f42951a, value.m21313g());
    }
}
