package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/Charsets;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class Charsets {

    /* JADX INFO: renamed from: a */
    public static final Charset f55167a;

    /* JADX INFO: renamed from: b */
    public static final Charset f55168b;

    /* JADX INFO: renamed from: c */
    public static volatile Charset f55169c;

    /* JADX INFO: renamed from: d */
    public static volatile Charset f55170d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.m18598f(charsetForName, "forName(...)");
        f55167a = charsetForName;
        Intrinsics.m18598f(Charset.forName("UTF-16"), "forName(...)");
        Intrinsics.m18598f(Charset.forName("UTF-16BE"), "forName(...)");
        Intrinsics.m18598f(Charset.forName("UTF-16LE"), "forName(...)");
        Intrinsics.m18598f(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        Intrinsics.m18598f(charsetForName2, "forName(...)");
        f55168b = charsetForName2;
    }
}
