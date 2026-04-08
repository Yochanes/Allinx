package io.ktor.http.cio;

import com.google.common.net.HttpHeaders;
import io.ktor.http.cio.internals.AsciiCharTree;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/cio/ConnectionOptions;", "", "Companion", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ConnectionOptions {

    /* JADX INFO: renamed from: e */
    public static final ConnectionOptions f45786e;

    /* JADX INFO: renamed from: f */
    public static final ConnectionOptions f45787f;

    /* JADX INFO: renamed from: g */
    public static final AsciiCharTree f45788g;

    /* JADX INFO: renamed from: a */
    public final boolean f45789a;

    /* JADX INFO: renamed from: b */
    public final boolean f45790b;

    /* JADX INFO: renamed from: c */
    public final boolean f45791c;

    /* JADX INFO: renamed from: d */
    public final List f45792d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/ktor/http/cio/ConnectionOptions$Companion;", "", "Lio/ktor/http/cio/internals/AsciiCharTree;", "Lkotlin/Pair;", "", "Lio/ktor/http/cio/ConnectionOptions;", "knownTypes", "Lio/ktor/http/cio/internals/AsciiCharTree;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static ConnectionOptions m17005a(CharSequence charSequence) {
            int i;
            ConnectionOptions connectionOptions = null;
            if (charSequence == null) {
                return null;
            }
            List listM17027b = AsciiCharTree.m17027b(ConnectionOptions.f45788g, charSequence, 0, 0, ConnectionOptions$Companion$parse$known$1.f45795a, 6);
            if (listM17027b.size() == 1) {
                return (ConnectionOptions) ((Pair) listM17027b.get(0)).f51427b;
            }
            int length = charSequence.length();
            ArrayList arrayList = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                while (true) {
                    char cCharAt = charSequence.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != ',') {
                        i3 = i2;
                        i = i3;
                        break;
                    }
                    i2++;
                    if (i2 >= length) {
                        i = i2;
                        break;
                    }
                }
                while (i < length) {
                    char cCharAt2 = charSequence.charAt(i);
                    if (cCharAt2 == ' ' || cCharAt2 == ',') {
                        break;
                    }
                    i++;
                }
                Pair pair = (Pair) CollectionsKt.m18441l0(ConnectionOptions.f45788g.m17028a(charSequence, i3, i, true, ConnectionOptions$Companion$parseSlow$detected$1.f45796a));
                if (pair == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(i3, i).toString());
                } else {
                    Object obj = pair.f51427b;
                    if (connectionOptions == null) {
                        connectionOptions = (ConnectionOptions) obj;
                    } else {
                        connectionOptions = new ConnectionOptions(connectionOptions.f45789a || ((ConnectionOptions) obj).f45789a, connectionOptions.f45790b || ((ConnectionOptions) obj).f45790b, connectionOptions.f45791c || ((ConnectionOptions) obj).f45791c, EmptyList.f51496a);
                    }
                }
                i2 = i;
            }
            if (connectionOptions == null) {
                connectionOptions = ConnectionOptions.f45787f;
            }
            return arrayList == null ? connectionOptions : new ConnectionOptions(connectionOptions.f45789a, connectionOptions.f45790b, connectionOptions.f45791c, arrayList);
        }
    }

    static {
        ConnectionOptions connectionOptions = new ConnectionOptions(14);
        f45786e = connectionOptions;
        ConnectionOptions connectionOptions2 = new ConnectionOptions(13);
        f45787f = connectionOptions2;
        f45788g = AsciiCharTree.Companion.m17030b(CollectionsKt.m18414O(new Pair("close", connectionOptions), new Pair("keep-alive", connectionOptions2), new Pair("upgrade", new ConnectionOptions(11))), ConnectionOptions$Companion$knownTypes$1.f45793a, ConnectionOptions$Companion$knownTypes$2.f45794a);
    }

    public ConnectionOptions(boolean z2, boolean z3, boolean z4, List list) {
        this.f45789a = z2;
        this.f45790b = z3;
        this.f45791c = z4;
        this.f45792d = list;
    }

    /* JADX INFO: renamed from: a */
    public final String m17004a() {
        StringBuilder sb = new StringBuilder();
        List list = this.f45792d;
        ArrayList arrayList = new ArrayList(list.size() + 3);
        if (this.f45789a) {
            arrayList.add("close");
        }
        if (this.f45790b) {
            arrayList.add("keep-alive");
        }
        if (this.f45791c) {
            arrayList.add(HttpHeaders.UPGRADE);
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        CollectionsKt.m18408I(arrayList, sb, null, null, null, null, 126);
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        if (!reflectionFactory.mo18612b(ConnectionOptions.class).equals(reflectionFactory.mo18612b(obj.getClass()))) {
            return false;
        }
        ConnectionOptions connectionOptions = (ConnectionOptions) obj;
        return this.f45789a == connectionOptions.f45789a && this.f45790b == connectionOptions.f45790b && this.f45791c == connectionOptions.f45791c && Intrinsics.m18594b(this.f45792d, connectionOptions.f45792d);
    }

    public final int hashCode() {
        return this.f45792d.hashCode() + ((Boolean.valueOf(this.f45791c).hashCode() + ((Boolean.valueOf(this.f45790b).hashCode() + (Boolean.valueOf(this.f45789a).hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        if (!this.f45792d.isEmpty()) {
            return m17004a();
        }
        boolean z2 = this.f45791c;
        boolean z3 = this.f45790b;
        boolean z4 = this.f45789a;
        return (!z4 || z3 || z2) ? (z4 || !z3 || z2) ? (!z4 && z3 && z2) ? "keep-alive, Upgrade" : m17004a() : "keep-alive" : "close";
    }

    public /* synthetic */ ConnectionOptions(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, EmptyList.f51496a);
    }
}
