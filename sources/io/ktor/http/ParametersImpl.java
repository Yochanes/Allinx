package io.ktor.http;

import io.ktor.util.InternalAPI;
import io.ktor.util.StringValuesImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/ParametersImpl;", "Lio/ktor/http/Parameters;", "Lio/ktor/util/StringValuesImpl;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ParametersImpl extends StringValuesImpl implements Parameters {
    @Override // io.ktor.util.StringValuesImpl
    public final String toString() {
        return "Parameters " + entries();
    }
}
