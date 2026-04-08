package okhttp3;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/CipherSuite;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class CipherSuite {

    /* JADX INFO: renamed from: b */
    public static final Companion f57041b;

    /* JADX INFO: renamed from: c */
    public static final CipherSuite$Companion$ORDER_BY_NAME$1 f57042c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f57043d;

    /* JADX INFO: renamed from: e */
    public static final CipherSuite f57044e;

    /* JADX INFO: renamed from: f */
    public static final CipherSuite f57045f;

    /* JADX INFO: renamed from: g */
    public static final CipherSuite f57046g;

    /* JADX INFO: renamed from: h */
    public static final CipherSuite f57047h;

    /* JADX INFO: renamed from: i */
    public static final CipherSuite f57048i;

    /* JADX INFO: renamed from: j */
    public static final CipherSuite f57049j;

    /* JADX INFO: renamed from: k */
    public static final CipherSuite f57050k;

    /* JADX INFO: renamed from: l */
    public static final CipherSuite f57051l;

    /* JADX INFO: renamed from: m */
    public static final CipherSuite f57052m;

    /* JADX INFO: renamed from: n */
    public static final CipherSuite f57053n;

    /* JADX INFO: renamed from: o */
    public static final CipherSuite f57054o;

    /* JADX INFO: renamed from: p */
    public static final CipherSuite f57055p;

    /* JADX INFO: renamed from: q */
    public static final CipherSuite f57056q;

    /* JADX INFO: renamed from: r */
    public static final CipherSuite f57057r;

    /* JADX INFO: renamed from: s */
    public static final CipherSuite f57058s;

    /* JADX INFO: renamed from: t */
    public static final CipherSuite f57059t;

    /* JADX INFO: renamed from: a */
    public final String f57060a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b{\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\bR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\bR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\bR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\bR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\bR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\bR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\bR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\bR\u0014\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u0014\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\bR\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\bR\u0014\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\bR\u0014\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\bR\u0014\u0010-\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\bR\u0014\u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\bR\u0014\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u0014\u00100\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\bR\u0014\u00101\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\bR\u0014\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\bR\u0014\u00103\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\bR\u0014\u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\bR\u0014\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\bR\u0014\u00106\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\bR\u0014\u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\bR\u0014\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\bR\u0014\u00109\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\bR\u0014\u0010:\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\bR\u0014\u0010;\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\bR\u0014\u0010<\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\bR\u0014\u0010=\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\bR\u0014\u0010>\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\bR\u0014\u0010?\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\bR\u0014\u0010@\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\bR\u0014\u0010A\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\bR\u0014\u0010B\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\bR\u0014\u0010C\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\bR\u0014\u0010D\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\bR\u0014\u0010E\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\bR\u0014\u0010F\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\bR\u0014\u0010G\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\bR\u0014\u0010H\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\bR\u0014\u0010I\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\bR\u0014\u0010J\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\bR\u0014\u0010K\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\bR\u0014\u0010L\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\bR\u0014\u0010M\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\bR\u0014\u0010N\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\bR\u0014\u0010O\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\bR\u0014\u0010P\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\bR\u0014\u0010Q\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\bR\u0014\u0010R\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\bR\u0014\u0010S\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\bR\u0014\u0010T\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\bR\u0014\u0010U\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\bR\u0014\u0010V\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\bR\u0014\u0010W\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\bR\u0014\u0010X\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\bR\u0014\u0010Y\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\bR\u0014\u0010Z\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\bR\u0014\u0010[\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\bR\u0014\u0010\\\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\bR\u0014\u0010]\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\bR\u0014\u0010^\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\bR\u0014\u0010_\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\bR\u0014\u0010`\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\bR\u0014\u0010a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\bR\u0014\u0010b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\bR\u0014\u0010c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\bR\u0014\u0010d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\bR\u0014\u0010e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\bR\u0014\u0010f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\bR\u0014\u0010g\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\bR\u0014\u0010h\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\bR\u0014\u0010i\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\bR\u0014\u0010j\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\bR\u0014\u0010k\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\bR\u0014\u0010l\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\bR\u0014\u0010m\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\bR\u0014\u0010n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\bR\u0014\u0010o\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\bR\u0014\u0010p\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\bR\u0014\u0010q\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\bR\u0014\u0010r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\bR\u0014\u0010s\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\bR\u0014\u0010t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\bR\u0014\u0010u\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\bR\u0014\u0010v\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\bR\u0014\u0010w\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\bR\u0014\u0010x\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\bR\u0014\u0010y\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\bR\u0014\u0010z\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\bR\u0014\u0010{\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\bR\u0014\u0010|\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\bR\u0014\u0010}\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\bR\u0014\u0010~\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\b¨\u0006\u007f"}, m18302d2 = {"Lokhttp3/CipherSuite$Companion;", "", "", "", "Lokhttp3/CipherSuite;", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lokhttp3/CipherSuite;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final CipherSuite m21191a(Companion companion, String str) {
            CipherSuite cipherSuite = new CipherSuite(str);
            CipherSuite.f57043d.put(str, cipherSuite);
            return cipherSuite;
        }

        /* JADX INFO: renamed from: b */
        public final synchronized CipherSuite m21192b(String javaName) {
            CipherSuite cipherSuite;
            String strConcat;
            try {
                Intrinsics.m18599g(javaName, "javaName");
                LinkedHashMap linkedHashMap = CipherSuite.f57043d;
                cipherSuite = (CipherSuite) linkedHashMap.get(javaName);
                if (cipherSuite == null) {
                    if (StringsKt.m20416N(javaName, "TLS_", false)) {
                        String strSubstring = javaName.substring(4);
                        Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
                        strConcat = "SSL_".concat(strSubstring);
                    } else if (StringsKt.m20416N(javaName, "SSL_", false)) {
                        String strSubstring2 = javaName.substring(4);
                        Intrinsics.m18598f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                        strConcat = "TLS_".concat(strSubstring2);
                    } else {
                        strConcat = javaName;
                    }
                    cipherSuite = (CipherSuite) linkedHashMap.get(strConcat);
                    if (cipherSuite == null) {
                        cipherSuite = new CipherSuite(javaName);
                    }
                    linkedHashMap.put(javaName, cipherSuite);
                }
            } catch (Throwable th) {
                throw th;
            }
            return cipherSuite;
        }
    }

    static {
        Companion companion = new Companion();
        f57041b = companion;
        f57042c = new CipherSuite$Companion$ORDER_BY_NAME$1();
        f57043d = new LinkedHashMap();
        Companion.m21191a(companion, "SSL_RSA_WITH_NULL_MD5");
        Companion.m21191a(companion, "SSL_RSA_WITH_NULL_SHA");
        Companion.m21191a(companion, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        Companion.m21191a(companion, "SSL_RSA_WITH_RC4_128_MD5");
        Companion.m21191a(companion, "SSL_RSA_WITH_RC4_128_SHA");
        Companion.m21191a(companion, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        Companion.m21191a(companion, "SSL_RSA_WITH_DES_CBC_SHA");
        f57044e = Companion.m21191a(companion, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        Companion.m21191a(companion, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        Companion.m21191a(companion, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        Companion.m21191a(companion, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        Companion.m21191a(companion, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        Companion.m21191a(companion, "SSL_DH_anon_WITH_RC4_128_MD5");
        Companion.m21191a(companion, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        Companion.m21191a(companion, "SSL_DH_anon_WITH_DES_CBC_SHA");
        Companion.m21191a(companion, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "TLS_KRB5_WITH_DES_CBC_SHA");
        Companion.m21191a(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "TLS_KRB5_WITH_RC4_128_SHA");
        Companion.m21191a(companion, "TLS_KRB5_WITH_DES_CBC_MD5");
        Companion.m21191a(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        Companion.m21191a(companion, "TLS_KRB5_WITH_RC4_128_MD5");
        Companion.m21191a(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        Companion.m21191a(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        Companion.m21191a(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        Companion.m21191a(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f57045f = Companion.m21191a(companion, "TLS_RSA_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f57046g = Companion.m21191a(companion, "TLS_RSA_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_RSA_WITH_NULL_SHA256");
        Companion.m21191a(companion, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        Companion.m21191a(companion, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        Companion.m21191a(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        Companion.m21191a(companion, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        Companion.m21191a(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        Companion.m21191a(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        Companion.m21191a(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        Companion.m21191a(companion, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_PSK_WITH_RC4_128_SHA");
        Companion.m21191a(companion, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "TLS_PSK_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_PSK_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_RSA_WITH_SEED_CBC_SHA");
        f57047h = Companion.m21191a(companion, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f57048i = Companion.m21191a(companion, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        Companion.m21191a(companion, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        Companion.m21191a(companion, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        Companion.m21191a(companion, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        Companion.m21191a(companion, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        Companion.m21191a(companion, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        Companion.m21191a(companion, "TLS_FALLBACK_SCSV");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_NULL_SHA");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f57049j = Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f57050k = Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDH_anon_WITH_NULL_SHA");
        Companion.m21191a(companion, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        Companion.m21191a(companion, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f57051l = Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f57052m = Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        Companion.m21191a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f57053n = Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f57054o = Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        Companion.m21191a(companion, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        Companion.m21191a(companion, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        Companion.m21191a(companion, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f57055p = Companion.m21191a(companion, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f57056q = Companion.m21191a(companion, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        Companion.m21191a(companion, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        Companion.m21191a(companion, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f57057r = Companion.m21191a(companion, "TLS_AES_128_GCM_SHA256");
        f57058s = Companion.m21191a(companion, "TLS_AES_256_GCM_SHA384");
        f57059t = Companion.m21191a(companion, "TLS_CHACHA20_POLY1305_SHA256");
        Companion.m21191a(companion, "TLS_AES_128_CCM_SHA256");
        Companion.m21191a(companion, "TLS_AES_128_CCM_8_SHA256");
    }

    public CipherSuite(String str) {
        this.f57060a = str;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF57060a() {
        return this.f57060a;
    }
}
