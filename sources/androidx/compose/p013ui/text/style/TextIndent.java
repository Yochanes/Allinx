package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextIndent {

    /* JADX INFO: renamed from: c */
    public static final TextIndent f20544c = new TextIndent(0L, 3);

    /* JADX INFO: renamed from: a */
    public final long f20545a;

    /* JADX INFO: renamed from: b */
    public final long f20546b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TextIndent(long j, long j2) {
        this.f20545a = j;
        this.f20546b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.m6673a(this.f20545a, textIndent.f20545a) && TextUnit.m6673a(this.f20546b, textIndent.f20546b);
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.f20574b;
        return Long.hashCode(this.f20546b) + (Long.hashCode(this.f20545a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m6677e(this.f20545a)) + ", restLine=" + ((Object) TextUnit.m6677e(this.f20546b)) + ')';
    }

    public /* synthetic */ TextIndent(long j, int i) {
        this(TextUnitKt.m6680c(0), (i & 2) != 0 ? TextUnitKt.m6680c(0) : j);
    }
}
