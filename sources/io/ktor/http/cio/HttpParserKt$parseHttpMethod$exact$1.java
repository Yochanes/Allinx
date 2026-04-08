package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "ch", "", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpParserKt$parseHttpMethod$exact$1 extends Lambda implements Function2<Character, Integer, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final HttpParserKt$parseHttpMethod$exact$1 f45819a = new HttpParserKt$parseHttpMethod$exact$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        char cCharValue = ((Character) obj).charValue();
        ((Number) obj2).intValue();
        return Boolean.valueOf(cCharValue == ' ');
    }
}
