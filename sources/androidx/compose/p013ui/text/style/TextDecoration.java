package androidx.compose.p013ui.text.style;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.util.ListUtilsKt;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextDecoration {

    /* JADX INFO: renamed from: b */
    public static final TextDecoration f20533b = new TextDecoration(0);

    /* JADX INFO: renamed from: c */
    public static final TextDecoration f20534c = new TextDecoration(1);

    /* JADX INFO: renamed from: d */
    public static final TextDecoration f20535d = new TextDecoration(2);

    /* JADX INFO: renamed from: a */
    public final int f20536a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public TextDecoration(int i) {
        this.f20536a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6600a(TextDecoration textDecoration) {
        int i = this.f20536a;
        return (textDecoration.f20536a | i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextDecoration) {
            return this.f20536a == ((TextDecoration) obj).f20536a;
        }
        return false;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF20536a() {
        return this.f20536a;
    }

    public final String toString() {
        int i = this.f20536a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return AbstractC0455a.m2241p(new StringBuilder("TextDecoration["), ListUtilsKt.m6696b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
