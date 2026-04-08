package io.ktor.http.cio.websocket;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalWebSocketExtensionApi
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\rJ\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m18302d2 = {"Lio/ktor/http/cio/websocket/WebSocketExtensionHeader;", "", "name", "", "parameters", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getParameters", "()Ljava/util/List;", "parametersToString", "parseParameters", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "toString", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class WebSocketExtensionHeader {

    @NotNull
    private final String name;

    @NotNull
    private final List<String> parameters;

    /* JADX INFO: renamed from: io.ktor.http.cio.websocket.WebSocketExtensionHeader$parseParameters$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Lkotlin/Pair;", "", "it", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class C59191 extends Lambda implements Function1<String, Pair<? extends String, ? extends String>> {
        public static final C59191 INSTANCE = new C59191();

        public C59191() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((String) obj);
        }

        @NotNull
        public final Pair<String, String> invoke(@NotNull String it) {
            Intrinsics.m18599g(it, "it");
            int iM20445u = StringsKt.m20445u(it, '=', 0, 6);
            String strSubstring = "";
            if (iM20445u < 0) {
                return new Pair<>(it, "");
            }
            IntRange range = RangesKt.m18664k(0, iM20445u);
            Intrinsics.m18599g(range, "range");
            String strSubstring2 = it.substring(range.f51685a, range.f51686b + 1);
            Intrinsics.m18598f(strSubstring2, "substring(...)");
            int i = iM20445u + 1;
            if (i < it.length()) {
                strSubstring = it.substring(i);
                Intrinsics.m18598f(strSubstring, "(this as java.lang.String).substring(startIndex)");
            }
            return new Pair<>(strSubstring2, strSubstring);
        }
    }

    public WebSocketExtensionHeader(@NotNull String name, @NotNull List<String> parameters) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(parameters, "parameters");
        this.name = name;
        this.parameters = parameters;
    }

    private final String parametersToString() {
        if (this.parameters.isEmpty()) {
            return "";
        }
        return ", " + CollectionsKt.m18409J(this.parameters, ",", null, null, null, 62);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Sequence<Pair<String, String>> parseParameters() {
        return SequencesKt.m20372n(CollectionsKt.m18444n(this.parameters), C59191.INSTANCE);
    }

    @NotNull
    public String toString() {
        return this.name + ' ' + parametersToString();
    }
}
