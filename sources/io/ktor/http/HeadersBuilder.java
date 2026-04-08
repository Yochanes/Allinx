package io.ktor.http;

import io.ktor.util.StringValuesBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/HeadersBuilder;", "Lio/ktor/util/StringValuesBuilder;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HeadersBuilder extends StringValuesBuilder {
    @Override // io.ktor.util.StringValuesBuilder
    /* JADX INFO: renamed from: f */
    public final void mo16965f(String name) {
        Intrinsics.m18599g(name, "name");
        List list = HttpHeaders.f45661a;
        int i = 0;
        int i2 = 0;
        while (i < name.length()) {
            char cCharAt = name.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.m18601i(cCharAt, 32) <= 0 || StringsKt.m20435k("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                StringBuilder sbM23t = AbstractC0000a.m23t("Header name '", name, "' contains illegal character '");
                sbM23t.append(name.charAt(i2));
                sbM23t.append("' (code ");
                throw new IllegalHeaderNameException(AbstractC0000a.m17n(sbM23t, name.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }

    @Override // io.ktor.util.StringValuesBuilder
    /* JADX INFO: renamed from: g */
    public final void mo16966g(String value) {
        Intrinsics.m18599g(value, "value");
        List list = HttpHeaders.f45661a;
        int i = 0;
        int i2 = 0;
        while (i < value.length()) {
            char cCharAt = value.charAt(i);
            int i3 = i2 + 1;
            if (cCharAt != ' ' && cCharAt != '\t' && Intrinsics.m18601i(cCharAt, 32) < 0) {
                StringBuilder sbM23t = AbstractC0000a.m23t("Header value '", value, "' contains illegal character '");
                sbM23t.append(value.charAt(i2));
                sbM23t.append("' (code ");
                throw new IllegalHeaderValueException(AbstractC0000a.m17n(sbM23t, value.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final HeadersImpl m16967h() {
        if (this.f46489b) {
            throw new IllegalArgumentException("HeadersBuilder can only build a single Headers instance");
        }
        this.f46489b = true;
        return new HeadersImpl(this.f46488a);
    }
}
