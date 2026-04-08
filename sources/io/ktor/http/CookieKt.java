package io.ktor.http;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.text.Regex;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class CookieKt {

    /* JADX INFO: renamed from: a */
    public static final Set f45617a = ArraysKt.m18372h0(new String[]{"max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc"});

    /* JADX INFO: renamed from: b */
    public static final Regex f45618b = new Regex("(^|;)\\s*([^()<>@;:/\\\\\"\\[\\]\\?=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    /* JADX INFO: renamed from: c */
    public static final Set f45619c = ArraysKt.m18372h0(new Character[]{';', ',', '\"'});

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CookieEncoding.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[3] = 3;
            iArr[2] = 4;
            int[] iArr2 = new int[CookieEncoding.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
        }
    }
}
