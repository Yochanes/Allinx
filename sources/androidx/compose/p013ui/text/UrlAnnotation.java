package androidx.compose.p013ui.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@ExperimentalTextApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/UrlAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Deprecated
public final class UrlAnnotation implements AnnotatedString.Annotation {

    /* JADX INFO: renamed from: a */
    public final String f20122a;

    public UrlAnnotation(String str) {
        this.f20122a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UrlAnnotation) {
            return Intrinsics.m18594b(this.f20122a, ((UrlAnnotation) obj).f20122a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20122a.hashCode();
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("UrlAnnotation(url="), this.f20122a, ')');
    }
}
