package androidx.compose.p013ui.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Clickable", "Url", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class LinkAnnotation implements AnnotatedString.Annotation {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "Landroidx/compose/ui/text/LinkAnnotation;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Clickable extends LinkAnnotation {

        /* JADX INFO: renamed from: a */
        public final String f19928a;

        /* JADX INFO: renamed from: b */
        public final TextLinkStyles f19929b;

        /* JADX INFO: renamed from: c */
        public final LinkInteractionListener f19930c;

        public Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            this.f19928a = str;
            this.f19929b = textLinkStyles;
            this.f19930c = linkInteractionListener;
        }

        @Override // androidx.compose.p013ui.text.LinkAnnotation
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LinkInteractionListener getF19930c() {
            return this.f19930c;
        }

        @Override // androidx.compose.p013ui.text.LinkAnnotation
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextLinkStyles getF19932b() {
            return this.f19929b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            if (!Intrinsics.m18594b(this.f19928a, clickable.f19928a)) {
                return false;
            }
            if (Intrinsics.m18594b(this.f19929b, clickable.f19929b)) {
                return Intrinsics.m18594b(this.f19930c, clickable.f19930c);
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f19928a.hashCode() * 31;
            TextLinkStyles textLinkStyles = this.f19929b;
            int iHashCode2 = (iHashCode + (textLinkStyles != null ? textLinkStyles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = this.f19930c;
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public final String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f19928a, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Url;", "Landroidx/compose/ui/text/LinkAnnotation;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Url extends LinkAnnotation {

        /* JADX INFO: renamed from: a */
        public final String f19931a;

        /* JADX INFO: renamed from: b */
        public final TextLinkStyles f19932b;

        public Url(String str, TextLinkStyles textLinkStyles) {
            this.f19931a = str;
            this.f19932b = textLinkStyles;
        }

        @Override // androidx.compose.p013ui.text.LinkAnnotation
        /* JADX INFO: renamed from: a */
        public final LinkInteractionListener getF19930c() {
            return null;
        }

        @Override // androidx.compose.p013ui.text.LinkAnnotation
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextLinkStyles getF19932b() {
            return this.f19932b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return this.f19931a.equals(url.f19931a) && Intrinsics.m18594b(this.f19932b, url.f19932b);
        }

        public final int hashCode() {
            int iHashCode = this.f19931a.hashCode() * 31;
            TextLinkStyles textLinkStyles = this.f19932b;
            return (iHashCode + (textLinkStyles != null ? textLinkStyles.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("LinkAnnotation.Url(url="), this.f19931a, ')');
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract LinkInteractionListener getF19930c();

    /* JADX INFO: renamed from: b */
    public abstract TextLinkStyles getF19932b();
}
